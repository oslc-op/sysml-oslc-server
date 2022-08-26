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

// Start of user code Notice
//Note: The Lyo code generator is migrating the name of this class from 'SysmlServerResourcesFactory' to the new shorter name 'ResourcesFactory'.
//You are still using the old name. The generator will continue to use this old name until you actively trigger the change.
//To migrate to the new class name:
//1. Rename your class to ResourcesFactory 
//    * Please rename and do not simply create a copy of the file. The generator needs to detect the file deletion in order to activate the name change.
//2. Regenerate the code. 
//    * The generator will generate this class with the new name.
//    * Besides the class name, the code - including the user clode blocks - remain intact.
//    * All other class references to the new class name are updated.
//3. Delete this notice
// End of user code

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc.domains.Agent;
import org.oasis.oslcop.sysml.AnnotatingElement;
import org.oasis.oslcop.sysml.Annotation;
import org.eclipse.lyo.oslc.domains.RdfsClass;
import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Comment;
import org.eclipse.lyo.oslc.domains.config.Component;
import org.eclipse.lyo.oslc.domains.config.ConceptResource;
import org.eclipse.lyo.oslc.domains.config.Configuration;
import org.oasis.oslcop.sysml.Conjugation;
import org.eclipse.lyo.oslc.domains.config.Contribution;
import org.oasis.oslcop.sysml.Disjoining;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureChaining;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.eclipse.lyo.oslc.domains.am.Resource;
import org.eclipse.lyo.oslc.domains.config.Selections;
import org.oasis.oslcop.sysml.Specialization;
import org.oasis.oslcop.sysml.Subclassification;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.TypeFeaturing;
import org.eclipse.lyo.oslc.domains.config.VersionResource;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerResourcesFactory {

    private String basePath;

    // Start of user code class_attributes
    // End of user code

    public SysmlServerResourcesFactory(String basePath) {
        this.basePath = basePath;
    }

    // Start of user code class_methods
    // End of user code

    //methods for SysmlClass resource
    
    public SysmlClass createSysmlClass(final String projectId, final String id) {
        return new SysmlClass(constructURIForSysmlClass(projectId, id));
    }
    
    public URI constructURIForSysmlClass(final String projectId, final String id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/classes/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(this.basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForSysmlClass(final String projectId, final String id , final String label) {
        return new Link(constructURIForSysmlClass(projectId, id), label);
    }
    
    public Link constructLinkForSysmlClass(final String projectId, final String id) {
        return new Link(constructURIForSysmlClass(projectId, id));
    }
    

    //methods for Component resource
    
    public Component createComponent(final String id) {
        return new Component(constructURIForComponent(id));
    }
    
    public URI constructURIForComponent(final String id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("id", id);
        String instanceURI = "components/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(this.basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForComponent(final String id , final String label) {
        return new Link(constructURIForComponent(id), label);
    }
    
    public Link constructLinkForComponent(final String id) {
        return new Link(constructURIForComponent(id));
    }
    

    //methods for Element resource
    
    public Element createElement(final String projectId, final String id) {
        return new Element(constructURIForElement(projectId, id));
    }
    
    public URI constructURIForElement(final String projectId, final String id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/elements/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(this.basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForElement(final String projectId, final String id , final String label) {
        return new Link(constructURIForElement(projectId, id), label);
    }
    
    public Link constructLinkForElement(final String projectId, final String id) {
        return new Link(constructURIForElement(projectId, id));
    }
    

    //methods for Feature resource
    
    public Feature createFeature(final String projectId, final String id) {
        return new Feature(constructURIForFeature(projectId, id));
    }
    
    public URI constructURIForFeature(final String projectId, final String id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/features/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(this.basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForFeature(final String projectId, final String id , final String label) {
        return new Link(constructURIForFeature(projectId, id), label);
    }
    
    public Link constructLinkForFeature(final String projectId, final String id) {
        return new Link(constructURIForFeature(projectId, id));
    }
    

    //methods for Relationship resource
    
    public Relationship createRelationship(final String projectId, final String id) {
        return new Relationship(constructURIForRelationship(projectId, id));
    }
    
    public URI constructURIForRelationship(final String projectId, final String id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/relationships/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(this.basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForRelationship(final String projectId, final String id , final String label) {
        return new Link(constructURIForRelationship(projectId, id), label);
    }
    
    public Link constructLinkForRelationship(final String projectId, final String id) {
        return new Link(constructURIForRelationship(projectId, id));
    }
    

    //methods for Subsetting resource
    
    public Subsetting createSubsetting(final String projectId, final String id) {
        return new Subsetting(constructURIForSubsetting(projectId, id));
    }
    
    public URI constructURIForSubsetting(final String projectId, final String id) {
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/subsettings/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(this.basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public Link constructLinkForSubsetting(final String projectId, final String id , final String label) {
        return new Link(constructURIForSubsetting(projectId, id), label);
    }
    
    public Link constructLinkForSubsetting(final String projectId, final String id) {
        return new Link(constructURIForSubsetting(projectId, id));
    }
    

}
