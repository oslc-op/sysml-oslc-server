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

package org.oasis.oslcop.sysml.servlet;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AllowedValues;
import org.eclipse.lyo.oslc4j.core.model.Compact;
import org.eclipse.lyo.oslc4j.core.model.CreationFactory;
import org.eclipse.lyo.oslc4j.core.model.Dialog;
import org.eclipse.lyo.oslc4j.core.model.Error;
import org.eclipse.lyo.oslc4j.core.model.ExtendedError;
import org.eclipse.lyo.oslc4j.core.model.OAuthConfiguration;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.PrefixDefinition;
import org.eclipse.lyo.oslc4j.core.model.Preview;
import org.eclipse.lyo.oslc4j.core.model.Property;
import org.eclipse.lyo.oslc4j.core.model.Publisher;
import org.eclipse.lyo.oslc4j.core.model.QueryCapability;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;
import org.eclipse.lyo.oslc4j.provider.json4j.Json4JProvidersRegistry;

import io.swagger.v3.jaxrs2.integration.resources.AcceptHeaderOpenApiResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.oasis.oslcop.sysml.services.RootServicesService;
import org.oasis.oslcop.sysml.services.ServiceProviderCatalogService;
import org.oasis.oslcop.sysml.services.ServiceProviderService;
import org.oasis.oslcop.sysml.services.ResourceShapeService;

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
import org.eclipse.lyo.oslc.domains.am.Oslc_amDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc.domains.jazz_am.Jazz_amDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.services.ServiceProviderService1;
import org.oasis.oslcop.sysml.services.ServiceProviderService2;
import org.oasis.oslcop.sysml.services.ServiceProviderService3;
import org.oasis.oslcop.sysml.services.ServiceProviderService4;
import org.oasis.oslcop.sysml.services.ServiceProviderService5;
import org.oasis.oslcop.sysml.services.ServiceProviderService6;
import org.oasis.oslcop.sysml.services.ServiceProviderService7;
import org.oasis.oslcop.sysml.services.ServiceProviderService8;
import org.oasis.oslcop.sysml.services.ServiceProviderService9;
import org.oasis.oslcop.sysml.services.ServiceProviderService10;
import org.oasis.oslcop.sysml.services.ServiceProviderService11;
import org.oasis.oslcop.sysml.services.SubsettingService;
import org.oasis.oslcop.sysml.services.ElementService;
import org.oasis.oslcop.sysml.services.ClassService;
import org.oasis.oslcop.sysml.services.RelationshipService;
import org.oasis.oslcop.sysml.services.GeneralizationService;
import org.oasis.oslcop.sysml.services.FeatureService;
import org.oasis.oslcop.sysml.services.FeatureMembershipService;
import org.oasis.oslcop.sysml.services.FeatureTypingService;
import org.oasis.oslcop.sysml.services.PortUsageService;
import org.oasis.oslcop.sysml.services.AttributeUsageService;
import org.oasis.oslcop.sysml.services.PartUsageService;

// Start of user code imports
import org.oasis.oslcop.sysml.services.StoreService;
import org.oasis.oslcop.sysml.services.PopulationService;
// End of user code

// Start of user code pre_class_code
// End of user code

/**
 * Generated by Lyo Designer 4.2.0.qualifier
 */

@OpenAPIDefinition(info = @Info(title = "Sysml Server", version = "1.0.0"), servers = @Server(url = "/sysml_oslc_server/services/"))
public class Application extends javax.ws.rs.core.Application {

