package org.oasis.oslcop.sysml.services;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFReader;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.store.Store;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.SysmlServerManager;
import org.oasis.oslcop.sysml.json.Project;
import org.oasis.oslcop.sysml.json.ProjectCommit;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.Element;

@Path("populate")
public class PopulationService
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;

    private static final Logger log = LoggerFactory.getLogger(PopulationService.class);

    //TODO: Throughout this class, need better way to construct the URIs. Use UriBuilder.
    private static String JSON_SERVER_SCHEME;
    private static String JSON_SERVER_HOSTNAME;
    private static int JSON_SERVER_PORT;

    private static String OSLC_SERVER_SCHEME;
    private static String OSLC_SERVER_HOSTNAME;
    private static int OSLC_SERVER_PORT;
    private static String OSLC_SERVER_APPLICATION_PATH;

    static {
        Properties jsonServerProperties = new Properties();
        String jsonServerPropertiesFile = PopulationService.class.getResource("/jsonServer.properties").getFile();
        try {
            jsonServerProperties.load(new FileInputStream(jsonServerPropertiesFile));
        } catch (IOException e) {
            log.error("Failed to open the 'jsonServer' properties file.", e);
            throw new RuntimeException(e);
        }
        JSON_SERVER_SCHEME = jsonServerProperties.getProperty("jsonServerScheme");
        JSON_SERVER_HOSTNAME = jsonServerProperties.getProperty("jsonServerHostname");
        JSON_SERVER_PORT = Integer.parseInt(jsonServerProperties.getProperty("jsonServerPort"));
        
        String servletURI = OSLC4JUtils.getServletURI();
        OSLC_SERVER_SCHEME = URI.create(servletURI).getScheme();
        OSLC_SERVER_HOSTNAME = URI.create(servletURI).getHost();
        OSLC_SERVER_PORT = URI.create(servletURI).getPort();
        OSLC_SERVER_APPLICATION_PATH = URI.create(servletURI).getPath();
    }
    
    public PopulationService() {
        super();
    }

    //TODO: There are a lot of methods here that need to be made neater. Many hacks and hard-coded constants.
	static URI translateBack(URI uri) {
		if (!uri.getHost().equalsIgnoreCase(OSLC_SERVER_HOSTNAME)) {
			return uri;
		}
		
		String oldPath = uri.getPath();
		String newPath = oldPath.substring(OSLC_SERVER_APPLICATION_PATH.length() - 1, oldPath.length());
		URI translated = UriBuilder.fromUri(uri)
		        .scheme(JSON_SERVER_SCHEME)
				.host(JSON_SERVER_HOSTNAME)
				.port(JSON_SERVER_PORT)
				.replacePath(newPath)
				.build();
		return translated;
	}

	static URI translate(URI uri) {
		if (!uri.getHost().equalsIgnoreCase(JSON_SERVER_HOSTNAME)) {
			return uri;
		}
		String oldPath = uri.getPath();
		URI translated = UriBuilder.fromUri(uri)
                .scheme(OSLC_SERVER_SCHEME)
				.host(OSLC_SERVER_HOSTNAME)
				.port(OSLC_SERVER_PORT)
				.replacePath(OSLC_SERVER_APPLICATION_PATH)
				.path(oldPath)
				.build();
		return translated;
	}

	void translateObjectUris(Model model) {
		StmtIterator statements = model.listStatements();
		List<Statement> statementsToChange = new ArrayList<Statement>();
		
		while (statements.hasNext()) {
		    Statement statement      = statements.nextStatement();
		    RDFNode   object    = statement.getObject();
		    if (object instanceof Resource) {
		    	statementsToChange.add(statement);
		    } 
		}
		
		for (Statement statementToChange : statementsToChange) {
		    Resource object    = statementToChange.getResource();
	    	String newUri = translate(URI.create(object.getURI())).toString();
	    	statementToChange.changeObject(model.createResource(newUri));
		}
	}

    public static List<Project> getProjects() {
        List<Project> projects = new ArrayList<Project>();
		try {
    		String url = "http://" + JSON_SERVER_HOSTNAME + ":" + JSON_SERVER_PORT + "/projects";
    		CloseableHttpClient httpclient = HttpClients.createDefault();
    		HttpGet httpget = new HttpGet(url);
    		CloseableHttpResponse response;
			response = httpclient.execute(httpget);
    		if (response != null && response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
    			InputStream content = response.getEntity().getContent();
    	    	ObjectMapper mapper = new ObjectMapper();
    			projects = mapper.readValue(content, new TypeReference<List<Project>>() {});
    		} else {
    			throw new WebApplicationException(response.getStatusLine().getStatusCode());
    		}
		} catch (IOException e) {
			log.error("cannot get Projects", e);
		}
        return projects;
    }

    public static List<ProjectCommit> getProjectCommits(Project project) {
        List<ProjectCommit> projectCommits = new ArrayList<ProjectCommit>();
		try {
    		String url = "http://" + JSON_SERVER_HOSTNAME + ":" + JSON_SERVER_PORT + "/projects/" + project.getId() + "/commits";
    		CloseableHttpClient httpclient = HttpClients.createDefault();
    		HttpGet httpget = new HttpGet(url);
    		CloseableHttpResponse response;
			response = httpclient.execute(httpget);
    		if (response != null && response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
    			InputStream content = response.getEntity().getContent();
    	    	ObjectMapper mapper = new ObjectMapper();
    			projectCommits = mapper.readValue(content, new TypeReference<List<ProjectCommit>>() {});
    		} else {
    			throw new WebApplicationException(response.getStatusLine().getStatusCode());
    		}
		} catch (IOException e) {
			log.error("cannot get Project commits", e);
		}
        return projectCommits;
    }

	public static List<ObjectNode> getElements(String projectCommitElementsUrl) {
        List<ObjectNode> elements = new ArrayList<ObjectNode>();
    	ObjectMapper mapper = new ObjectMapper();
        Boolean readFromFile = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(projectCommitElementsUrl);
        try {
            CloseableHttpResponse response = httpclient.execute(httpget);
            if (response != null && response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                InputStream content = response.getEntity().getContent();
                elements = mapper.readValue(content, new TypeReference<List<ObjectNode>>() {});
            } else {
                log.error("Could not run GET query on the REST server. Server returns status:" + response.getStatusLine().getStatusCode());
            }
        } catch (IOException e) {
            log.error("Could not run GET query on the REST server", e);
        }
        return elements;
    }

    private List<Element> storeElements(String projectCommitElementsUrl) throws IOException, ServletException {
    	int elementsLimit = 99999;
    	Store store = SysmlServerManager.getStorePool().getStore();
    	
    	List<Element> resources = new ArrayList<Element>();
    	List<ObjectNode> elementsAsJson = new ArrayList<ObjectNode>();
    	ObjectMapper mapper = new ObjectMapper();
		elementsAsJson = getElements(projectCommitElementsUrl);
		int count = 0;
		for (ObjectNode elementAsJson : elementsAsJson) {
			count++;
			if (count > elementsLimit) {
				break;
			}
			final Model model = ModelFactory.createDefaultModel();
			RDFReader reader = model.getReader("JSON-LD");
			try {
				InputStream elementAsStream = new ByteArrayInputStream(mapper.writeValueAsBytes(elementAsJson));
				reader.read(model, elementAsStream, "");
			} catch (JsonProcessingException e) {
				log.error("Could not read the json data. Skipping element", e);
				continue;
			}
		
			//All I have to do is to add "Element" as an RDF type. JMH will then return an instance of the exact subclass of Element, depending on the other rdf:types specified.
			//JMH will populate the attributes exactly as expected!!!!
			//So, I just have to populate the LyoStore with that info!!!
			model.add(model.createStatement(model.listSubjects().next(), RDF.type, model.createResource(SysmlDomainConstants.ELEMENT_TYPE)));
			translateObjectUris(model);
			try {
				Element element =  JenaModelHelper.unmarshalSingle(model, Element.class);
				//Manipulate the element so that it has a URI on this server.
				//Also add any missing properties that we expect. For example, the AM:resource properties, such as am:identifier.
				//Also, set the shotTitle, since we will use that display each element.
				element.setAbout(translate(element.getAbout()));
				element.setIdentifier(element.getSysmlIdentifier());
				if (null == element.getName()) {
	                element.setShortTitle("identifier: " + element.getIdentifier());
				}
				else {
	                element.setShortTitle(element.getName());
				}
				resources.add(element);
				store.insertResources(SysmlServerManager.getStorePool().getDefaultNamedGraphUri(), element);
				log.info("resource inserted into store:" + element.getAbout());
			} catch (Exception e) {
				//TODO: I am getting exceptions because the class property is meant to be Boolean, yet the RDF is NOT boolean? 
				//WHY? I think I am ignoring mapping of enum attributes, which then default to Boolean in the adaptormodel.
				log.error("Could not unmarshal model. Skipping element for now. Problem to be solved. See comments in code", e);
				continue;
			}
		}
        return resources;
    }

    @GET
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON})
    public Response storeElements() throws IOException, ServletException {

        int serviceProviderLimit = 99;
		int count = 0;

        log.info("Starting to populate.");

		//TODO: This will fail unless the SPC is already initialized. But will do for now.
    	ServiceProvider[] serviceProviders = ServiceProviderCatalogSingleton.getServiceProviders(null);
    	for (ServiceProvider serviceProvider : serviceProviders) {
            log.info("Populating on ServiceProvider:" + serviceProvider.getAbout());
			count++;
			if (count > serviceProviderLimit) {
				break;
			}
    		//"http://sysml2-dev.intercax.com:9000/projects/aa593ac6-f6f8-4794-926f-6911f1966dff/commits/21bda0aa-92da-416d-8f03-2b7c7f5a3de5/elements";
    		String projectCommitElementsUrl = translateBack(serviceProvider.getAbout()).toString() + "/elements";
            storeElements(projectCommitElementsUrl);
            log.info("Ended populating on ServiceProvider:" + serviceProvider.getAbout());
		}
        log.info("Ended population.");
        return Response.ok().build();
    }
}
