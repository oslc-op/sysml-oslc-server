/*******************************************************************************
 * Licensed Materials - Property of IBM
 * (c) Copyright IBM Corporation 2018. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:  Use,
 * duplication or disclosure restricted by GSA ADP Schedule 
 * Contract with IBM Corp.
 *******************************************************************************//**
 *****************************************************************************
 Copyright (c) 2015-16 IBM Corporation and other Contributors.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 Contributors:
 Sathiskumar Palaniappan - Initial Contribution
 *****************************************************************************
 *
 */
package org.oasis.oslcop.sysml.api;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Properties;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.DefaultCookieSpec;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.eclipse.lyo.oslc4j.client.OslcClient;
import org.eclipse.lyo.server.oauth.core.utils.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


/**
 * A simple Sysml v2 Services API Java client to access resources from the OMG
 * REST PSM reference implementation. This is an alternative to using the 
 * https://github.com/ModelDriven/SysML-v2-API-Java-Client to reduce dependencies,
 * simplify the stack and work around some early issues.
 * 
 * @author jamsden
 *
 */
public class SysMLClient extends OslcClient {

	private static Logger log = LoggerFactory.getLogger(SysMLClient.class);

	// Used to store instances of this SysMLClient in the HTTP session
	public static final String APICLIENT_ATTRIBUTE = "org.oasis.oslcop.sysml.api.ApiClient";

	private SSLContext sslContext = null;

	private String basePath;

	public String getBasePath() {
		return basePath;
	}



	// End user session information
	private HttpClient client;
	private CookieStore cookieStore;
	private String user;
	private String password;
	private Registry<CookieSpecProvider> cookieReg = null;
	private RequestConfig config = null;
	
	private static Properties clientProperties = new Properties();
	static {
		try {
			clientProperties.load(SysMLClient.class.getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	// Enum for content-type header
	public enum ContentType {
		text("text/plain"), json("application/json"), xml("application/xml"), bin("application/octet-stream");

		ContentType(String type) {
			mType = type;
		}

		public String getType() {
			return mType;
		}

		private String mType;

	} // ending enum

	private ContentType defaultContentType = ContentType.json;

	
	/** Create an SysMLClient using for the server URI, userId and password.
	 * 
	 * @param userId
	 * @param password
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 */
	public SysMLClient(String userId, String password) {

        basePath = System.getProperty("api.client.base.path");
    	if (basePath == null) basePath = "http://sysml2-dev.intercax.com:9000";
		this.user = userId;
		this.password = password;
		

		class LooseCookieSpec extends DefaultCookieSpec {
		    @Override
		    public void validate(Cookie arg0, CookieOrigin arg1) throws MalformedCookieException {
		        //allow all cookies 
		    }
		}

		class LooseSpecProvider implements CookieSpecProvider {
		    @Override
		    public CookieSpec create(HttpContext context) {
		        return new LooseCookieSpec();
		    }
		}

		cookieReg = RegistryBuilder.<CookieSpecProvider>create()
	            .register("loose", new LooseSpecProvider())
	            .build();

		// the path for JSESSIONID cookie varies from /idaas/ to /authsvc/ 
		// so we need to accept all cookies
		cookieStore = new BasicCookieStore();
		config = RequestConfig.custom()
				.setConnectTimeout(30 * 1000)
				.setSocketTimeout(30 * 1000)
				.setRedirectsEnabled(false)
				.setCookieSpec("loose").build();

		TrustManager[] trustAllCerts = null;
		boolean trustAll = false;

		// TODO: when would trustAll be set to true?
		if (trustAll) {
			trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return new X509Certificate[0];
				}

				public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				}
			} };
		}

		try {
			sslContext = SSLContext.getInstance("TLSv1.2");
			sslContext.init(null, trustAllCerts, null);
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		client = HttpClientBuilder.create()
				.setDefaultCookieStore(cookieStore)
				.setDefaultCookieSpecRegistry(cookieReg)
				.setDefaultRequestConfig(config)
				/*.setSSLContext(sslContext)*/.build();
	}
	
	
	/**
	 * Login to the SysML REST API with the userId and password provided in the constructor.
	 * 
	 * Basic Authentication is used
	 * @throws UnauthorizedException 
	 * 
	 */
	public void login() throws UnauthorizedException {
		// SysML v2 Services API REST PSM SysMLClient doesn't require authentication yet.
	}
	
	public void logoff() {
		log.info("Logging out from SysML REST API");
		HttpClientUtils.closeQuietly(client);		
	}



