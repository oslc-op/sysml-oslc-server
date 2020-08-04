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
import org.oasis.oslcop.sysml.resources.Element;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.resources.Relationship;
import org.eclipse.lyo.oslc.domains.rm.Requirement;
import org.eclipse.lyo.oslc.domains.am.Resource;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for Element resource
    
    public static Element createElement(final String serviceProviderId, final String id)
    {
        return new Element(constructURIForElement(serviceProviderId, id));
    }
    
    public static URI constructURIForElement(final String serviceProviderId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("id", id);
        String instanceURI = "crud/projects/{serviceProviderId}/Element/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForElement(final String serviceProviderId, final String id , final String label)
    {
        return new Link(constructURIForElement(serviceProviderId, id), label);
    }
    
    public static Link constructLinkForElement(final String serviceProviderId, final String id)
    {
        return new Link(constructURIForElement(serviceProviderId, id));
    }
    

    //methods for Relationship resource
    
    public static Relationship createRelationship(final String serviceProviderId, final String id)
    {
        return new Relationship(constructURIForRelationship(serviceProviderId, id));
    }
    
    public static URI constructURIForRelationship(final String serviceProviderId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("id", id);
        String instanceURI = "crud/projects/{serviceProviderId}/Relationship/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForRelationship(final String serviceProviderId, final String id , final String label)
    {
        return new Link(constructURIForRelationship(serviceProviderId, id), label);
    }
    
    public static Link constructLinkForRelationship(final String serviceProviderId, final String id)
    {
        return new Link(constructURIForRelationship(serviceProviderId, id));
    }
    

    //methods for Requirement resource
    
    public static Requirement createRequirement(final String serviceProviderId, final String id)
    {
        return new Requirement(constructURIForRequirement(serviceProviderId, id));
    }
    
    public static URI constructURIForRequirement(final String serviceProviderId, final String id)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("id", id);
        String instanceURI = "crud/projects/{serviceProviderId}/Requirement/{id}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForRequirement(final String serviceProviderId, final String id , final String label)
    {
        return new Link(constructURIForRequirement(serviceProviderId, id), label);
    }
    
    public static Link constructLinkForRequirement(final String serviceProviderId, final String id)
    {
        return new Link(constructURIForRequirement(serviceProviderId, id));
    }
    

    //methods for Resource resource
    
    

}
