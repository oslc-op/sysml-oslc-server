import java.io.InputStream;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;

import org.apache.http.HttpStatus;
import org.apache.jena.datatypes.BaseDatatype.TypedValue;
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
			Response response = apiClient.getResource(url, "application/ld+json");

			if (response != null && response.getStatus() == HttpStatus.SC_OK) {
				OSLC4JUtils.setUseBeanClassForParsing("true");
				final Model model = ModelFactory.createDefaultModel();
				Resource resource = (Resource)model.getResource(url);
				RDFReader reader = model.getReader("JSON-LD");
				reader.read(model, (InputStream)response.getEntity(), "");
				
				// Get the actual @type that we just ignored
				Property rdfType = model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#","type");
				String atType = resource.getProperty(rdfType).getObject().toString();
				
				Object[] elements =  JenaModelHelper.unmarshal(model, Element.class);
				
				if (elements.length > 0) aResource = (Element)elements[0]; 
				//aResource = response.readEntity(Element.class);
				// add the @type we just ignored 
				aResource.addType(atType);

				// Add the dcterms:identifier
				Map<QName,Object>  extProps = aResource.getExtendedProperties();
				String identifier = ((TypedValue)extProps.get(new QName("http://omg.org/ns/sysml#","identifier"))).lexicalValue;
				aResource.setIdentifier(identifier);
			} else {
				throw new WebApplicationException(response.getStatus());
			}
			System.out.println(response.getStatus());
			System.out.println(aResource);
			System.out.println(aResource.getType());
			for (QName qName : aResource.getExtendedProperties().keySet()) {
				System.out.println("    Key: " + qName.toString() + " Value: "+ aResource.getExtendedProperties().get(qName));
			}
		} catch (Exception e) {
			e.printStackTrace();
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