	/** Create a new SysML resource.
	 * 
	 * @param projectId organization managing the resource
	 * @param url URI fragment of the resource to be deleted, e.g., device/types/{typeId}
	 * @param resource the resource to create
	 * @return the created resource
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public JsonElement createSysMLResource(String projectId, String url, JsonElement resource) throws URISyntaxException, IOException {
		JsonElement result = null;

		StringBuilder sb = new StringBuilder("");
		// TODO: This needs to be done in a commit
		sb.append(basePath).append("/projects/").append(projectId).append("/").append(url);
		String uri = sb.toString();

		HttpPost post = new HttpPost(uri);
		post.setEntity(new StringEntity(resource.toString()));
		post.addHeader("Content-Type", "application/json");
		post.addHeader("Accept", "application/json");

		try {
			HttpResponse response = client.execute(post);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_CREATED) {
				result = (new JsonParser()).parse(EntityUtils.toString(response.getEntity()));
			} else {
				log.error("Could not create resource: {}, status is {}", uri, response.getStatusLine().getStatusCode());
			}
		} catch (Exception e) {
			log.warn("POST {}: {}", uri, e.getMessage());
			throw e;
		}
		return result;
	}

	/** Read a SysML resource.
	 * 
	 * @param projectId organization managing the resource
	 * @param url URI fragment of the resource to be deleted, e.g.,
	 *    head
	 *    commits/{commitId}
	 *    commits/{commitId}/elements, 
	 *    commits/{commitId}.elements/{relatedElementId}/relationships
	 * @return The JsonElement resource representation
	 * 
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public JsonElement readSysMLResource(String url) throws URISyntaxException, IOException {
		JsonElement result = null;

		String uri = basePath + url;

		HttpGet get = new HttpGet(uri);
		get.addHeader("Accept", "application/json");

		try {
			HttpResponse response = client.execute(get);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				result = (new JsonParser()).parse(EntityUtils.toString(response.getEntity()));
			} else {
				log.error("Could not read resource: {}", uri);
				HttpClientUtils.closeQuietly(response);
			}
		} catch (Exception e) {
			log.warn("GET {}: {}", uri, e.getMessage());
			throw e;
		}
		return result;
	}

	/** Update a SysML resource
	 * 
	 * @param projectId organization managing the resource
	 * @param url URI fragment of the resource to be updated, e.g.,
	 *    head
	 *    commits/{commitId}
	 *    commits/{commitId}/elements, 
	 *    commits/{commitId}.elements/{relatedElementId}/relationships
	 * @return the updated resource
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public JsonElement updateSysMLResource(String url, JsonObject resource) throws URISyntaxException, IOException {
		JsonElement result = null;
		
		// TODO: This needs to be done in a commit
		String uri = basePath + url;
		
		HttpPut put = new HttpPut(uri);
		put.setEntity(new StringEntity(resource.toString()));
		put.addHeader("Content-Type", "application/json");
		put.addHeader("Accept", "application/json");

		try {
			HttpResponse response = client.execute(put);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				result = (new JsonParser()).parse(EntityUtils.toString(response.getEntity()));				
			} else {
				log.warn("Could not update resource: {}", uri);
			} 
		} catch (Exception e) {
			log.warn("PUT {}: {}", uri, e.getMessage());
			throw e;
		}
		return result;
	}

	/** Delete a SysML Platform resource.
	 * 
	 * @param projectId organization managing the resource
	 * @param url URI fragment of the resource to be deleted, e.g., device/types/{typeId}
	 * @return true if the resource is successfully deleted, false otherwise
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public Boolean deleteSysMLResource(String url) throws URISyntaxException, IOException {
		Boolean result = Boolean.FALSE;
		
		StringBuilder sb = new StringBuilder();
		// TODO: This needs to be done in a commit
		String uri = basePath + url;

		HttpDelete delete = new HttpDelete(uri);

		try {
			HttpResponse response = client.execute(delete);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_NO_CONTENT) {
				result = Boolean.TRUE;
			} else {
				log.warn("Could not delete resource: {}", uri);
				HttpClientUtils.closeQuietly(response);
			}
		} catch (Exception e) {
			log.warn("DELETE {}: {}", uri, e.getMessage());
			throw e;
		}
		return result;
	}

		
	
	/** Get the SysML Projects the user of this login session has access to
	 * 
	 * @return JsonArray of organizations
	 * @throws Exception 
	 */
	public JsonArray getProjects() throws Exception {
		JsonArray result = null;
		StringBuilder sb = new StringBuilder();
		sb.append(basePath).append("/projects");
		String uri = sb.toString();
	
		HttpGet get = new HttpGet(uri);
		get.addHeader("Accept", "application/json");

		try {
			HttpResponse response = client.execute(get);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_UNAUTHORIZED) {
				HttpClientUtils.closeQuietly(response);
				this.login();
				response = client.execute(get);
			}
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				JsonElement jsonResponse = new JsonParser().parse(new InputStreamReader(response.getEntity().getContent()));
				result = jsonResponse.getAsJsonArray();
			} else {
				log.error("Could not read organizations: {} got: {}", uri, response.getStatusLine().getStatusCode());
			}
			HttpClientUtils.closeQuietly(response);
		} catch (Exception e) {
			log.warn("GET Projects {}: {}", uri, e.getMessage());
			throw e;
		}
		return result;
	
	}
}
