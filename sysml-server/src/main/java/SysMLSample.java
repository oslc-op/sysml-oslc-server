import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;

import org.apache.http.HttpStatus;
import org.apache.jena.datatypes.BaseDatatype.TypedValue;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFReader;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.eclipse.lyo.oslc4j.client.OslcClient;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.oasis.oslcop.sysml.resources.Element;

public class SysMLSample {

	public static void main(String[] args) {
		// Because SysML v2 Services REST API is returning SysML specific subtypes for
		// @type, not including Element
		try {
			Element aResource = null;
			OslcClient apiClient = new OslcClient();
			String url = "http://sysml2-dev.intercax.com:9000/projects/aa593ac6-f6f8-4794-926f-6911f1966dff/commits/21bda0aa-92da-416d-8f03-2b7c7f5a3de5/elements/9d5b1ef4-ad01-4496-a392-e66fb2aa60ff";
			URI fromBase = URI.create("http://sysml2-dev.intercax.com:9000");
			URI toBase = URI.create("https://jamsden.rtp.raleigh.ibm.com:8443/sysml/services/crud");
			Response response = apiClient.getResource(url, "application/ld+json");
			Map<QName,Object>  extProps = null;

			if (response != null && response.getStatus() == HttpStatus.SC_OK) {
				OSLC4JUtils.setUseBeanClassForParsing("true");
				final Model model = ModelFactory.createDefaultModel();
				RDFReader reader = model.getReader("JSON-LD");

				reader.read(model, (InputStream)response.getEntity(), "");

				// Translate the URIs to those of the adapting OSLC server
				StmtIterator statements = model.listStatements();
				List<Statement> toRemove = new ArrayList<Statement>();
				List<Statement> toAdd = new ArrayList<Statement>();
				for (Statement s; statements.hasNext(); ) {
					s = statements.next();
					RDFNode o = s.getObject();
					if (o.isURIResource()) {
						URI aURI = URI.create(o.asResource().getURI());
						String newURI = translate(aURI, fromBase, toBase).toString();
						toAdd.add(model.createStatement(s.getSubject(), s.getPredicate(), model.createResource(newURI)));
						toRemove.add(s);
					}
				}
				model.remove(toRemove);
				model.add(toAdd);
				
				// Get the actual @type, some SysML subclass of Element
				Resource resource = (Resource)model.getResource(url);
				Property rdfType = model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#","type");
				String atType = resource.getProperty(rdfType).getObject().toString();
				
				Object[] elements =  JenaModelHelper.unmarshal(model, Element.class);
				
				if (elements.length > 0) aResource = (Element)elements[0]; 
				// Translate the Element URL
				aResource.setAbout(translate(aResource.getAbout(), fromBase, toBase));
				
				//aResource = response.readEntity(Element.class);
				// add the specific @type subclass  
				aResource.addType(atType);

				// Add the dcterms:identifier
				extProps = aResource.getExtendedProperties();
				String identifier = ((TypedValue)extProps.get(new QName("http://omg.org/ns/sysml#","identifier"))).lexicalValue;
				aResource.setIdentifier(identifier);
				//translateBaseURI(aResource, fromBase, toBase);
			} else {
				throw new WebApplicationException(response.getStatus());
			}
			System.out.println(response.getStatus());
			System.out.println(aResource.getAbout());
			System.out.println(aResource);
			System.out.println(aResource.getType());
			for (QName qName : extProps.keySet()) {
				System.out.println("  Key: " + qName.toString() + "(" + extProps.get(qName).getClass() + ")" + " Value: "+ extProps.get(qName));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static URI translate(URI uri, URI fromBase, URI toBase) {
		String newURI = uri.toString();
		if (newURI.startsWith(fromBase.toString())) {
			newURI = toBase + uri.getPath();
			newURI = newURI.replaceFirst("commits/.*/elements", "Element");
		}
		return URI.create(newURI);
	}

	static void translateBaseURI(Element element, URI fromBase, URI toBase) {
		element.setAbout(translate(element.getAbout(), fromBase, toBase));
		Map<QName, Object> extProps = element.getExtendedProperties();
		Set<Link> links = element.getOwnedRelationship();
		for (Link link : links) {
			link.setValue(translate(link.getValue(), fromBase, toBase));
		}
		for (QName qName : extProps.keySet()) {
			Object val = extProps.get(qName);
			if (val instanceof java.net.URI) {
				extProps.put(qName, translate((URI)val, fromBase, toBase));
			}
			if (val instanceof ArrayList && ((ArrayList)val).size() > 0 && ((ArrayList)val).get(0) instanceof java.net.URI) {
				ArrayList<URI> vals = (ArrayList<URI>)val;
				for (int i=0; i<vals.size(); i++) {
					vals.set(i, translate(vals.get(i), fromBase, toBase));
				}
			}
		}
	}


	void printModel(Model model) {
		StmtIterator iter = model.listStatements();
	
		// print out the predicate, subject and object of each statement
		while (iter.hasNext()) {
		    Statement stmt      = iter.nextStatement();  // get next statement
		    Resource  subject   = stmt.getSubject();     // get the subject
		    Property  predicate = stmt.getPredicate();   // get the predicate
		    RDFNode   object    = stmt.getObject();      // get the object
	
		    System.out.print(subject.toString());
		    System.out.print(" " + predicate.toString() + " ");
		    if (object instanceof Resource) {
		       System.out.print(object.toString());
		    } else {
		        // object is a literal
		        System.out.print(" \"" + object.toString() + "\"");
		    }
	
		    System.out.println(" .");
		}
	}
}
