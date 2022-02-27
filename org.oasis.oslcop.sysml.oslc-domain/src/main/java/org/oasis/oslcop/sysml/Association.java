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
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Disjoining;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Specialization;
import org.oasis.oslcop.sysml.Subclassification;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.Type;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.ASSOCIATION_NAMESPACE)
@OslcName(SysmlDomainConstants.ASSOCIATION_LOCALNAME)
@OslcResourceShape(title = "Association Shape", describes = SysmlDomainConstants.ASSOCIATION_TYPE)
public class Association
    extends Classifier
    implements IAssociation, IRelationship
{
    // Start of user code attributeAnnotation:relatedType
    // End of user code
    private Set<Link> relatedType = new HashSet<Link>();
    // Start of user code attributeAnnotation:sourceType
    // End of user code
    private Link sourceType;
    // Start of user code attributeAnnotation:targetType
    // End of user code
    private Set<Link> targetType = new HashSet<Link>();
    // Start of user code attributeAnnotation:associationEnd
    // End of user code
    private Set<Link> associationEnd = new HashSet<Link>();
    // Start of user code attributeAnnotation:relatedElement
    // End of user code
    private Set<Link> relatedElement = new HashSet<Link>();
    // Start of user code attributeAnnotation:target
    // End of user code
    private Set<Link> target = new HashSet<Link>();
    // Start of user code attributeAnnotation:sysmlSource
    // End of user code
    private Set<Link> sysmlSource = new HashSet<Link>();
    // Start of user code attributeAnnotation:owningRelatedElement
    // End of user code
    private Link owningRelatedElement;
    // Start of user code attributeAnnotation:ownedRelatedElement
    // End of user code
    private Set<Link> ownedRelatedElement = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Association()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Association(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.ASSOCIATION_PATH,
        Association.class);
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
            result = result + "{a Local Association Resource} - update Association.toString() to present resource as desired.";
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
    
    public void addRelatedType(final Link relatedType)
    {
        this.relatedType.add(relatedType);
    }
    
    public void addTargetType(final Link targetType)
    {
        this.targetType.add(targetType);
    }
    
    public void addAssociationEnd(final Link associationEnd)
    {
        this.associationEnd.add(associationEnd);
    }
    
    public void addRelatedElement(final Link relatedElement)
    {
        this.relatedElement.add(relatedElement);
    }
    
    public void addTarget(final Link target)
    {
        this.target.add(target);
    }
    
    public void addSysmlSource(final Link source)
    {
        this.sysmlSource.add(source);
    }
    
    public void addOwnedRelatedElement(final Link ownedRelatedElement)
    {
        this.ownedRelatedElement.add(ownedRelatedElement);
    }
    
    
    // Start of user code getterAnnotation:relatedType
    // End of user code
    @OslcName("relatedType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "relatedType")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getRelatedType()
    {
        // Start of user code getterInit:relatedType
        // End of user code
        return relatedType;
    }
    
    // Start of user code getterAnnotation:sourceType
    // End of user code
    @OslcName("sourceType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "sourceType")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Link getSourceType()
    {
        // Start of user code getterInit:sourceType
        // End of user code
        return sourceType;
    }
    
    // Start of user code getterAnnotation:targetType
    // End of user code
    @OslcName("targetType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "targetType")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getTargetType()
    {
        // Start of user code getterInit:targetType
        // End of user code
        return targetType;
    }
    
    // Start of user code getterAnnotation:associationEnd
    // End of user code
    @OslcName("associationEnd")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "associationEnd")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getAssociationEnd()
    {
        // Start of user code getterInit:associationEnd
        // End of user code
        return associationEnd;
    }
    
    // Start of user code getterAnnotation:relatedElement
    // End of user code
    @OslcName("relatedElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "relatedElement")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getRelatedElement()
    {
        // Start of user code getterInit:relatedElement
        // End of user code
        return relatedElement;
    }
    
    // Start of user code getterAnnotation:target
    // End of user code
    @OslcName("target")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "target")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getTarget()
    {
        // Start of user code getterInit:target
        // End of user code
        return target;
    }
    
    // Start of user code getterAnnotation:sysmlSource
    // End of user code
    @OslcName("source")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "source")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getSysmlSource()
    {
        // Start of user code getterInit:sysmlSource
        // End of user code
        return sysmlSource;
    }
    
    // Start of user code getterAnnotation:owningRelatedElement
    // End of user code
    @OslcName("owningRelatedElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningRelatedElement")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getOwningRelatedElement()
    {
        // Start of user code getterInit:owningRelatedElement
        // End of user code
        return owningRelatedElement;
    }
    
    // Start of user code getterAnnotation:ownedRelatedElement
    // End of user code
    @OslcName("ownedRelatedElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedRelatedElement")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedRelatedElement()
    {
        // Start of user code getterInit:ownedRelatedElement
        // End of user code
        return ownedRelatedElement;
    }
    
    
    // Start of user code setterAnnotation:relatedType
    // End of user code
    public void setRelatedType(final Set<Link> relatedType )
    {
        // Start of user code setterInit:relatedType
        // End of user code
        this.relatedType.clear();
        if (relatedType != null)
        {
            this.relatedType.addAll(relatedType);
        }
    
        // Start of user code setterFinalize:relatedType
        // End of user code
    }
    
    // Start of user code setterAnnotation:sourceType
    // End of user code
    public void setSourceType(final Link sourceType )
    {
        // Start of user code setterInit:sourceType
        // End of user code
        this.sourceType = sourceType;
    
        // Start of user code setterFinalize:sourceType
        // End of user code
    }
    
    // Start of user code setterAnnotation:targetType
    // End of user code
    public void setTargetType(final Set<Link> targetType )
    {
        // Start of user code setterInit:targetType
        // End of user code
        this.targetType.clear();
        if (targetType != null)
        {
            this.targetType.addAll(targetType);
        }
    
        // Start of user code setterFinalize:targetType
        // End of user code
    }
    
    // Start of user code setterAnnotation:associationEnd
    // End of user code
    public void setAssociationEnd(final Set<Link> associationEnd )
    {
        // Start of user code setterInit:associationEnd
        // End of user code
        this.associationEnd.clear();
        if (associationEnd != null)
        {
            this.associationEnd.addAll(associationEnd);
        }
    
        // Start of user code setterFinalize:associationEnd
        // End of user code
    }
    
    // Start of user code setterAnnotation:relatedElement
    // End of user code
    public void setRelatedElement(final Set<Link> relatedElement )
    {
        // Start of user code setterInit:relatedElement
        // End of user code
        this.relatedElement.clear();
        if (relatedElement != null)
        {
            this.relatedElement.addAll(relatedElement);
        }
    
        // Start of user code setterFinalize:relatedElement
        // End of user code
    }
    
    // Start of user code setterAnnotation:target
    // End of user code
    public void setTarget(final Set<Link> target )
    {
        // Start of user code setterInit:target
        // End of user code
        this.target.clear();
        if (target != null)
        {
            this.target.addAll(target);
        }
    
        // Start of user code setterFinalize:target
        // End of user code
    }
    
    // Start of user code setterAnnotation:sysmlSource
    // End of user code
    public void setSysmlSource(final Set<Link> source )
    {
        // Start of user code setterInit:sysmlSource
        // End of user code
        this.sysmlSource.clear();
        if (source != null)
        {
            this.sysmlSource.addAll(source);
        }
    
        // Start of user code setterFinalize:sysmlSource
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningRelatedElement
    // End of user code
    public void setOwningRelatedElement(final Link owningRelatedElement )
    {
        // Start of user code setterInit:owningRelatedElement
        // End of user code
        this.owningRelatedElement = owningRelatedElement;
    
        // Start of user code setterFinalize:owningRelatedElement
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedRelatedElement
    // End of user code
    public void setOwnedRelatedElement(final Set<Link> ownedRelatedElement )
    {
        // Start of user code setterInit:ownedRelatedElement
        // End of user code
        this.ownedRelatedElement.clear();
        if (ownedRelatedElement != null)
        {
            this.ownedRelatedElement.addAll(ownedRelatedElement);
        }
    
        // Start of user code setterFinalize:ownedRelatedElement
        // End of user code
    }
    
    
}
