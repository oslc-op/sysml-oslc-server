import java.io.InputStream;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFReader;
import org.eclipse.lyo.oslc4j.client.OslcClient;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.omg.sysml.model.Element;

public class SysMLSample {

	public static void main(String[] args) {
		// Because SysML v2 Services REST API is returning SysML specific subtypes for @type, not includeing Element
		try {
		Element aResource = null;
		OslcClient apiClient = new OslcClient();
		String url = "http://sysml2-dev.intercax.com:9000/projects/aa593ac6-f6f8-4794-926f-6911f1966dff/commits/21bda0aa-92da-416d-8f03-2b7c7f5a3de5/elements/9d5b1ef4-ad01-4496-a392-e66fb2aa60ff";
		Response response = apiClient.getResource(url, "application/ld+json");
				
		if (response != null && response.getStatus() == HttpStatus.SC_OK) {
			String useBeanClass = OSLC4JUtils.getUseBeanClassForParsing();
			OSLC4JUtils.setUseBeanClassForParsing("true");
			final Model model = ModelFactory.createDefaultModel();
			RDFReader reader = model.getReader("JSON-LD");
			reader.read(model, (InputStream)response.getEntity(), "");
			Object[] elements =  JenaModelHelper.unmarshal(model, Element.class);
			System.out.println(elements.length);
			System.out.println(model);
			if (elements.length > 0) aResource = (Element)elements[0]; 
			OSLC4JUtils.setUseBeanClassForParsing(useBeanClass);
		} else {
			throw new WebApplicationException(response.getStatus());
		}
		System.out.println(response.getStatus());
		System.out.print(aResource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
