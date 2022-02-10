package org.oasis.oslcop.sysml.services;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.UriBuilder;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.store.ModelUnmarshallingException;
import org.eclipse.lyo.store.Store;
import org.eclipse.lyo.store.StoreAccessException;
import org.oasis.oslcop.sysml.SysmlServerManager;
import org.oasis.oslcop.sysml.json.ProjectCommit;
import org.oasis.oslcop.sysml.resources.view.ProjectCommitViewModel;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("store")
public class StoreService
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;

    private static final Logger log = LoggerFactory.getLogger(StoreService.class);

    private static String selectedProjectCommit = null;
    
    public StoreService() {
        super();
    }

    private static List<String> projectCommits() throws IOException {
        List<String> ng = new ArrayList<String>();
        String query = "SELECT ?g WHERE {GRAPH ?g { }}";
        QueryExecution queryExecution = QueryExecutionFactory.sparqlService(SysmlServerManager.getSparqlQueryEndpoint(), query);
        ResultSet resultSet = queryExecution.execSelect();
        while (resultSet.hasNext()) {
            QuerySolution solution = resultSet.next(); 
            String uri = solution.get("g").asResource().getURI();
            ng.add(deconstructNamedGraphUri(URI.create(uri)));
        }
        return ng;
    }

    public static URI constructNamedGraphUri(String projectCommit) {
        return URI.create("http://"+projectCommit);
    }    

    private static String deconstructNamedGraphUri(URI namedGraphUri) {
        return namedGraphUri.toString().substring(7);
    }    

    public static String getSelectedProjectCommit() {
        return selectedProjectCommit;
    }

    public static void setSelectedProjectCommit(ProjectCommit projectCommit) {
        StoreService.selectedProjectCommit = projectCommit.getId();
    }

    public static URI getSelectedNamedGraph() {
        return constructNamedGraphUri(selectedProjectCommit);
    }

    @GET
    @Path("projectCommits")
    public void getProjectCommits() throws IOException, ServletException, StoreAccessException,
            ModelUnmarshallingException {
        List<String> commits = projectCommits();

        Store store = SysmlServerManager.getStorePool().getStore();
        List <ProjectCommitViewModel> commitModels = new ArrayList<>();
        for (String id : commits) {
            List<ProjectCommitViewModel.ServiceProviderViewModel> providers =
                    store.getResources(StoreService.constructNamedGraphUri(id),
                                    ServiceProvider.class)
                    .stream()
                    .map(serviceProvider -> new ProjectCommitViewModel.ServiceProviderViewModel(serviceProvider.getIdentifier()))
                    .collect(Collectors.toList());
            URI uri = UriBuilder.fromUri(OSLC4JUtils.getServletURI())
                    .path("/store/projectCommits/" + id).build();
            commitModels.add(new ProjectCommitViewModel(id, id.equals(selectedProjectCommit), providers, uri));
        }
        SysmlServerManager.getStorePool().releaseStore(store);

        httpServletRequest.setAttribute("projectCommits", commitModels);
        httpServletRequest.setAttribute("selectedProjectCommit", selectedProjectCommit);

        RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/projectCommits.jsp");
        rd.forward(httpServletRequest,httpServletResponse);
        return;
    }

    @GET
    @Path("projectCommits/{projectCommit}")
    public Response setSelectedProjectCommit(@PathParam("projectCommit") final String projectCommit) throws Exception {
        selectedProjectCommit = projectCommit;
        for (ServiceProvider serviceProvider : ServiceProviderCatalogSingleton.getServiceProviders(httpServletRequest)) {
            ServiceProviderCatalogSingleton.deregister(serviceProvider);
        }
        Store store = SysmlServerManager.getStorePool().getStore();
        List<ServiceProvider> serviceProviders = store.getResources(StoreService.getSelectedNamedGraph(), ServiceProvider.class);
        SysmlServerManager.getStorePool().releaseStore(store);
        for (ServiceProvider sp : serviceProviders) {
            ServiceProviderCatalogSingleton.register(sp);
        }
        //return Response.status(Status.OK).entity("ProjectCommit changed to:" + selectedProjectCommit).build();
        return Response.temporaryRedirect(UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("/store/projectCommits/").build()).build();
    }

}
