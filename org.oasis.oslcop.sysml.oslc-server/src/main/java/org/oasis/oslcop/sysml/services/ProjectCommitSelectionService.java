package org.oasis.oslcop.sysml.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.store.ModelUnmarshallingException;
import org.eclipse.lyo.store.Store;
import org.eclipse.lyo.store.StoreAccessException;
import org.eclipse.lyo.store.StorePool;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("projectCommits")
public class ProjectCommitSelectionService
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;

    private static final Logger log = LoggerFactory.getLogger(ProjectCommitSelectionService.class);

    @Inject StorePool storePool;

    private static ServiceProvider selectedServiceProvider = null;
    private static String selectedProjectCommitId = null;
    private static String selectedProjectId = null;
    
    public ProjectCommitSelectionService() {
        super();
    }

    public void setSelectedServiceProvider (ServiceProvider serviceProvider) {
        selectedServiceProvider = serviceProvider;
        String[] split = serviceProvider.getIdentifier().split("/");
        selectedProjectId = split[0];
        selectedProjectCommitId = split[1];
    }

    public URI getSelectedNamedGraph() {
        if (null == selectedServiceProvider) {
            setDefaultServiceProvider();
        }
        return selectedServiceProvider.getAbout();
    }

    public String getSelectedProjectid() {
        if (null == selectedProjectId) {
            setDefaultServiceProvider();
        }
        return selectedProjectId;
    }
    public String getSelectedProjectCommitId() {
        if (null == selectedProjectCommitId) {
            setDefaultServiceProvider();
        }
        return selectedProjectCommitId;
    }

    private List<ServiceProvider> getAllServiceProviders() throws IOException, ServletException, StoreAccessException, ModelUnmarshallingException {
        Store store = storePool.getStore();
        List<ServiceProvider> serviceProviders = store.getResources(null, ServiceProvider.class, null, null, null, -1, -1);
        storePool.releaseStore(store);
        return serviceProviders;
    }

    private void setServiceProvider(final String serviceProviderUri) throws URISyntaxException, StoreAccessException, ModelUnmarshallingException {
        for (ServiceProvider serviceProvider : ServiceProviderCatalogSingleton.getServiceProviders(null)) {
            ServiceProviderCatalogSingleton.deregister(serviceProvider);
        }
        Store store = storePool.getStore();
        ServiceProvider serviceProvider = store.getResource(URI.create(serviceProviderUri), URI.create(serviceProviderUri), ServiceProvider.class);
        storePool.releaseStore(store);
        ServiceProviderCatalogSingleton.register(serviceProvider);
        setSelectedServiceProvider(serviceProvider);
    }

    private void setDefaultServiceProvider() {
        try {
            log.trace("Setting the default ServiecProvider. Should be only done once.");
            List<ServiceProvider> serviceProviders = getAllServiceProviders();
            if (serviceProviders.size() > 0) {
                setServiceProvider(serviceProviders.get(0).getAbout().toString());
            }
        } catch (Exception e) {
            log.error("problems setting the default ServiecProvider.", e);
        }
    }

    @GET
    public void getProjectCommits() throws IOException, ServletException, StoreAccessException, ModelUnmarshallingException {
        List<ServiceProvider> serviceProviders = getAllServiceProviders();
        httpServletRequest.setAttribute("serviceProviders", serviceProviders);
        httpServletRequest.setAttribute("selectedServiceProvider", selectedServiceProvider);
        RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/projectCommits.jsp");
        rd.forward(httpServletRequest,httpServletResponse);
        return;
    }

    @GET
    @Path("switch")
    public Response setSelectedProjectCommit(@QueryParam("serviceProviderUri") final String serviceProviderUri) throws Exception {
        setServiceProvider(serviceProviderUri);
        //return Response.status(Status.OK).entity("ProjectCommit changed to:" + selectedProjectCommit).build();
        return Response.temporaryRedirect(UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("/projectCommits/").build()).build();
    }
}
