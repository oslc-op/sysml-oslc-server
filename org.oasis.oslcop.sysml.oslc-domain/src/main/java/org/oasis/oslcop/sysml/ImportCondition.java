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
import org.oasis.oslcop.sysml.Relationship;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.ConditionalImport;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Predicate;
import org.oasis.oslcop.sysml.Relationship;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.IMPORTCONDITION_NAMESPACE)
@OslcName(SysmlDomainConstants.IMPORTCONDITION_LOCALNAME)
@OslcResourceShape(title = "ImportCondition Resource Shape", describes = SysmlDomainConstants.IMPORTCONDITION_TYPE)
public class ImportCondition
    extends Relationship
    implements IImportCondition
{
    // Start of user code attributeAnnotation:conditionalImport
    // End of user code
    private Link conditionalImport;
    // Start of user code attributeAnnotation:predicate_comp
    // End of user code
    private Link predicate_comp;
    // Start of user code attributeAnnotation:predicate
    // End of user code
    private Link predicate;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ImportCondition()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ImportCondition(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.IMPORTCONDITION_PATH,
        ImportCondition.class);
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
            result = result + "{a Local ImportCondition Resource} - update ImportCondition.toString() to present resource as desired.";
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
    
    
    // Start of user code getterAnnotation:conditionalImport
    // End of user code
    @OslcName("conditionalImport")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "conditionalImport")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONDITIONALIMPORT_TYPE})
    @OslcReadOnly(false)
    public Link getConditionalImport()
    {
        // Start of user code getterInit:conditionalImport
        // End of user code
        return conditionalImport;
    }
    
    // Start of user code getterAnnotation:predicate_comp
    // End of user code
    @OslcName("predicate_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "predicate_comp")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PREDICATE_TYPE})
    @OslcReadOnly(false)
    public Link getPredicate_comp()
    {
        // Start of user code getterInit:predicate_comp
        // End of user code
        return predicate_comp;
    }
    
    // Start of user code getterAnnotation:predicate
    // End of user code
    @OslcName("predicate")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "predicate")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PREDICATE_TYPE})
    @OslcReadOnly(false)
    public Link getPredicate()
    {
        // Start of user code getterInit:predicate
        // End of user code
        return predicate;
    }
    
    
    // Start of user code setterAnnotation:conditionalImport
    // End of user code
    public void setConditionalImport(final Link conditionalImport )
    {
        // Start of user code setterInit:conditionalImport
        // End of user code
        this.conditionalImport = conditionalImport;
    
        // Start of user code setterFinalize:conditionalImport
        // End of user code
    }
    
    // Start of user code setterAnnotation:predicate_comp
    // End of user code
    public void setPredicate_comp(final Link predicate_comp )
    {
        // Start of user code setterInit:predicate_comp
        // End of user code
        this.predicate_comp = predicate_comp;
    
        // Start of user code setterFinalize:predicate_comp
        // End of user code
    }
    
    // Start of user code setterAnnotation:predicate
    // End of user code
    public void setPredicate(final Link predicate )
    {
        // Start of user code setterInit:predicate
        // End of user code
        this.predicate = predicate;
    
        // Start of user code setterFinalize:predicate
        // End of user code
    }
    
    
}
