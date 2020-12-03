// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 */
// End of user code

package org.oasis.oslcop.sysml.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.UriBuilder;

import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;
import org.eclipse.lyo.oslc4j.provider.json4j.JsonHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.lyo.oslc4j.core.OSLC4JConstants;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.annotation.OslcCreationFactory;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDialog;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDialogs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.Compact;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.Preview;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;

import org.oasis.oslcop.sysml.SysmlServerManager;
import org.oasis.oslcop.sysml.SysmlServerConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.eclipse.lyo.oslc.domains.am.Resource;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.Type;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code
@OslcService(SysmlDomainConstants.SYSML_DOMAIN)
@Path("projects/{projectId}/service3/sysmlClasss")
@Api(value = "OSLC Service for {" + SysmlDomainConstants.CLASS_LOCALNAME + "}")
public class ServiceProviderService3
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;

    private static final Logger log = LoggerFactory.getLogger(ServiceProviderService3.class);

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    public ServiceProviderService3()
    {
        super();
    }

    private void addCORSHeaders (final HttpServletResponse httpServletResponse) {
        //UI preview can be blocked by CORS policy.
        //add select CORS headers to every response that is embedded in an iframe.
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD");
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        httpServletResponse.addHeader("Access-Control-Allow-Credentials", "true");
    }

    @OslcQueryCapability
    (
        title = "QueryCapability1",
        label = "QueryCapability1",
        resourceShape = OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.CLASS_PATH,
        resourceTypes = {SysmlDomainConstants.CLASS_TYPE},
        usages = {}
    )
    @GET
    @Path("query")
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON})
    @ApiOperation(
        value = "Query capability for resources of type {" + SysmlDomainConstants.CLASS_LOCALNAME + "}",
        notes = "Query capability for resources of type {" + "<a href=\"" + SysmlDomainConstants.CLASS_TYPE + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "}" +
            ", with respective resource shapes {" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.CLASS_PATH + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML
    )
    public SysmlClass[] querySysmlClasss(
                                                    @PathParam("projectId") final String projectId ,
                                                     @QueryParam("oslc.where") final String where,
                                                     @QueryParam("oslc.prefix") final String prefix,
                                                     @QueryParam("page") final String pageString,
                                                    @QueryParam("oslc.pageSize") final String pageSizeString) throws IOException, ServletException
    {
        int page=0;
        int pageSize=20;
        if (null != pageString) {
            page = Integer.parseInt(pageString);
        }
        if (null != pageSizeString) {
            pageSize = Integer.parseInt(pageSizeString);
        }

        // Start of user code querySysmlClasss
        // Here additional logic can be implemented that complements main action taken in SysmlServerManager
        // End of user code

        final List<SysmlClass> resources = SysmlServerManager.querySysmlClasss(httpServletRequest, projectId, where, prefix, page, pageSize);
        httpServletRequest.setAttribute("queryUri",
                uriInfo.getAbsolutePath().toString() + "?oslc.paging=true");
        if (resources.size() > pageSize) {
            resources.remove(resources.size() - 1);
            httpServletRequest.setAttribute(OSLC4JConstants.OSLC4J_NEXT_PAGE,
                    uriInfo.getAbsolutePath().toString() + "?oslc.paging=true&oslc.pageSize=" + pageSize + "&page=" + (page + 1));
        }
        return resources.toArray(new SysmlClass [resources.size()]);
    }

    @GET
    @Path("query")
    @Produces({ MediaType.TEXT_HTML })
    @ApiOperation(
        value = "Query capability for resources of type {" + SysmlDomainConstants.CLASS_LOCALNAME + "}",
        notes = "Query capability for resources of type {" + "<a href=\"" + SysmlDomainConstants.CLASS_TYPE + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "}" +
            ", with respective resource shapes {" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.CLASS_PATH + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML
    )
    public void querySysmlClasssAsHtml(
                                    @PathParam("projectId") final String projectId ,
                                       @QueryParam("oslc.where") final String where,
                                       @QueryParam("oslc.prefix") final String prefix,
                                       @QueryParam("page") final String pageString,
                                    @QueryParam("oslc.pageSize") final String pageSizeString) throws ServletException, IOException
    {
        int page=0;
        int pageSize=20;
        if (null != pageString) {
            page = Integer.parseInt(pageString);
        }
        if (null != pageSizeString) {
            pageSize = Integer.parseInt(pageSizeString);
        }

        // Start of user code querySysmlClasssAsHtml
        // End of user code

        final List<SysmlClass> resources = SysmlServerManager.querySysmlClasss(httpServletRequest, projectId, where, prefix, page, pageSize);

        if (resources!= null) {
            httpServletRequest.setAttribute("resources", resources);
            // Start of user code querySysmlClasssAsHtml_setAttributes
            // End of user code

            httpServletRequest.setAttribute("queryUri",
                    uriInfo.getAbsolutePath().toString() + "?oslc.paging=true");
            if (resources.size() > pageSize) {
                resources.remove(resources.size() - 1);
                httpServletRequest.setAttribute(OSLC4JConstants.OSLC4J_NEXT_PAGE,
                        uriInfo.getAbsolutePath().toString() + "?oslc.paging=true&oslc.pageSize=" + pageSize + "&page=" + (page + 1));
            }
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/sysmlclassscollection.jsp");
            rd.forward(httpServletRequest,httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @OslcDialog
    (
         title = "SelectionDialog1",
         label = "SelectionDialog1",
         uri = "projects/{projectId}/service3/sysmlClasss/selector",
         hintWidth = "250px",
         hintHeight = "250px",
         resourceTypes = {SysmlDomainConstants.CLASS_TYPE},
         usages = {}
    )
    @GET
    @Path("selector")
    @Consumes({ MediaType.TEXT_HTML, MediaType.WILDCARD })
    public void SysmlClassSelector(
        @QueryParam("terms") final String terms
        , @PathParam("projectId") final String projectId
        ) throws ServletException, IOException
    {
        // Start of user code SysmlClassSelector_init
        // End of user code

        httpServletRequest.setAttribute("selectionUri",UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path(uriInfo.getPath()).build().toString());
        // Start of user code SysmlClassSelector_setAttributes
        // End of user code

        if (terms != null ) {
            httpServletRequest.setAttribute("terms", terms);
            final List<SysmlClass> resources = SysmlServerManager.SysmlClassSelector(httpServletRequest, projectId, terms);
            if (resources!= null) {
                        httpServletRequest.setAttribute("resources", resources);
                        RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/sysmlclassselectorresults.jsp");
                        rd.forward(httpServletRequest, httpServletResponse);
                        return;
            }
            log.error("A empty search should return an empty list and not NULL!");
            throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);

        } else {
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/sysmlclassselector.jsp");
            rd.forward(httpServletRequest, httpServletResponse);
            return;
        }
    }

}
