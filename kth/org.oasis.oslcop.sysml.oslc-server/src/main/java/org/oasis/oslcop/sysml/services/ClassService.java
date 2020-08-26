// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Michael Fiedler     - initial API and implementation for Bugzilla adapter
 *     Jad El-khoury       - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Jim Amsden          - Support for UI Preview (494303)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
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
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.SysmlClass;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code
@Path("projects/{projectId}/commits/{commitId}/classes")
@Api(value = "Web Service for {" + SysmlDomainConstants.CLASS_LOCALNAME + "}")
public class ClassService
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;

    private static final Logger log = LoggerFactory.getLogger(ClassService.class);

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    public ClassService()
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

    @GET
    @Path("{id}")
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON})
    @ApiOperation(
        value = "GET for resources of type {'" + SysmlDomainConstants.CLASS_LOCALNAME + "'}",
        notes = "GET for resources of type {'" + "<a href=\"" + SysmlDomainConstants.CLASS_TYPE + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "'}" +
            ", with respective resource shapes {'" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.CLASS_PATH + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "'}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML + ", " + OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML
    )
    public SysmlClass getSysmlClass(
                @PathParam("projectId") final String projectId, @PathParam("commitId") final String commitId, @PathParam("id") final String id
        ) throws IOException, ServletException, URISyntaxException
    {
        // Start of user code getResource_init
        // End of user code

        final SysmlClass aSysmlClass = SysmlServerManager.getSysmlClass(httpServletRequest, projectId, commitId, id);

        if (aSysmlClass != null) {
            // Start of user code getSysmlClass
            // End of user code
            httpServletResponse.setHeader("ETag", SysmlServerManager.getETagFromSysmlClass(aSysmlClass));
            httpServletResponse.addHeader(SysmlServerConstants.HDR_OSLC_VERSION, SysmlServerConstants.OSLC_VERSION_V2);
            return aSysmlClass;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}")
    @Produces({ MediaType.TEXT_HTML })
    @ApiOperation(
        value = "GET for resources of type {'" + SysmlDomainConstants.CLASS_LOCALNAME + "'}",
        notes = "GET for resources of type {'" + "<a href=\"" + SysmlDomainConstants.CLASS_TYPE + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "'}" +
            ", with respective resource shapes {'" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.CLASS_PATH + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "'}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML + ", " + OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML
    )
    public void getSysmlClassAsHtml(
        @PathParam("projectId") final String projectId, @PathParam("commitId") final String commitId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        // Start of user code getSysmlClassAsHtml_init
        // End of user code

        final SysmlClass aSysmlClass = SysmlServerManager.getSysmlClass(httpServletRequest, projectId, commitId, id);

        if (aSysmlClass != null) {
            httpServletRequest.setAttribute("aSysmlClass", aSysmlClass);
            // Start of user code getSysmlClassAsHtml_setAttributes
            // End of user code

            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/sysmlclass.jsp");
            rd.forward(httpServletRequest,httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}")
    @Produces({OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML})
    @ApiOperation(
        value = "GET for resources of type {'" + SysmlDomainConstants.CLASS_LOCALNAME + "'}",
        notes = "GET for resources of type {'" + "<a href=\"" + SysmlDomainConstants.CLASS_TYPE + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "'}" +
            ", with respective resource shapes {'" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.CLASS_PATH + "\">" + SysmlDomainConstants.CLASS_LOCALNAME + "</a>" + "'}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML + ", " + OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML
    )
    public Compact getSysmlClassCompact(
        @PathParam("projectId") final String projectId, @PathParam("commitId") final String commitId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        String iconUri = OSLC4JUtils.getPublicURI() + "/images/ui_preview_icon.gif";
        String smallPreviewHintHeight = "10em";
        String smallPreviewHintWidth = "45em";
        String largePreviewHintHeight = "20em";
        String largePreviewHintWidth = "45em";

        // Start of user code getSysmlClassCompact_init
        //TODO: adjust the preview height & width values from the default values provided above.
        // End of user code

        final SysmlClass aSysmlClass = SysmlServerManager.getSysmlClass(httpServletRequest, projectId, commitId, id);

        if (aSysmlClass != null) {
            final Compact compact = new Compact();

            compact.setAbout(aSysmlClass.getAbout());
            compact.setTitle(aSysmlClass.toString());

            compact.setIcon(new URI(iconUri));

            //Create and set attributes for OSLC preview resource
            final Preview smallPreview = new Preview();
            smallPreview.setHintHeight(smallPreviewHintHeight);
            smallPreview.setHintWidth(smallPreviewHintWidth);
            smallPreview.setDocument(UriBuilder.fromUri(aSysmlClass.getAbout()).path("smallPreview").build());
            compact.setSmallPreview(smallPreview);

            final Preview largePreview = new Preview();
            largePreview.setHintHeight(largePreviewHintHeight);
            largePreview.setHintWidth(largePreviewHintWidth);
            largePreview.setDocument(UriBuilder.fromUri(aSysmlClass.getAbout()).path("largePreview").build());
            compact.setLargePreview(largePreview);

            httpServletResponse.addHeader(SysmlServerConstants.HDR_OSLC_VERSION, SysmlServerConstants.OSLC_VERSION_V2);
            addCORSHeaders(httpServletResponse);
            return compact;
        }
        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}/smallPreview")
    @Produces({ MediaType.TEXT_HTML })
    public void getSysmlClassAsHtmlSmallPreview(
        @PathParam("projectId") final String projectId, @PathParam("commitId") final String commitId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        // Start of user code getSysmlClassAsHtmlSmallPreview_init
        // End of user code

        final SysmlClass aSysmlClass = SysmlServerManager.getSysmlClass(httpServletRequest, projectId, commitId, id);

        if (aSysmlClass != null) {
            httpServletRequest.setAttribute("aSysmlClass", aSysmlClass);
            // Start of user code getSysmlClassAsHtmlSmallPreview_setAttributes
            // End of user code

            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/sysmlclasssmallpreview.jsp");
            httpServletResponse.addHeader(SysmlServerConstants.HDR_OSLC_VERSION, SysmlServerConstants.OSLC_VERSION_V2);
            addCORSHeaders(httpServletResponse);
            rd.forward(httpServletRequest, httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}/largePreview")
    @Produces({ MediaType.TEXT_HTML })
    public void getSysmlClassAsHtmlLargePreview(
        @PathParam("projectId") final String projectId, @PathParam("commitId") final String commitId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        // Start of user code getSysmlClassAsHtmlLargePreview_init
        // End of user code

        final SysmlClass aSysmlClass = SysmlServerManager.getSysmlClass(httpServletRequest, projectId, commitId, id);

        if (aSysmlClass != null) {
            httpServletRequest.setAttribute("aSysmlClass", aSysmlClass);
            // Start of user code getSysmlClassAsHtmlLargePreview_setAttributes
            // End of user code

            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/sysmlclasslargepreview.jsp");
            httpServletResponse.addHeader(SysmlServerConstants.HDR_OSLC_VERSION, SysmlServerConstants.OSLC_VERSION_V2);
            addCORSHeaders(httpServletResponse);
            rd.forward(httpServletRequest, httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }
}
