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

package org.oasis.oslcop.sysml;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.oasis.oslcop.sysml.AnnotatingElement;
import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.eclipse.lyo.oslc.domains.am.Resource;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.TypeFeaturing;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for SysmlClass resource
    
    public static SysmlClass createSysmlClass(final String projectId, final String id)
    {
        return new SysmlClass(constructURIForSysmlClass(projectId, id));
    }
    
    public static URI constructURIForSysmlClass(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/classes/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForSysmlClass(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForSysmlClass(projectId, id), label);
    }
    
    public static Link constructLinkForSysmlClass(final String projectId, final String id)
    {
        return new Link(constructURIForSysmlClass(projectId, id));
    }
    

    //methods for Element resource
    
    public static Element createElement(final String projectId, final String id)
    {
        return new Element(constructURIForElement(projectId, id));
    }
    
    public static URI constructURIForElement(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/elements/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForElement(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForElement(projectId, id), label);
    }
    
    public static Link constructLinkForElement(final String projectId, final String id)
    {
        return new Link(constructURIForElement(projectId, id));
    }
    

    //methods for Generalization resource
    
    public static Generalization createGeneralization(final String projectId, final String id)
    {
        return new Generalization(constructURIForGeneralization(projectId, id));
    }
    
    public static URI constructURIForGeneralization(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/generalizations/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForGeneralization(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForGeneralization(projectId, id), label);
    }
    
    public static Link constructLinkForGeneralization(final String projectId, final String id)
    {
        return new Link(constructURIForGeneralization(projectId, id));
    }
    

    //methods for Relationship resource
    
    public static Relationship createRelationship(final String projectId, final String id)
    {
        return new Relationship(constructURIForRelationship(projectId, id));
    }
    
    public static URI constructURIForRelationship(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/relationships/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForRelationship(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForRelationship(projectId, id), label);
    }
    
    public static Link constructLinkForRelationship(final String projectId, final String id)
    {
        return new Link(constructURIForRelationship(projectId, id));
    }
    

    //methods for Subsetting resource
    
    public static Subsetting createSubsetting(final String projectId, final String id)
    {
        return new Subsetting(constructURIForSubsetting(projectId, id));
    }
    
    public static URI constructURIForSubsetting(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/subsettings/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForSubsetting(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForSubsetting(projectId, id), label);
    }
    
    public static Link constructLinkForSubsetting(final String projectId, final String id)
    {
        return new Link(constructURIForSubsetting(projectId, id));
    }
    

}
