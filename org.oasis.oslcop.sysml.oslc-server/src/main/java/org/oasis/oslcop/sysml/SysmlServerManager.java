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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContextEvent;
import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.ServiceProviderInfo;
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
import java.net.URI;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;
import org.eclipse.lyo.store.ModelUnmarshallingException;
import org.eclipse.lyo.store.Store;
import org.eclipse.lyo.store.StorePool;
import org.eclipse.lyo.store.StoreAccessException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;




// Start of user code imports
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFReader;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.RDF;

import org.oasis.oslcop.sysml.json.Project;
import org.oasis.oslcop.sysml.json.ProjectCommit;
import org.oasis.oslcop.sysml.services.PopulationService;
import org.oasis.oslcop.sysml.services.StoreService;
// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerManager {

    private static final Logger log = LoggerFactory.getLogger(SysmlServerManager.class);

    private static StorePool storePool;
    
    // Start of user code class_attributes
    private static URI sparqlQueryEndpoint;
    private static ServiceProviderInfo[] serviceProviders = null;

    // End of user code
    
    
    // Start of user code class_methods
    public static StorePool getStorePool() {
		return storePool;
	}
    public static URI getSparqlQueryEndpoint() {
        return sparqlQueryEndpoint;
    }
    // End of user code

    public static void contextInitializeServletListener(final ServletContextEvent servletContextEvent)
    {
        
        // Start of user code contextInitializeServletListener
        // TODO Implement code to establish connection to data backbone etc ...
        // End of user code
        // Start of user code StoreInitialise
        // End of user code
        Properties lyoStoreProperties = new Properties();
        String lyoStorePropertiesFile = StorePool.class.getResource("/store.properties").getFile();
        try {
            lyoStoreProperties.load(new FileInputStream(lyoStorePropertiesFile));
        } catch (IOException e) {
            log.error("Failed to initialize Store. properties file for Store configuration could not be loaded.", e);
            throw new RuntimeException(e);
        }
        
        int initialPoolSize = Integer.parseInt(lyoStoreProperties.getProperty("initialPoolSize"));
        URI defaultNamedGraph;
        URI sparqlUpdateEndpoint;
        try {
            defaultNamedGraph = new URI(lyoStoreProperties.getProperty("defaultNamedGraph"));
            sparqlQueryEndpoint = new URI(lyoStoreProperties.getProperty("sparqlQueryEndpoint"));
            sparqlUpdateEndpoint = new URI(lyoStoreProperties.getProperty("sparqlUpdateEndpoint"));
        } catch (URISyntaxException e) {
            log.error("Failed to initialize Store. One of the configuration property ('defaultNamedGraph' or 'sparqlQueryEndpoint' or 'sparqlUpdateEndpoint') is not a valid URI.", e);
            throw new RuntimeException(e);
        }
        String userName = null;
        String password = null;
        storePool = new StorePool(initialPoolSize, defaultNamedGraph, sparqlQueryEndpoint, sparqlUpdateEndpoint, userName, password);
        // Start of user code StoreFinalize
        // End of user code
        
    }

    public static void contextDestroyServletListener(ServletContextEvent servletContextEvent) 
    {
        
        // Start of user code contextDestroyed
        // TODO Implement code to shutdown connections to data backbone etc...
        // End of user code
    }

    public static ServiceProviderInfo[] getServiceProviderInfos(HttpServletRequest httpServletRequest)
    {
        ServiceProviderInfo[] serviceProviderInfos = {};
        
        // Start of user code "ServiceProviderInfo[] getServiceProviderInfos(...)"

        //TODO: Need to make this logic robust, and thread-safe
//        if (null != serviceProviders) {
//        	return serviceProviders;
//        }
//        List<ServiceProviderInfo> sps = new ArrayList<ServiceProviderInfo>();
//        List<Project> projects = PopulationService.getProjects();
//        for (Project project : projects) {
//        	List<ProjectCommit> projectCommits = PopulationService.getProjectCommits(project);
//            for (ProjectCommit projectCommit : projectCommits) {
//                ServiceProviderInfo r = new ServiceProviderInfo();
//                r.projectId = project.getId();
//                r.name = "Project:" + r.projectId;
//                sps.add(r);
//    		}
//		}
//        serviceProviders = sps.toArray(new ServiceProviderInfo [sps.size()]);
//        serviceProviderInfos = serviceProviders; 
        // End of user code
        return serviceProviderInfos;
    }

    public static List<Subsetting> querySubsettings(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<Subsetting> resources = null;
        
        // Start of user code querySubsettings_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Subsetting>(store.getResources(StoreService.getSelectedNamedGraph(), Subsetting.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code querySubsettings_storeFinalize
        // End of user code
        
        // Start of user code querySubsettings
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<Subsetting> SubsettingSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<Subsetting> resources = null;
        
        // Start of user code SubsettingSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Subsetting>(store.getResources(StoreService.getSelectedNamedGraph(), Subsetting.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code SubsettingSelector_storeFinalize
        // End of user code
        
        // Start of user code SubsettingSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<Element> queryElements(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<Element> resources = null;
        
        // Start of user code queryElements_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Element>(store.getResources(StoreService.getSelectedNamedGraph(), Element.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryElements_storeFinalize
        // End of user code
        
        // Start of user code queryElements
        // End of user code
        return resources;
    }
    public static List<Element> ElementSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<Element> resources = null;
        
        // Start of user code ElementSelector_storeInit
        String selectType = httpServletRequest.getParameter("selectType");
        String prefix = "rdf=" + "<" + org.apache.jena.vocabulary.RDF.uri + ">";
        String where = "rdf:type=" + "<" + SysmlDomainConstants.SYSML_NAMSPACE + selectType + ">";
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Element>(store.getResources(StoreService.getSelectedNamedGraph(), Element.class, prefix, where, terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code ElementSelector_storeFinalize
        // End of user code
        
        // Start of user code ElementSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<SysmlClass> querySysmlClasss(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<SysmlClass> resources = null;
        
        // Start of user code querySysmlClasss_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<SysmlClass>(store.getResources(StoreService.getSelectedNamedGraph(), SysmlClass.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code querySysmlClasss_storeFinalize
        // End of user code
        
        // Start of user code querySysmlClasss
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<SysmlClass> SysmlClassSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<SysmlClass> resources = null;
        
        // Start of user code SysmlClassSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<SysmlClass>(store.getResources(StoreService.getSelectedNamedGraph(), SysmlClass.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code SysmlClassSelector_storeFinalize
        // End of user code
        
        // Start of user code SysmlClassSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<Relationship> queryRelationships(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<Relationship> resources = null;
        
        // Start of user code queryRelationships_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Relationship>(store.getResources(StoreService.getSelectedNamedGraph(), Relationship.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryRelationships_storeFinalize
        // End of user code
        
        // Start of user code queryRelationships
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<Relationship> RelationshipSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<Relationship> resources = null;
        
        // Start of user code RelationshipSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Relationship>(store.getResources(StoreService.getSelectedNamedGraph(), Relationship.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code RelationshipSelector_storeFinalize
        // End of user code
        
        // Start of user code RelationshipSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<Generalization> queryGeneralizations(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<Generalization> resources = null;
        
        // Start of user code queryGeneralizations_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Generalization>(store.getResources(StoreService.getSelectedNamedGraph(), Generalization.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryGeneralizations_storeFinalize
        // End of user code
        
        // Start of user code queryGeneralizations
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<Generalization> GeneralizationSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<Generalization> resources = null;
        
        // Start of user code GeneralizationSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Generalization>(store.getResources(StoreService.getSelectedNamedGraph(), Generalization.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code GeneralizationSelector_storeFinalize
        // End of user code
        
        // Start of user code GeneralizationSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<Feature> queryFeatures(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<Feature> resources = null;
        
        // Start of user code queryFeatures_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Feature>(store.getResources(StoreService.getSelectedNamedGraph(), Feature.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryFeatures_storeFinalize
        // End of user code
        
        // Start of user code queryFeatures
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<Feature> FeatureSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<Feature> resources = null;
        
        // Start of user code FeatureSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Feature>(store.getResources(StoreService.getSelectedNamedGraph(), Feature.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code FeatureSelector_storeFinalize
        // End of user code
        
        // Start of user code FeatureSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<FeatureMembership> queryFeatureMemberships(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<FeatureMembership> resources = null;
        
        // Start of user code queryFeatureMemberships_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<FeatureMembership>(store.getResources(StoreService.getSelectedNamedGraph(), FeatureMembership.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryFeatureMemberships_storeFinalize
        // End of user code
        
        // Start of user code queryFeatureMemberships
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<FeatureMembership> FeatureMembershipSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<FeatureMembership> resources = null;
        
        // Start of user code FeatureMembershipSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<FeatureMembership>(store.getResources(StoreService.getSelectedNamedGraph(), FeatureMembership.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code FeatureMembershipSelector_storeFinalize
        // End of user code
        
        // Start of user code FeatureMembershipSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<FeatureTyping> queryFeatureTypings(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<FeatureTyping> resources = null;
        
        // Start of user code queryFeatureTypings_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<FeatureTyping>(store.getResources(StoreService.getSelectedNamedGraph(), FeatureTyping.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryFeatureTypings_storeFinalize
        // End of user code
        
        // Start of user code queryFeatureTypings
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<FeatureTyping> FeatureTypingSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<FeatureTyping> resources = null;
        
        // Start of user code FeatureTypingSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<FeatureTyping>(store.getResources(StoreService.getSelectedNamedGraph(), FeatureTyping.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code FeatureTypingSelector_storeFinalize
        // End of user code
        
        // Start of user code FeatureTypingSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<PortUsage> queryPortUsages(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<PortUsage> resources = null;
        
        // Start of user code queryPortUsages_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<PortUsage>(store.getResources(StoreService.getSelectedNamedGraph(), PortUsage.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryPortUsages_storeFinalize
        // End of user code
        
        // Start of user code queryPortUsages
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<PortUsage> PortUsageSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<PortUsage> resources = null;
        
        // Start of user code PortUsageSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<PortUsage>(store.getResources(StoreService.getSelectedNamedGraph(), PortUsage.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code PortUsageSelector_storeFinalize
        // End of user code
        
        // Start of user code PortUsageSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<AttributeUsage> queryAttributeUsages(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<AttributeUsage> resources = null;
        
        // Start of user code queryAttributeUsages_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<AttributeUsage>(store.getResources(StoreService.getSelectedNamedGraph(), AttributeUsage.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryAttributeUsages_storeFinalize
        // End of user code
        
        // Start of user code queryAttributeUsages
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<AttributeUsage> AttributeUsageSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<AttributeUsage> resources = null;
        
        // Start of user code AttributeUsageSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<AttributeUsage>(store.getResources(StoreService.getSelectedNamedGraph(), AttributeUsage.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code AttributeUsageSelector_storeFinalize
        // End of user code
        
        // Start of user code AttributeUsageSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }



    public static List<PartUsage> queryPartUsages(HttpServletRequest httpServletRequest, final String projectId, String where, String prefix, int page, int limit)
    {
        List<PartUsage> resources = null;
        
        // Start of user code queryPartUsages_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<PartUsage>(store.getResources(StoreService.getSelectedNamedGraph(), PartUsage.class, prefix, where, "", limit+1, page*limit));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to query resources, with where-string '" + where + "'", e);
            throw new WebApplicationException("Failed to query resources, with where-string '" + where + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code queryPartUsages_storeFinalize
        // End of user code
        
        // Start of user code queryPartUsages
        // TODO Implement code to return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }
    public static List<PartUsage> PartUsageSelector(HttpServletRequest httpServletRequest, final String projectId, String terms)   
    {
        List<PartUsage> resources = null;
        
        // Start of user code PartUsageSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<PartUsage>(store.getResources(StoreService.getSelectedNamedGraph(), PartUsage.class, "", "", terms, 20, -1));
        } catch (StoreAccessException | ModelUnmarshallingException e) {
            log.error("Failed to search resources, with search-term '" + terms + "'", e);
            throw new WebApplicationException("Failed to search resources, with search-term '" + terms + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code PartUsageSelector_storeFinalize
        // End of user code
        
        // Start of user code PartUsageSelector
        // TODO Implement code to return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return resources;
    }




    public static Subsetting getSubsetting(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Subsetting aResource = null;
        
        // Start of user code getSubsetting_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForSubsetting(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, Subsetting.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getSubsetting_storeFinalize
        // End of user code
        
        // Start of user code getSubsetting
        // End of user code
        return aResource;
    }


    public static Element getElement(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Element aResource = null;
        
        // Start of user code getElement_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForElement(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, Element.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getElement_storeFinalize
        // End of user code
        
        // Start of user code getElement
        // End of user code
        return aResource;
    }


    public static SysmlClass getSysmlClass(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        SysmlClass aResource = null;
        
        // Start of user code getSysmlClass_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForSysmlClass(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, SysmlClass.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getSysmlClass_storeFinalize
        // End of user code
        
        // Start of user code getSysmlClass
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        //Throw exception here to make sure user implements it.
        // End of user code
        return aResource;
    }


    public static Relationship getRelationship(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Relationship aResource = null;
        
        // Start of user code getRelationship_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForRelationship(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, Relationship.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getRelationship_storeFinalize
        // End of user code
        
        // Start of user code getRelationship
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        //Throw exception here to make sure user implements it.
        // End of user code
        return aResource;
    }


    public static Generalization getGeneralization(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Generalization aResource = null;
        
        // Start of user code getGeneralization_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForGeneralization(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, Generalization.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getGeneralization_storeFinalize
        // End of user code
        
        // Start of user code getGeneralization
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        //Throw exception here to make sure user implements it.
        // End of user code
        return aResource;
    }


    public static Feature getFeature(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Feature aResource = null;
        
        // Start of user code getFeature_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForFeature(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, Feature.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getFeature_storeFinalize
        // End of user code
        
        // Start of user code getFeature
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }


    public static FeatureMembership getFeatureMembership(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        FeatureMembership aResource = null;
        
        // Start of user code getFeatureMembership_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForFeatureMembership(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, FeatureMembership.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getFeatureMembership_storeFinalize
        // End of user code
        
        // Start of user code getFeatureMembership
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }


    public static FeatureTyping getFeatureTyping(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        FeatureTyping aResource = null;
        
        // Start of user code getFeatureTyping_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForFeatureTyping(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, FeatureTyping.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getFeatureTyping_storeFinalize
        // End of user code
        
        // Start of user code getFeatureTyping
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }


    public static PortUsage getPortUsage(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        PortUsage aResource = null;
        
        // Start of user code getPortUsage_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForPortUsage(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, PortUsage.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getPortUsage_storeFinalize
        // End of user code
        
        // Start of user code getPortUsage
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }


    public static AttributeUsage getAttributeUsage(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        AttributeUsage aResource = null;
        
        // Start of user code getAttributeUsage_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForAttributeUsage(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, AttributeUsage.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getAttributeUsage_storeFinalize
        // End of user code
        
        // Start of user code getAttributeUsage
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }


    public static PartUsage getPartUsage(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        PartUsage aResource = null;
        
        // Start of user code getPartUsage_storeInit
        // End of user code
        Store store = storePool.getStore();
        URI uri = SysmlServerResourcesFactory.constructURIForPartUsage(projectId, id);
        try {
            aResource = store.getResource(StoreService.getSelectedNamedGraph(), uri, PartUsage.class);
        } catch (NoSuchElementException e) {
            log.error("Resource: '" + uri + "' not found");
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.NOT_FOUND);
        } catch (StoreAccessException | ModelUnmarshallingException  e) {
            log.error("Failed to get resource: '" + uri + "'", e);
            throw new WebApplicationException("Failed to get resource: '" + uri + "'", e, Status.INTERNAL_SERVER_ERROR);
        } finally {
            storePool.releaseStore(store);
        }
        // Start of user code getPartUsage_storeFinalize
        // End of user code
        
        // Start of user code getPartUsage
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }



    public static String getETagFromAttributeUsage(final AttributeUsage aResource)
    {
        String eTag = null;
        // Start of user code getETagFromAttributeUsage
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromSysmlClass(final SysmlClass aResource)
    {
        String eTag = null;
        // Start of user code getETagFromSysmlClass
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromElement(final Element aResource)
    {
        String eTag = null;
        // Start of user code getETagFromElement
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromFeature(final Feature aResource)
    {
        String eTag = null;
        // Start of user code getETagFromFeature
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromFeatureMembership(final FeatureMembership aResource)
    {
        String eTag = null;
        // Start of user code getETagFromFeatureMembership
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromFeatureTyping(final FeatureTyping aResource)
    {
        String eTag = null;
        // Start of user code getETagFromFeatureTyping
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromGeneralization(final Generalization aResource)
    {
        String eTag = null;
        // Start of user code getETagFromGeneralization
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromPartUsage(final PartUsage aResource)
    {
        String eTag = null;
        // Start of user code getETagFromPartUsage
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromPortUsage(final PortUsage aResource)
    {
        String eTag = null;
        // Start of user code getETagFromPortUsage
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromRelationship(final Relationship aResource)
    {
        String eTag = null;
        // Start of user code getETagFromRelationship
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromSubsetting(final Subsetting aResource)
    {
        String eTag = null;
        // Start of user code getETagFromSubsetting
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }

}
