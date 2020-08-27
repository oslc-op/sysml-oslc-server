// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2017 Jad El-khoury.
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
 *     Jad El-khoury        - initial implementation
 *     
 *******************************************************************************/
// End of user code

package org.oasis.oslcop.sysml;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
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
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.Type;

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
    
    public static SysmlClass createSysmlClass(final String projectId, final String commitId, final String id)
    {
        return new SysmlClass(constructURIForSysmlClass(projectId, commitId, id));
    }
    
    public static URI constructURIForSysmlClass(final String projectId, final String commitId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("commitId", commitId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/commits/{commitId}/classes/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForSysmlClass(final String projectId, final String commitId, final String id , final String label)
    {
        return new Link(constructURIForSysmlClass(projectId, commitId, id), label);
    }
    
    public static Link constructLinkForSysmlClass(final String projectId, final String commitId, final String id)
    {
        return new Link(constructURIForSysmlClass(projectId, commitId, id));
    }
    

    //methods for Element resource
    
    public static Element createElement(final String projectId, final String commitId, final String id)
    {
        return new Element(constructURIForElement(projectId, commitId, id));
    }
    
    public static URI constructURIForElement(final String projectId, final String commitId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("commitId", commitId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/commits/{commitId}/elements/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForElement(final String projectId, final String commitId, final String id , final String label)
    {
        return new Link(constructURIForElement(projectId, commitId, id), label);
    }
    
    public static Link constructLinkForElement(final String projectId, final String commitId, final String id)
    {
        return new Link(constructURIForElement(projectId, commitId, id));
    }
    

    //methods for Generalization resource
    
    public static Generalization createGeneralization(final String projectId, final String commitId, final String id)
    {
        return new Generalization(constructURIForGeneralization(projectId, commitId, id));
    }
    
    public static URI constructURIForGeneralization(final String projectId, final String commitId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("commitId", commitId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/commits/{commitId}/generalizations/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForGeneralization(final String projectId, final String commitId, final String id , final String label)
    {
        return new Link(constructURIForGeneralization(projectId, commitId, id), label);
    }
    
    public static Link constructLinkForGeneralization(final String projectId, final String commitId, final String id)
    {
        return new Link(constructURIForGeneralization(projectId, commitId, id));
    }
    

    //methods for Relationship resource
    
    public static Relationship createRelationship(final String projectId, final String commitId, final String id)
    {
        return new Relationship(constructURIForRelationship(projectId, commitId, id));
    }
    
    public static URI constructURIForRelationship(final String projectId, final String commitId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("commitId", commitId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/commits/{commitId}/relationships/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForRelationship(final String projectId, final String commitId, final String id , final String label)
    {
        return new Link(constructURIForRelationship(projectId, commitId, id), label);
    }
    
    public static Link constructLinkForRelationship(final String projectId, final String commitId, final String id)
    {
        return new Link(constructURIForRelationship(projectId, commitId, id));
    }
    

    //methods for Subsetting resource
    
    public static Subsetting createSubsetting(final String projectId, final String commitId, final String id)
    {
        return new Subsetting(constructURIForSubsetting(projectId, commitId, id));
    }
    
    public static URI constructURIForSubsetting(final String projectId, final String commitId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("commitId", commitId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/commits/{commitId}/subsettings/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForSubsetting(final String projectId, final String commitId, final String id , final String label)
    {
        return new Link(constructURIForSubsetting(projectId, commitId, id), label);
    }
    
    public static Link constructLinkForSubsetting(final String projectId, final String commitId, final String id)
    {
        return new Link(constructURIForSubsetting(projectId, commitId, id));
    }
    

}
