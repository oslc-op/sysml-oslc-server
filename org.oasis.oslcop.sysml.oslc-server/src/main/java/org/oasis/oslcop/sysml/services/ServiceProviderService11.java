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
import org.oasis.oslcop.sysml.AcceptActionUsage;
import org.oasis.oslcop.sysml.ActionDefinition;
import org.oasis.oslcop.sysml.ActionUsage;
import org.oasis.oslcop.sysml.AllocationDefinition;
import org.oasis.oslcop.sysml.AllocationUsage;
import org.oasis.oslcop.sysml.AnalysisCaseDefinition;
import org.oasis.oslcop.sysml.AnalysisCaseUsage;
import org.oasis.oslcop.sysml.AnnotatingElement;
import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.Association;
import org.oasis.oslcop.sysml.AssociationStructure;
import org.oasis.oslcop.sysml.AttributeDefinition;
import org.oasis.oslcop.sysml.AttributeUsage;
import org.oasis.oslcop.sysml.Behavior;
import org.oasis.oslcop.sysml.BooleanExpression;
import org.oasis.oslcop.sysml.CalculationDefinition;
import org.oasis.oslcop.sysml.CalculationUsage;
import org.oasis.oslcop.sysml.CaseDefinition;
import org.oasis.oslcop.sysml.CaseUsage;
import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.ConjugatedPortDefinition;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.ConnectionDefinition;
import org.oasis.oslcop.sysml.ConnectionUsage;
import org.oasis.oslcop.sysml.Connector;
import org.oasis.oslcop.sysml.ConstraintDefinition;
import org.oasis.oslcop.sysml.ConstraintUsage;
import org.oasis.oslcop.sysml.DataType;
import org.oasis.oslcop.sysml.Definition;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.EnumerationDefinition;
import org.oasis.oslcop.sysml.EnumerationUsage;
import org.oasis.oslcop.sysml.Expression;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.Function;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.IndividualDefinition;
import org.oasis.oslcop.sysml.IndividualUsage;
import org.oasis.oslcop.sysml.InterfaceDefinition;
import org.oasis.oslcop.sysml.InterfaceUsage;
import org.oasis.oslcop.sysml.ItemDefinition;
import org.oasis.oslcop.sysml.ItemUsage;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.oasis.oslcop.sysml.PartDefinition;
import org.oasis.oslcop.sysml.PartUsage;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.PortConjugation;
import org.oasis.oslcop.sysml.PortDefinition;
import org.oasis.oslcop.sysml.PortUsage;
import org.oasis.oslcop.sysml.Predicate;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.ReferenceUsage;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.RenderingDefinition;
import org.oasis.oslcop.sysml.RenderingUsage;
import org.oasis.oslcop.sysml.RequirementDefinition;
import org.oasis.oslcop.sysml.RequirementUsage;
import org.eclipse.lyo.oslc.domains.am.Resource;
import org.oasis.oslcop.sysml.StateUsage;
import org.oasis.oslcop.sysml.Step;
import org.oasis.oslcop.sysml.Structure;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.Succession;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.TransitionUsage;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.TypeFeaturing;
import org.oasis.oslcop.sysml.Usage;
import org.oasis.oslcop.sysml.VariantMembership;
import org.oasis.oslcop.sysml.VerificationCaseDefinition;
import org.oasis.oslcop.sysml.VerificationCaseUsage;
import org.oasis.oslcop.sysml.ViewDefinition;
import org.oasis.oslcop.sysml.ViewUsage;
import org.oasis.oslcop.sysml.ViewpointDefinition;
import org.oasis.oslcop.sysml.ViewpointUsage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code
@OslcService(SysmlDomainConstants.SYSML_DOMAIN)
@Path("projects/{projectId}/service11/partUsages")
@Api(value = "OSLC Service for {" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "}")
public class ServiceProviderService11
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;

    private static final Logger log = LoggerFactory.getLogger(ServiceProviderService11.class);

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    public ServiceProviderService11()
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
        resourceShape = OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.PARTUSAGE_PATH,
        resourceTypes = {SysmlDomainConstants.PARTUSAGE_TYPE},
        usages = {}
    )
    @GET
    @Path("query")
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON})
    @ApiOperation(
        value = "Query capability for resources of type {" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "}",
        notes = "Query capability for resources of type {" + "<a href=\"" + SysmlDomainConstants.PARTUSAGE_TYPE + "\">" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "</a>" + "}" +
            ", with respective resource shapes {" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.PARTUSAGE_PATH + "\">" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "</a>" + "}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML
    )
    public PartUsage[] queryPartUsages(
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

        // Start of user code queryPartUsages
        // Here additional logic can be implemented that complements main action taken in SysmlServerManager
        // End of user code

        final List<PartUsage> resources = SysmlServerManager.queryPartUsages(httpServletRequest, projectId, where, prefix, page, pageSize);
        httpServletRequest.setAttribute("queryUri",
                uriInfo.getAbsolutePath().toString() + "?oslc.paging=true");
        if (resources.size() > pageSize) {
            resources.remove(resources.size() - 1);
            httpServletRequest.setAttribute(OSLC4JConstants.OSLC4J_NEXT_PAGE,
                    uriInfo.getAbsolutePath().toString() + "?oslc.paging=true&oslc.pageSize=" + pageSize + "&page=" + (page + 1));
        }
        return resources.toArray(new PartUsage [resources.size()]);
    }

    @GET
    @Path("query")
    @Produces({ MediaType.TEXT_HTML })
    @ApiOperation(
        value = "Query capability for resources of type {" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "}",
        notes = "Query capability for resources of type {" + "<a href=\"" + SysmlDomainConstants.PARTUSAGE_TYPE + "\">" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "</a>" + "}" +
            ", with respective resource shapes {" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.PARTUSAGE_PATH + "\">" + SysmlDomainConstants.PARTUSAGE_LOCALNAME + "</a>" + "}",
        produces = OslcMediaType.APPLICATION_RDF_XML + ", " + OslcMediaType.APPLICATION_XML + ", " + OslcMediaType.APPLICATION_JSON + ", " + OslcMediaType.TEXT_TURTLE + ", " + MediaType.TEXT_HTML
    )
    public void queryPartUsagesAsHtml(
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

        // Start of user code queryPartUsagesAsHtml
        // End of user code

        final List<PartUsage> resources = SysmlServerManager.queryPartUsages(httpServletRequest, projectId, where, prefix, page, pageSize);

        if (resources!= null) {
            httpServletRequest.setAttribute("resources", resources);
            // Start of user code queryPartUsagesAsHtml_setAttributes
            // End of user code

            httpServletRequest.setAttribute("queryUri",
                    uriInfo.getAbsolutePath().toString() + "?oslc.paging=true");
            if (resources.size() > pageSize) {
                resources.remove(resources.size() - 1);
                httpServletRequest.setAttribute(OSLC4JConstants.OSLC4J_NEXT_PAGE,
                        uriInfo.getAbsolutePath().toString() + "?oslc.paging=true&oslc.pageSize=" + pageSize + "&page=" + (page + 1));
            }
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/partusagescollection.jsp");
            rd.forward(httpServletRequest,httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @OslcDialog
    (
         title = "SelectionDialog1",
         label = "SelectionDialog1",
         uri = "projects/{projectId}/service11/partUsages/selector",
         hintWidth = "250px",
         hintHeight = "250px",
         resourceTypes = {SysmlDomainConstants.PARTUSAGE_TYPE},
         usages = {}
    )
    @GET
    @Path("selector")
    @Consumes({ MediaType.TEXT_HTML, MediaType.WILDCARD })
    public void PartUsageSelector(
        @QueryParam("terms") final String terms
        , @PathParam("projectId") final String projectId
        ) throws ServletException, IOException
    {
        // Start of user code PartUsageSelector_init
        // End of user code

        httpServletRequest.setAttribute("selectionUri",UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path(uriInfo.getPath()).build().toString());
        // Start of user code PartUsageSelector_setAttributes
        // End of user code

        if (terms != null ) {
            httpServletRequest.setAttribute("terms", terms);
            final List<PartUsage> resources = SysmlServerManager.PartUsageSelector(httpServletRequest, projectId, terms);
            if (resources!= null) {
                        httpServletRequest.setAttribute("resources", resources);
                        RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/partusageselectorresults.jsp");
                        rd.forward(httpServletRequest, httpServletResponse);
                        return;
            }
            log.error("A empty search should return an empty list and not NULL!");
            throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);

        } else {
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/partusageselector.jsp");
            rd.forward(httpServletRequest, httpServletResponse);
            return;
        }
    }

}
