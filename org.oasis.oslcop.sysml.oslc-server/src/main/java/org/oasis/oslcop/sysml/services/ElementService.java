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
 *
 * This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
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

import javax.inject.Inject;
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
import org.oasis.oslcop.sysml.ServerConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.Element;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import org.eclipse.lyo.server.ui.model.PreviewFactory;
// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code
@Path("projects/{projectId}/elements")
public class ElementService
{
    @Context private HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse httpServletResponse;
    @Context private UriInfo uriInfo;
    @Inject  private SysmlServerManager delegate;

    private static final Logger log = LoggerFactory.getLogger(ElementService.class);

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    public ElementService()
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
    @Operation(
        summary = "GET for resources of type {'" + SysmlDomainConstants.ELEMENT_LOCALNAME + "'}",
        description = "GET for resources of type {'" + "<a href=\"" + SysmlDomainConstants.ELEMENT_TYPE + "\">" + SysmlDomainConstants.ELEMENT_LOCALNAME + "</a>" + "'}" +
            ", with respective resource shapes {'" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.ELEMENT_PATH + "\">" + SysmlDomainConstants.ELEMENT_LOCALNAME + "</a>" + "'}",
        responses = {@ApiResponse(description = "default response",
            content = {@Content(mediaType = OslcMediaType.APPLICATION_RDF_XML), @Content(
                mediaType = OslcMediaType.APPLICATION_XML), @Content(
                mediaType = OslcMediaType.APPLICATION_JSON), @Content(
                mediaType = OslcMediaType.TEXT_TURTLE), @Content(
                mediaType = MediaType.TEXT_HTML), @Content(
                mediaType = OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML)})
        }
    )
    public Element getElement(
                @PathParam("projectId") final String projectId, @PathParam("id") final String id
        ) throws IOException, ServletException, URISyntaxException
    {
        // Start of user code getResource_init
        // End of user code

        final Element aElement = delegate.getElement(httpServletRequest, projectId, id);

        if (aElement != null) {
            // Start of user code getElement
            // End of user code
            httpServletResponse.setHeader("ETag", delegate.getETagFromElement(aElement));
            httpServletResponse.addHeader(ServerConstants.HDR_OSLC_VERSION, ServerConstants.OSLC_VERSION_V2);
            return aElement;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}")
    @Produces({ MediaType.TEXT_HTML })
    @Operation(
        summary = "GET for resources of type {'" + SysmlDomainConstants.ELEMENT_LOCALNAME + "'}",
        description = "GET for resources of type {'" + "<a href=\"" + SysmlDomainConstants.ELEMENT_TYPE + "\">" + SysmlDomainConstants.ELEMENT_LOCALNAME + "</a>" + "'}" +
            ", with respective resource shapes {'" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.ELEMENT_PATH + "\">" + SysmlDomainConstants.ELEMENT_LOCALNAME + "</a>" + "'}",
        responses = {@ApiResponse(description = "default response",
            content = {@Content(mediaType = OslcMediaType.APPLICATION_RDF_XML), @Content(
                mediaType = OslcMediaType.APPLICATION_XML), @Content(
                mediaType = OslcMediaType.APPLICATION_JSON), @Content(
                mediaType = OslcMediaType.TEXT_TURTLE), @Content(
                mediaType = MediaType.TEXT_HTML), @Content(
                mediaType = OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML)})
        }
    )
    public void getElementAsHtml(
        @PathParam("projectId") final String projectId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        // Start of user code getElementAsHtml_init
        // End of user code

        final Element aElement = delegate.getElement(httpServletRequest, projectId, id);

        if (aElement != null) {
            httpServletRequest.setAttribute("aElement", aElement);
            // Start of user code getElementAsHtml_setAttributes
            URI sourceUri = PopulationService.translateBack(uriInfo.getAbsolutePath());
            httpServletRequest.setAttribute("sourceUri", sourceUri.toString());
            // End of user code

            httpServletRequest.setAttribute("aResource", aElement);
            httpServletRequest.setAttribute("resourceTypeName", SysmlDomainConstants.ELEMENT_LOCALNAME);
            httpServletRequest.setAttribute("shapeUri", UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path(OslcConstants.PATH_RESOURCE_SHAPES).path(SysmlDomainConstants.ELEMENT_PATH).build());
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/viewresource.jsp");
            rd.forward(httpServletRequest,httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}")
    @Produces({OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML})
    @Operation(
        summary = "GET for resources of type {'" + SysmlDomainConstants.ELEMENT_LOCALNAME + "'}",
        description = "GET for resources of type {'" + "<a href=\"" + SysmlDomainConstants.ELEMENT_TYPE + "\">" + SysmlDomainConstants.ELEMENT_LOCALNAME + "</a>" + "'}" +
            ", with respective resource shapes {'" + "<a href=\"" + "../services/" + OslcConstants.PATH_RESOURCE_SHAPES + "/" + SysmlDomainConstants.ELEMENT_PATH + "\">" + SysmlDomainConstants.ELEMENT_LOCALNAME + "</a>" + "'}",
        responses = {@ApiResponse(description = "default response",
            content = {@Content(mediaType = OslcMediaType.APPLICATION_RDF_XML), @Content(
                mediaType = OslcMediaType.APPLICATION_XML), @Content(
                mediaType = OslcMediaType.APPLICATION_JSON), @Content(
                mediaType = OslcMediaType.TEXT_TURTLE), @Content(
                mediaType = MediaType.TEXT_HTML), @Content(
                mediaType = OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML)})
        }
    )
    public Compact getElementCompact(
        @PathParam("projectId") final String projectId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        String iconUri = OSLC4JUtils.getPublicURI() + "/images/ui_preview_icon.gif";
        String smallPreviewHintHeight = "200px";
        String smallPreviewHintWidth = "300px";
        String largePreviewHintHeight = "400px";
        String largePreviewHintWidth = "600px";

        // Start of user code getElementCompact_init
        //TODO: adjust the preview height & width values from the default values provided above.
        // End of user code

        final Element aElement = delegate.getElement(httpServletRequest, projectId, id);

        if (aElement != null) {
            final Compact compact = new Compact();

            compact.setAbout(aElement.getAbout());
            compact.setTitle(aElement.toString());

            compact.setIcon(new URI(iconUri));

            //Create and set attributes for OSLC preview resource
            final Preview smallPreview = new Preview();
            smallPreview.setHintHeight(smallPreviewHintHeight);
            smallPreview.setHintWidth(smallPreviewHintWidth);
            smallPreview.setDocument(UriBuilder.fromUri(aElement.getAbout()).path("smallPreview").build());
            compact.setSmallPreview(smallPreview);

            final Preview largePreview = new Preview();
            largePreview.setHintHeight(largePreviewHintHeight);
            largePreview.setHintWidth(largePreviewHintWidth);
            largePreview.setDocument(UriBuilder.fromUri(aElement.getAbout()).path("largePreview").build());
            compact.setLargePreview(largePreview);

            httpServletResponse.addHeader(ServerConstants.HDR_OSLC_VERSION, ServerConstants.OSLC_VERSION_V2);
            addCORSHeaders(httpServletResponse);
            return compact;
        }
        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}/smallPreview")
    @Produces({ MediaType.TEXT_HTML })
    public void getElementAsHtmlSmallPreview(
        @PathParam("projectId") final String projectId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        // Start of user code getElementAsHtmlSmallPreview_init
        // End of user code

        final Element aElement = delegate.getElement(httpServletRequest, projectId, id);

        if (aElement != null) {
            httpServletRequest.setAttribute("aElement", aElement);
            // Start of user code getElementAsHtmlSmallPreview_setAttributes
            // End of user code

            try {
                httpServletRequest.setAttribute("resourceTitle", aElement.toString());
                ArrayList<String> getterMethodNames = new ArrayList<String>(Arrays.asList("getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                // Start of user code getElementAsHtmlSmallPreview_setResourceGetterMethods
                switch (aElement.getClass().getSimpleName()) {
                case "Relationship":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("getRelatedElement", "getTarget", "getSysmlSource", "getOwningRelatedElement", "getOwnedRelatedElement", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;
                case "Class":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("getOwnedSubclassification", "isIsAbstract", "isIsSufficient", "isIsConjugated", "getOwnedSpecialization", "getOwnedFeatureMembership", "getOwnedFeature", "getOwnedEndFeature", "getFeature", "getInput", "getOutput", "getInheritedMembership", "getEndFeature", "getOwnedConjugator", "getFeatureMembership", "getInheritedFeature", "getMultiplicity", "getDirectedFeature", "getOwnedDisjoining", "getOwnedMembership", "getOwnedMember", "getMembership", "getOwnedImport", "getMember", "getImportedMembership", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;
                case "Feature":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("isIsUnique", "isIsOrdered", "isIsComposite", "isIsPortion", "isIsDerived", "isIsReadOnly", "isIsEnd", "getDirection", "isIsNonunique", "getOwningType", "getSysmlType", "getOwnedRedefinition", "getOwnedSubsetting", "getOwningFeatureMembership", "getEndOwningType", "getOwnedTyping", "getFeaturingType", "getOwnedTypeFeaturing", "getChainingFeature", "getOwnedFeatureChaining", "isIsAbstract", "isIsSufficient", "isIsConjugated", "getOwnedSpecialization", "getOwnedFeatureMembership", "getOwnedFeature", "getOwnedEndFeature", "getFeature", "getInput", "getOutput", "getInheritedMembership", "getEndFeature", "getOwnedConjugator", "getFeatureMembership", "getInheritedFeature", "getMultiplicity", "getDirectedFeature", "getOwnedDisjoining", "getOwnedMembership", "getOwnedMember", "getMembership", "getOwnedImport", "getMember", "getImportedMembership", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;
                case "Subsetting":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("getSubsettedFeature", "getSubsettingFeature", "getOwningFeature", "getGeneral", "getSpecific", "getOwningType", "getRelatedElement", "getTarget", "getSysmlSource", "getOwningRelatedElement", "getOwnedRelatedElement", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;

                default:
                    break;
                }
                // End of user code
                String oslcPreviewDataSetAsString = PreviewFactory.getPreviewAsJsonString(aElement, getterMethodNames, false);
                httpServletRequest.setAttribute("resourcePreviewDataSet", oslcPreviewDataSetAsString);
            } catch (Exception e) {
                log.error("Could not handle smallPreview", e);
                throw new WebApplicationException("Could not handle smallPreview", e);
            }
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/uipreview.jsp");
            httpServletResponse.addHeader(ServerConstants.HDR_OSLC_VERSION, ServerConstants.OSLC_VERSION_V2);
            addCORSHeaders(httpServletResponse);
            rd.forward(httpServletRequest, httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }

    @GET
    @Path("{id}/largePreview")
    @Produces({ MediaType.TEXT_HTML })
    public void getElementAsHtmlLargePreview(
        @PathParam("projectId") final String projectId, @PathParam("id") final String id
        ) throws ServletException, IOException, URISyntaxException
    {
        // Start of user code getElementAsHtmlLargePreview_init
        // End of user code

        final Element aElement = delegate.getElement(httpServletRequest, projectId, id);

        if (aElement != null) {
            httpServletRequest.setAttribute("aElement", aElement);
            // Start of user code getElementAsHtmlLargePreview_setAttributes
            // End of user code

            try {
                httpServletRequest.setAttribute("resourceTitle", aElement.toString());
                ArrayList<String> getterMethodNames = new ArrayList<String>(Arrays.asList("getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                // Start of user code getElementAsHtmlLargePreview_setResourceGetterMethods
                switch (aElement.getClass().getSimpleName()) {
                case "Relationship":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("getRelatedElement", "getTarget", "getSysmlSource", "getOwningRelatedElement", "getOwnedRelatedElement", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;
                case "Class":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("getOwnedSubclassification", "isIsAbstract", "isIsSufficient", "isIsConjugated", "getOwnedSpecialization", "getOwnedFeatureMembership", "getOwnedFeature", "getOwnedEndFeature", "getFeature", "getInput", "getOutput", "getInheritedMembership", "getEndFeature", "getOwnedConjugator", "getFeatureMembership", "getInheritedFeature", "getMultiplicity", "getDirectedFeature", "getOwnedDisjoining", "getOwnedMembership", "getOwnedMember", "getMembership", "getOwnedImport", "getMember", "getImportedMembership", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;
                case "Feature":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("isIsUnique", "isIsOrdered", "isIsComposite", "isIsPortion", "isIsDerived", "isIsReadOnly", "isIsEnd", "getDirection", "isIsNonunique", "getOwningType", "getSysmlType", "getOwnedRedefinition", "getOwnedSubsetting", "getOwningFeatureMembership", "getEndOwningType", "getOwnedTyping", "getFeaturingType", "getOwnedTypeFeaturing", "getChainingFeature", "getOwnedFeatureChaining", "isIsAbstract", "isIsSufficient", "isIsConjugated", "getOwnedSpecialization", "getOwnedFeatureMembership", "getOwnedFeature", "getOwnedEndFeature", "getFeature", "getInput", "getOutput", "getInheritedMembership", "getEndFeature", "getOwnedConjugator", "getFeatureMembership", "getInheritedFeature", "getMultiplicity", "getDirectedFeature", "getOwnedDisjoining", "getOwnedMembership", "getOwnedMember", "getMembership", "getOwnedImport", "getMember", "getImportedMembership", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;
                case "Subsetting":
                    getterMethodNames = new ArrayList<String>(Arrays.asList("getSubsettedFeature", "getSubsettingFeature", "getOwningFeature", "getGeneral", "getSpecific", "getOwningType", "getRelatedElement", "getTarget", "getSysmlSource", "getOwningRelatedElement", "getOwnedRelatedElement", "getSysmlIdentifier", "getName", "getQualifiedName", "getEffectiveName", "getAliasId", "getHumanId", "getOwningMembership", "getOwnedRelationship", "getOwningRelationship", "getOwningNamespace", "getOwner", "getOwnedElement", "getDocumentation", "getOwnedAnnotation", "getDocumentationComment", "getOwnedTextualRepresentation", "getContributor", "getCreated", "getCreator", "getDescription", "getIdentifier", "getModified", "getSource", "getTitle", "getType", "getInstanceShape", "getServiceProvider", "getShortTitle", "getExternal", "getTrace", "getRefine", "getDerives", "getElaborates", "getSatisfy"));
                    break;

                default:
                    break;
                }
                // End of user code
                String oslcPreviewDataSetAsString = PreviewFactory.getPreviewAsJsonString(aElement, getterMethodNames, true);
                httpServletRequest.setAttribute("resourcePreviewDataSet", oslcPreviewDataSetAsString);
            } catch (Exception e) {
                log.error("Could not handle largePreview", e);
                throw new WebApplicationException("Could not handle largePreview", e);
            }
            RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/org/oasis/oslcop/sysml/uipreview.jsp");
            httpServletResponse.addHeader(ServerConstants.HDR_OSLC_VERSION, ServerConstants.OSLC_VERSION_V2);
            addCORSHeaders(httpServletResponse);
            rd.forward(httpServletRequest, httpServletResponse);
            return;
        }

        throw new WebApplicationException(Status.NOT_FOUND);
    }
}