    private static final Set<Class<?>>         RESOURCE_CLASSES                          = new HashSet<Class<?>>();
    private static final Map<String, Class<?>> RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP = new HashMap<String, Class<?>>();

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    @Override
    public Set<Object> getSingletons() {
        return Collections.singleton(new ApplicationBinder());
    }
    static
    {
        RESOURCE_CLASSES.addAll(JenaProvidersRegistry.getProviders());
        RESOURCE_CLASSES.addAll(Json4JProvidersRegistry.getProviders());
        RESOURCE_CLASSES.add(ServiceProviderService1.class);
        RESOURCE_CLASSES.add(ServiceProviderService2.class);
        RESOURCE_CLASSES.add(ServiceProviderService3.class);
        RESOURCE_CLASSES.add(ServiceProviderService4.class);
        RESOURCE_CLASSES.add(ServiceProviderService5.class);
        RESOURCE_CLASSES.add(ServiceProviderService6.class);
        RESOURCE_CLASSES.add(ServiceProviderService7.class);
        RESOURCE_CLASSES.add(ServiceProviderService8.class);
        RESOURCE_CLASSES.add(ServiceProviderService9.class);
        RESOURCE_CLASSES.add(ServiceProviderService10.class);
        RESOURCE_CLASSES.add(ServiceProviderService11.class);
        RESOURCE_CLASSES.add(SubsettingService.class);
        RESOURCE_CLASSES.add(ElementService.class);
        RESOURCE_CLASSES.add(ClassService.class);
        RESOURCE_CLASSES.add(RelationshipService.class);
        RESOURCE_CLASSES.add(GeneralizationService.class);
        RESOURCE_CLASSES.add(FeatureService.class);
        RESOURCE_CLASSES.add(FeatureMembershipService.class);
        RESOURCE_CLASSES.add(FeatureTypingService.class);
        RESOURCE_CLASSES.add(PortUsageService.class);
        RESOURCE_CLASSES.add(AttributeUsageService.class);
        RESOURCE_CLASSES.add(PartUsageService.class);

        // Catalog resources
        RESOURCE_CLASSES.add(ServiceProviderCatalogService.class);
        RESOURCE_CLASSES.add(ServiceProviderService.class);
        RESOURCE_CLASSES.add(ResourceShapeService.class);

        // Swagger resources
        RESOURCE_CLASSES.add(OpenApiResource.class);
        RESOURCE_CLASSES.add(AcceptHeaderOpenApiResource.class);

        // OAuth resources
        RESOURCE_CLASSES.add(RootServicesService.class);
        try {
            RESOURCE_CLASSES.add(Class.forName("org.eclipse.lyo.server.oauth.webapp.services.ConsumersService"));
            RESOURCE_CLASSES.add(Class.forName("org.eclipse.lyo.server.oauth.webapp.services.OAuthService"));
        } catch (ClassNotFoundException e) {
            // Start of user code OAuthServiceClasses_notFound
            // End of user code
        }
        
        // Start of user code Custom Resource Classes
        RESOURCE_CLASSES.add(PopulationService.class);
        RESOURCE_CLASSES.add(StoreService.class);
        // End of user code

        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_ALLOWED_VALUES,           AllowedValues.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_COMPACT,                  Compact.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_CREATION_FACTORY,         CreationFactory.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_DIALOG,                   Dialog.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_ERROR,                    Error.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_EXTENDED_ERROR,           ExtendedError.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_OAUTH_CONFIGURATION,      OAuthConfiguration.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PREFIX_DEFINITION,        PrefixDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PREVIEW,                  Preview.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PROPERTY,                 Property.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PUBLISHER,                Publisher.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_QUERY_CAPABILITY,         QueryCapability.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_RESOURCE_SHAPE,           ResourceShape.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE,                  Service.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE_PROVIDER,         ServiceProvider.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE_PROVIDER_CATALOG, ServiceProviderCatalog.class);

        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ACCEPTACTIONUSAGE_PATH, AcceptActionUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ACTIONDEFINITION_PATH, ActionDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ACTIONUSAGE_PATH, ActionUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ALLOCATIONDEFINITION_PATH, AllocationDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ALLOCATIONUSAGE_PATH, AllocationUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ANALYSISCASEDEFINITION_PATH, AnalysisCaseDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ANALYSISCASEUSAGE_PATH, AnalysisCaseUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ANNOTATINGELEMENT_PATH, AnnotatingElement.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ANNOTATION_PATH, Annotation.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ASSOCIATION_PATH, Association.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ASSOCIATIONSTRUCTURE_PATH, AssociationStructure.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ATTRIBUTEDEFINITION_PATH, AttributeDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ATTRIBUTEUSAGE_PATH, AttributeUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.BEHAVIOR_PATH, Behavior.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.BOOLEANEXPRESSION_PATH, BooleanExpression.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CALCULATIONDEFINITION_PATH, CalculationDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CALCULATIONUSAGE_PATH, CalculationUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CASEDEFINITION_PATH, CaseDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CASEUSAGE_PATH, CaseUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CLASS_PATH, SysmlClass.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CLASSIFIER_PATH, Classifier.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.COMMENT_PATH, Comment.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONJUGATEDPORTDEFINITION_PATH, ConjugatedPortDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONJUGATION_PATH, Conjugation.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONNECTIONDEFINITION_PATH, ConnectionDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONNECTIONUSAGE_PATH, ConnectionUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONNECTOR_PATH, Connector.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONSTRAINTDEFINITION_PATH, ConstraintDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONSTRAINTUSAGE_PATH, ConstraintUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.DATATYPE_PATH, DataType.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.DEFINITION_PATH, Definition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.DOCUMENTATION_PATH, Documentation.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ELEMENT_PATH, Element.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ENUMERATIONDEFINITION_PATH, EnumerationDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ENUMERATIONUSAGE_PATH, EnumerationUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.EXPRESSION_PATH, Expression.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FEATURE_PATH, Feature.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FEATUREMEMBERSHIP_PATH, FeatureMembership.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FEATURETYPING_PATH, FeatureTyping.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FUNCTION_PATH, Function.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.GENERALIZATION_PATH, Generalization.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.IMPORT_PATH, SysmlImport.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.INDIVIDUALDEFINITION_PATH, IndividualDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.INDIVIDUALUSAGE_PATH, IndividualUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.INTERFACEDEFINITION_PATH, InterfaceDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.INTERFACEUSAGE_PATH, InterfaceUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ITEMDEFINITION_PATH, ItemDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ITEMUSAGE_PATH, ItemUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.MEMBERSHIP_PATH, Membership.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.MULTIPLICITY_PATH, Multiplicity.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.NAMESPACE_PATH, Namespace.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PARTDEFINITION_PATH, PartDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PARTUSAGE_PATH, PartUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(FoafDomainConstants.PERSON_PATH, Person.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PORTCONJUGATION_PATH, PortConjugation.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PORTDEFINITION_PATH, PortDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PORTUSAGE_PATH, PortUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PREDICATE_PATH, Predicate.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.REDEFINITION_PATH, Redefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.REFERENCEUSAGE_PATH, ReferenceUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.RELATIONSHIP_PATH, Relationship.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.RENDERINGDEFINITION_PATH, RenderingDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.RENDERINGUSAGE_PATH, RenderingUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.REQUIREMENTDEFINITION_PATH, RequirementDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.REQUIREMENTUSAGE_PATH, RequirementUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(Oslc_amDomainConstants.RESOURCE_PATH, Resource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.STATEUSAGE_PATH, StateUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.STEP_PATH, Step.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.STRUCTURE_PATH, Structure.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.SUBSETTING_PATH, Subsetting.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.SUCCESSION_PATH, Succession.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.SUPERCLASSING_PATH, Superclassing.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.TEXTUALREPRESENTATION_PATH, TextualRepresentation.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.TRANSITIONUSAGE_PATH, TransitionUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.TYPE_PATH, Type.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.TYPEFEATURING_PATH, TypeFeaturing.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.USAGE_PATH, Usage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VARIANTMEMBERSHIP_PATH, VariantMembership.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VERIFICATIONCASEDEFINITION_PATH, VerificationCaseDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VERIFICATIONCASEUSAGE_PATH, VerificationCaseUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VIEWDEFINITION_PATH, ViewDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VIEWUSAGE_PATH, ViewUsage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VIEWPOINTDEFINITION_PATH, ViewpointDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.VIEWPOINTUSAGE_PATH, ViewpointUsage.class);
    }

    @Inject
    public Application(ServiceLocator locator)
           throws OslcCoreApplicationException,
                  URISyntaxException
    {
        ServiceLocatorUtilities.enableImmediateScope(locator);
        final String BASE_URI = "http://localhost/validatingResourceShapes";
        for (final Map.Entry<String, Class<?>> entry : RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.entrySet()) {
            ResourceShapeFactory.createResourceShape(BASE_URI, OslcConstants.PATH_RESOURCE_SHAPES, entry.getKey(), entry.getValue());
        }
    }

    @Override 
    public Set<Class<?>> getClasses() { 
        return RESOURCE_CLASSES; 
    }

    public static Map<String, Class<?>> getResourceShapePathToResourceClassMap() {
        return RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP;
    }
}
