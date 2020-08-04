import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;
import org.eclipse.lyo.oslc4j.client.OslcClient;
import org.omg.sysml.model.Element;

public class SysMLSample {

	public static void main(String[] args) {
		Element aResource = null;
		String body = null;
		OslcClient apiClient = new OslcClient();
		String url = "http://sysml2-dev.intercax.com:9000/projects/aa593ac6-f6f8-4794-926f-6911f1966dff/commits/21bda0aa-92da-416d-8f03-2b7c7f5a3de5/elements/9d5b1ef4-ad01-4496-a392-e66fb2aa60ff";
		Response response = apiClient.getResource(url, "application/ld+json");
		if (response != null && response.getStatus() == HttpStatus.SC_OK) {
			aResource = response.readEntity(Element.class);
			//body = response.readEntity(String.class);
		} else {
			throw new WebApplicationException(response.getStatus());
		}
		System.out.println(response.getStatus());
		System.out.print(aResource);
	}

}
