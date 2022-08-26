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
//Note: The Lyo code generator is migrating the name of this class from 'SysmlServerManager' to the new shorter name 'RestDelegate'.
//You are still using the old name. The generator will continue to use this old name until you actively trigger the change.
//To migrate to the new class name:
//1. Rename your class to RestDelegate 
//    * Please rename and do not simply create a copy of the file. The generator needs to detect the file deletion in order to activate the name change.
//2. Regenerate the code. 
//    * The generator will generate this class with the new name.
//    * Besides the class name, the code - including the user clode blocks - remain intact.
//    * All other class references to the new class name are updated.
//3. Delete this notice
// End of user code

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContextEvent;
import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.ServiceProviderInfo;
import org.oasis.oslcop.sysml.AnnotatingElement;
import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.Conjugation;
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
import org.oasis.oslcop.sysml.Specialization;
import org.oasis.oslcop.sysml.Subclassification;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.TypeFeaturing;
import java.net.URI;
import java.util.NoSuchElementException;
import org.eclipse.lyo.store.ModelUnmarshallingException;
import org.eclipse.lyo.store.Store;
import org.eclipse.lyo.store.StorePool;
import org.eclipse.lyo.store.StoreAccessException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;



// Start of user code imports
import java.net.URL;
import org.oasis.oslcop.sysml.services.ProjectCommitSelectionService;
// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerManager {

    private static final Logger log = LoggerFactory.getLogger(SysmlServerManager.class);

    @Inject StorePool storePool;
    
    @Inject SysmlServerResourcesFactory resourcesFactory;
    // Start of user code class_attributes
    private static URI _sparqlQueryEndpoint;
    private static ServiceProviderInfo[] serviceProviders = null;
    // End of user code
    
    public SysmlServerManager() {
        log.trace("Delegate is initialized");
    }
    
    
    // Start of user code class_methods
    // End of user code

    //The methods contextInitializeServletListener() and contextDestroyServletListener() no longer exits
    //Migrate any user-specific code blocks to the class org.oasis.oslcop.sysml.servlet.ServletListener
    //Any user-specific code should be found in *.lost files.

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

    public List<Subsetting> querySubsettings(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String where, String prefix, boolean paging, int page, int limit)
    {
        List<Subsetting> resources = null;
        
        // Start of user code querySubsettings_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Subsetting>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Subsetting.class, prefix, where, "", (OSLC4JUtils.hasLyoStorePagingPreciseLimit() ? limit : limit+1), page*limit));
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
    public List<Subsetting> SubsettingSelector(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String terms)
    {
        List<Subsetting> resources = null;
        
        // Start of user code SubsettingSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Subsetting>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Subsetting.class, "", "", terms, 20, -1));
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



    public List<Relationship> queryRelationships(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String where, String prefix, boolean paging, int page, int limit)
    {
        List<Relationship> resources = null;
        
        // Start of user code queryRelationships_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Relationship>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Relationship.class, prefix, where, "", (OSLC4JUtils.hasLyoStorePagingPreciseLimit() ? limit : limit+1), page*limit));
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
    public List<Relationship> RelationshipSelector(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String terms)
    {
        List<Relationship> resources = null;
        
        // Start of user code RelationshipSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Relationship>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Relationship.class, "", "", terms, 20, -1));
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



    public List<SysmlClass> querySysmlClasss(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String where, String prefix, boolean paging, int page, int limit)
    {
        List<SysmlClass> resources = null;
        
        // Start of user code querySysmlClasss_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<SysmlClass>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), SysmlClass.class, prefix, where, "", (OSLC4JUtils.hasLyoStorePagingPreciseLimit() ? limit : limit+1), page*limit));
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
    public List<SysmlClass> SysmlClassSelector(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String terms)
    {
        List<SysmlClass> resources = null;
        
        // Start of user code SysmlClassSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<SysmlClass>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), SysmlClass.class, "", "", terms, 20, -1));
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



    public List<Feature> queryFeatures(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String where, String prefix, boolean paging, int page, int limit)
    {
        List<Feature> resources = null;
        
        // Start of user code queryFeatures_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Feature>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Feature.class, prefix, where, "", (OSLC4JUtils.hasLyoStorePagingPreciseLimit() ? limit : limit+1), page*limit));
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
    public List<Feature> FeatureSelector(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String terms)
    {
        List<Feature> resources = null;
        
        // Start of user code FeatureSelector_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Feature>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Feature.class, "", "", terms, 20, -1));
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



    public List<Element> queryElements(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String where, String prefix, boolean paging, int page, int limit)
    {
        List<Element> resources = null;
        
        // Start of user code queryElements_storeInit
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Element>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Element.class, prefix, where, "", (OSLC4JUtils.hasLyoStorePagingPreciseLimit() ? limit : limit+1), page*limit));
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
    public List<Element> ElementSelector(HttpServletRequest httpServletRequest, final String projectId, final String commitId, String terms)
    {
        List<Element> resources = null;
        
        // Start of user code ElementSelector_storeInit
        String selectType = httpServletRequest.getParameter("selectType");
        String prefix = "rdf=" + "<" + org.apache.jena.vocabulary.RDF.uri + ">";
        String where = "rdf:type=" + "<" + SysmlDomainConstants.SYSML_NAMSPACE + selectType + ">";
        // End of user code
        Store store = storePool.getStore();
        try {
            resources = new ArrayList<Element>(store.getResources((new ProjectCommitSelectionService()).getSelectedNamedGraph(), Element.class, "", "", terms, 20, -1));
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




    public Subsetting getSubsetting(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Subsetting aResource = null;
        
        // Start of user code getSubsetting_storeInit
        // End of user code
        URI uri = resourcesFactory.constructURIForSubsetting(projectId, id);
        // Start of user code getSubsetting_storeSetUri
        // End of user code
        Store store = storePool.getStore();
        try {
            aResource = store.getResource((new ProjectCommitSelectionService()).getSelectedNamedGraph(), uri, Subsetting.class);
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


    public Element getElement(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Element aResource = null;
        
        // Start of user code getElement_storeInit
        // End of user code
        URI uri = resourcesFactory.constructURIForElement(projectId, id);
        // Start of user code getElement_storeSetUri
        // End of user code
        Store store = storePool.getStore();
        try {
            aResource = store.getResource((new ProjectCommitSelectionService()).getSelectedNamedGraph(), uri, Element.class);
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


    public SysmlClass getSysmlClass(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        SysmlClass aResource = null;
        
        // Start of user code getSysmlClass_storeInit
        // End of user code
        URI uri = resourcesFactory.constructURIForSysmlClass(projectId, id);
        // Start of user code getSysmlClass_storeSetUri
        // End of user code
        Store store = storePool.getStore();
        try {
            aResource = store.getResource((new ProjectCommitSelectionService()).getSelectedNamedGraph(), uri, SysmlClass.class);
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
        // End of user code
        return aResource;
    }


    public Relationship getRelationship(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Relationship aResource = null;
        
        // Start of user code getRelationship_storeInit
        // End of user code
        URI uri = resourcesFactory.constructURIForRelationship(projectId, id);
        // Start of user code getRelationship_storeSetUri
        // End of user code
        Store store = storePool.getStore();
        try {
            aResource = store.getResource((new ProjectCommitSelectionService()).getSelectedNamedGraph(), uri, Relationship.class);
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


    public Feature getFeature(HttpServletRequest httpServletRequest, final String projectId, final String id)
    {
        Feature aResource = null;
        
        // Start of user code getFeature_storeInit
        // End of user code
        URI uri = resourcesFactory.constructURIForFeature(projectId, id);
        // Start of user code getFeature_storeSetUri
        // End of user code
        Store store = storePool.getStore();
        try {
            aResource = store.getResource((new ProjectCommitSelectionService()).getSelectedNamedGraph(), uri, Feature.class);
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



    public String getETagFromSysmlClass(final SysmlClass aResource)
    {
        String eTag = null;
        // Start of user code getETagFromSysmlClass
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public String getETagFromElement(final Element aResource)
    {
        String eTag = null;
        // Start of user code getETagFromElement
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public String getETagFromFeature(final Feature aResource)
    {
        String eTag = null;
        // Start of user code getETagFromFeature
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public String getETagFromRelationship(final Relationship aResource)
    {
        String eTag = null;
        // Start of user code getETagFromRelationship
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public String getETagFromSubsetting(final Subsetting aResource)
    {
        String eTag = null;
        // Start of user code getETagFromSubsetting
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }

}
