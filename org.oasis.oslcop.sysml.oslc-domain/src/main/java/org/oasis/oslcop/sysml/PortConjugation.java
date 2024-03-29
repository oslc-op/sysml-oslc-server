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

package org.oasis.oslcop.sysml;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.Conjugation;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.ConjugatedPortDefinition;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.PortDefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.Type;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.PORTCONJUGATION_NAMESPACE)
@OslcName(SysmlDomainConstants.PORTCONJUGATION_LOCALNAME)
@OslcResourceShape(title = "PortConjugation Shape", describes = SysmlDomainConstants.PORTCONJUGATION_TYPE)
public class PortConjugation
    extends Conjugation
    implements IPortConjugation
{
    // Start of user code attributeAnnotation:originalPortDefinition
    // End of user code
    private Link originalPortDefinition;
    // Start of user code attributeAnnotation:conjugatedPortDefinition
    // End of user code
    private Link conjugatedPortDefinition;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public PortConjugation()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public PortConjugation(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.PORTCONJUGATION_PATH,
        PortConjugation.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local PortConjugation Resource} - update PortConjugation.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
 result = getShortTitle();
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:originalPortDefinition
    // End of user code
    @OslcName("originalPortDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "originalPortDefinition")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PORTDEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getOriginalPortDefinition()
    {
        // Start of user code getterInit:originalPortDefinition
        // End of user code
        return originalPortDefinition;
    }
    
    // Start of user code getterAnnotation:conjugatedPortDefinition
    // End of user code
    @OslcName("conjugatedPortDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "conjugatedPortDefinition")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONJUGATEDPORTDEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getConjugatedPortDefinition()
    {
        // Start of user code getterInit:conjugatedPortDefinition
        // End of user code
        return conjugatedPortDefinition;
    }
    
    
    // Start of user code setterAnnotation:originalPortDefinition
    // End of user code
    public void setOriginalPortDefinition(final Link originalPortDefinition )
    {
        // Start of user code setterInit:originalPortDefinition
        // End of user code
        this.originalPortDefinition = originalPortDefinition;
    
        // Start of user code setterFinalize:originalPortDefinition
        // End of user code
    }
    
    // Start of user code setterAnnotation:conjugatedPortDefinition
    // End of user code
    public void setConjugatedPortDefinition(final Link conjugatedPortDefinition )
    {
        // Start of user code setterInit:conjugatedPortDefinition
        // End of user code
        this.conjugatedPortDefinition = conjugatedPortDefinition;
    
        // Start of user code setterFinalize:conjugatedPortDefinition
        // End of user code
    }
    
    
}
