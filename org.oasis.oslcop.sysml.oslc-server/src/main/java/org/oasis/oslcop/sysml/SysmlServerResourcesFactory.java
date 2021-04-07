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

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for AttributeUsage resource
    
    public static AttributeUsage createAttributeUsage(final String projectId, final String id)
    {
        return new AttributeUsage(constructURIForAttributeUsage(projectId, id));
    }
    
    public static URI constructURIForAttributeUsage(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/attributeUsages/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForAttributeUsage(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForAttributeUsage(projectId, id), label);
    }
    
    public static Link constructLinkForAttributeUsage(final String projectId, final String id)
    {
        return new Link(constructURIForAttributeUsage(projectId, id));
    }
    

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
    

    //methods for Feature resource
    
    public static Feature createFeature(final String projectId, final String id)
    {
        return new Feature(constructURIForFeature(projectId, id));
    }
    
    public static URI constructURIForFeature(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/features/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForFeature(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForFeature(projectId, id), label);
    }
    
    public static Link constructLinkForFeature(final String projectId, final String id)
    {
        return new Link(constructURIForFeature(projectId, id));
    }
    

    //methods for FeatureMembership resource
    
    public static FeatureMembership createFeatureMembership(final String projectId, final String id)
    {
        return new FeatureMembership(constructURIForFeatureMembership(projectId, id));
    }
    
    public static URI constructURIForFeatureMembership(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/featureMemberships/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForFeatureMembership(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForFeatureMembership(projectId, id), label);
    }
    
    public static Link constructLinkForFeatureMembership(final String projectId, final String id)
    {
        return new Link(constructURIForFeatureMembership(projectId, id));
    }
    

    //methods for FeatureTyping resource
    
    public static FeatureTyping createFeatureTyping(final String projectId, final String id)
    {
        return new FeatureTyping(constructURIForFeatureTyping(projectId, id));
    }
    
    public static URI constructURIForFeatureTyping(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/featureTypings/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForFeatureTyping(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForFeatureTyping(projectId, id), label);
    }
    
    public static Link constructLinkForFeatureTyping(final String projectId, final String id)
    {
        return new Link(constructURIForFeatureTyping(projectId, id));
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
    

    //methods for PartUsage resource
    
    public static PartUsage createPartUsage(final String projectId, final String id)
    {
        return new PartUsage(constructURIForPartUsage(projectId, id));
    }
    
    public static URI constructURIForPartUsage(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/partUsages/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForPartUsage(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForPartUsage(projectId, id), label);
    }
    
    public static Link constructLinkForPartUsage(final String projectId, final String id)
    {
        return new Link(constructURIForPartUsage(projectId, id));
    }
    

    //methods for PortUsage resource
    
    public static PortUsage createPortUsage(final String projectId, final String id)
    {
        return new PortUsage(constructURIForPortUsage(projectId, id));
    }
    
    public static URI constructURIForPortUsage(final String projectId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("projectId", projectId);
        pathParameters.put("id", id);
        String instanceURI = "projects/{projectId}/portUsages/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForPortUsage(final String projectId, final String id , final String label)
    {
        return new Link(constructURIForPortUsage(projectId, id), label);
    }
    
    public static Link constructLinkForPortUsage(final String projectId, final String id)
    {
        return new Link(constructURIForPortUsage(projectId, id));
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
