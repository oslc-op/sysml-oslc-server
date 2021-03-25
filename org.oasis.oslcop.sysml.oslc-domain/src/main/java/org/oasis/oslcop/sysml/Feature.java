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
import org.oasis.oslcop.sysml.Type;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.TypeFeaturing;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.FEATURE_NAMESPACE)
@OslcName(SysmlDomainConstants.FEATURE_LOCALNAME)
@OslcResourceShape(title = "Feature Resource Shape", describes = SysmlDomainConstants.FEATURE_TYPE)
public class Feature
    extends Type
    implements IFeature
{
    // Start of user code attributeAnnotation:isUnique
    // End of user code
    private Boolean isUnique;
    // Start of user code attributeAnnotation:isOrdered
    // End of user code
    private Boolean isOrdered;
    // Start of user code attributeAnnotation:isComposite
    // End of user code
    private Boolean isComposite;
    // Start of user code attributeAnnotation:isEnd
    // End of user code
    private Boolean isEnd;
    // Start of user code attributeAnnotation:isNonunique
    // End of user code
    private Boolean isNonunique;
    // Start of user code attributeAnnotation:ownedTypeFeaturing
    // End of user code
    private Set<Link> ownedTypeFeaturing = new HashSet<Link>();
    // Start of user code attributeAnnotation:owningFeatureMembership
    // End of user code
    private Link owningFeatureMembership;
    // Start of user code attributeAnnotation:owningType
    // End of user code
    private Link owningType;
    // Start of user code attributeAnnotation:endOwningType
    // End of user code
    private Link endOwningType;
    // Start of user code attributeAnnotation:sysmlType
    // End of user code
    private Set<Link> sysmlType = new HashSet<Link>();
    // Start of user code attributeAnnotation:ownedRedefinition
    // End of user code
    private Set<Link> ownedRedefinition = new HashSet<Link>();
    // Start of user code attributeAnnotation:ownedSubsetting
    // End of user code
    private Set<Link> ownedSubsetting = new HashSet<Link>();
    // Start of user code attributeAnnotation:ownedTyping
    // End of user code
    private Set<Link> ownedTyping = new HashSet<Link>();
    // Start of user code attributeAnnotation:featuringType
    // End of user code
    private Set<Link> featuringType = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Feature()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Feature(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.FEATURE_PATH,
        Feature.class);
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
            result = result + "{a Local Feature Resource} - update Feature.toString() to present resource as desired.";
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
    
    public void addOwnedTypeFeaturing(final Link ownedTypeFeaturing)
    {
        this.ownedTypeFeaturing.add(ownedTypeFeaturing);
    }
    
    public void addSysmlType(final Link type)
    {
        this.sysmlType.add(type);
    }
    
    public void addOwnedRedefinition(final Link ownedRedefinition)
    {
        this.ownedRedefinition.add(ownedRedefinition);
    }
    
    public void addOwnedSubsetting(final Link ownedSubsetting)
    {
        this.ownedSubsetting.add(ownedSubsetting);
    }
    
    public void addOwnedTyping(final Link ownedTyping)
    {
        this.ownedTyping.add(ownedTyping);
    }
    
    public void addFeaturingType(final Link featuringType)
    {
        this.featuringType.add(featuringType);
    }
    
    
    // Start of user code getterAnnotation:isUnique
    // End of user code
    @OslcName("isUnique")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isUnique")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsUnique()
    {
        // Start of user code getterInit:isUnique
        // End of user code
        return isUnique;
    }
    
    // Start of user code getterAnnotation:isOrdered
    // End of user code
    @OslcName("isOrdered")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isOrdered")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsOrdered()
    {
        // Start of user code getterInit:isOrdered
        // End of user code
        return isOrdered;
    }
    
    // Start of user code getterAnnotation:isComposite
    // End of user code
    @OslcName("isComposite")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isComposite")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsComposite()
    {
        // Start of user code getterInit:isComposite
        // End of user code
        return isComposite;
    }
    
    // Start of user code getterAnnotation:isEnd
    // End of user code
    @OslcName("isEnd")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isEnd")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsEnd()
    {
        // Start of user code getterInit:isEnd
        // End of user code
        return isEnd;
    }
    
    // Start of user code getterAnnotation:isNonunique
    // End of user code
    @OslcName("isNonunique")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isNonunique")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsNonunique()
    {
        // Start of user code getterInit:isNonunique
        // End of user code
        return isNonunique;
    }
    
    // Start of user code getterAnnotation:ownedTypeFeaturing
    // End of user code
    @OslcName("ownedTypeFeaturing")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedTypeFeaturing")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPEFEATURING_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedTypeFeaturing()
    {
        // Start of user code getterInit:ownedTypeFeaturing
        // End of user code
        return ownedTypeFeaturing;
    }
    
    // Start of user code getterAnnotation:owningFeatureMembership
    // End of user code
    @OslcName("owningFeatureMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningFeatureMembership")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATUREMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Link getOwningFeatureMembership()
    {
        // Start of user code getterInit:owningFeatureMembership
        // End of user code
        return owningFeatureMembership;
    }
    
    // Start of user code getterAnnotation:owningType
    // End of user code
    @OslcName("owningType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningType")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningType()
    {
        // Start of user code getterInit:owningType
        // End of user code
        return owningType;
    }
    
    // Start of user code getterAnnotation:endOwningType
    // End of user code
    @OslcName("endOwningType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "endOwningType")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Link getEndOwningType()
    {
        // Start of user code getterInit:endOwningType
        // End of user code
        return endOwningType;
    }
    
    // Start of user code getterAnnotation:sysmlType
    // End of user code
    @OslcName("type")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "type")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getSysmlType()
    {
        // Start of user code getterInit:sysmlType
        // End of user code
        return sysmlType;
    }
    
    // Start of user code getterAnnotation:ownedRedefinition
    // End of user code
    @OslcName("ownedRedefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedRedefinition")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.REDEFINITION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedRedefinition()
    {
        // Start of user code getterInit:ownedRedefinition
        // End of user code
        return ownedRedefinition;
    }
    
    // Start of user code getterAnnotation:ownedSubsetting
    // End of user code
    @OslcName("ownedSubsetting")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedSubsetting")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.SUBSETTING_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedSubsetting()
    {
        // Start of user code getterInit:ownedSubsetting
        // End of user code
        return ownedSubsetting;
    }
    
    // Start of user code getterAnnotation:ownedTyping
    // End of user code
    @OslcName("ownedTyping")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedTyping")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURETYPING_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedTyping()
    {
        // Start of user code getterInit:ownedTyping
        // End of user code
        return ownedTyping;
    }
    
    // Start of user code getterAnnotation:featuringType
    // End of user code
    @OslcName("featuringType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "featuringType")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getFeaturingType()
    {
        // Start of user code getterInit:featuringType
        // End of user code
        return featuringType;
    }
    
    
    // Start of user code setterAnnotation:isUnique
    // End of user code
    public void setIsUnique(final Boolean isUnique )
    {
        // Start of user code setterInit:isUnique
        // End of user code
        this.isUnique = isUnique;
    
        // Start of user code setterFinalize:isUnique
        // End of user code
    }
    
    // Start of user code setterAnnotation:isOrdered
    // End of user code
    public void setIsOrdered(final Boolean isOrdered )
    {
        // Start of user code setterInit:isOrdered
        // End of user code
        this.isOrdered = isOrdered;
    
        // Start of user code setterFinalize:isOrdered
        // End of user code
    }
    
    // Start of user code setterAnnotation:isComposite
    // End of user code
    public void setIsComposite(final Boolean isComposite )
    {
        // Start of user code setterInit:isComposite
        // End of user code
        this.isComposite = isComposite;
    
        // Start of user code setterFinalize:isComposite
        // End of user code
    }
    
    // Start of user code setterAnnotation:isEnd
    // End of user code
    public void setIsEnd(final Boolean isEnd )
    {
        // Start of user code setterInit:isEnd
        // End of user code
        this.isEnd = isEnd;
    
        // Start of user code setterFinalize:isEnd
        // End of user code
    }
    
    // Start of user code setterAnnotation:isNonunique
    // End of user code
    public void setIsNonunique(final Boolean isNonunique )
    {
        // Start of user code setterInit:isNonunique
        // End of user code
        this.isNonunique = isNonunique;
    
        // Start of user code setterFinalize:isNonunique
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedTypeFeaturing
    // End of user code
    public void setOwnedTypeFeaturing(final Set<Link> ownedTypeFeaturing )
    {
        // Start of user code setterInit:ownedTypeFeaturing
        // End of user code
        this.ownedTypeFeaturing.clear();
        if (ownedTypeFeaturing != null)
        {
            this.ownedTypeFeaturing.addAll(ownedTypeFeaturing);
        }
    
        // Start of user code setterFinalize:ownedTypeFeaturing
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningFeatureMembership
    // End of user code
    public void setOwningFeatureMembership(final Link owningFeatureMembership )
    {
        // Start of user code setterInit:owningFeatureMembership
        // End of user code
        this.owningFeatureMembership = owningFeatureMembership;
    
        // Start of user code setterFinalize:owningFeatureMembership
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningType
    // End of user code
    public void setOwningType(final Link owningType )
    {
        // Start of user code setterInit:owningType
        // End of user code
        this.owningType = owningType;
    
        // Start of user code setterFinalize:owningType
        // End of user code
    }
    
    // Start of user code setterAnnotation:endOwningType
    // End of user code
    public void setEndOwningType(final Link endOwningType )
    {
        // Start of user code setterInit:endOwningType
        // End of user code
        this.endOwningType = endOwningType;
    
        // Start of user code setterFinalize:endOwningType
        // End of user code
    }
    
    // Start of user code setterAnnotation:sysmlType
    // End of user code
    public void setSysmlType(final Set<Link> type )
    {
        // Start of user code setterInit:sysmlType
        // End of user code
        this.sysmlType.clear();
        if (type != null)
        {
            this.sysmlType.addAll(type);
        }
    
        // Start of user code setterFinalize:sysmlType
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedRedefinition
    // End of user code
    public void setOwnedRedefinition(final Set<Link> ownedRedefinition )
    {
        // Start of user code setterInit:ownedRedefinition
        // End of user code
        this.ownedRedefinition.clear();
        if (ownedRedefinition != null)
        {
            this.ownedRedefinition.addAll(ownedRedefinition);
        }
    
        // Start of user code setterFinalize:ownedRedefinition
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedSubsetting
    // End of user code
    public void setOwnedSubsetting(final Set<Link> ownedSubsetting )
    {
        // Start of user code setterInit:ownedSubsetting
        // End of user code
        this.ownedSubsetting.clear();
        if (ownedSubsetting != null)
        {
            this.ownedSubsetting.addAll(ownedSubsetting);
        }
    
        // Start of user code setterFinalize:ownedSubsetting
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedTyping
    // End of user code
    public void setOwnedTyping(final Set<Link> ownedTyping )
    {
        // Start of user code setterInit:ownedTyping
        // End of user code
        this.ownedTyping.clear();
        if (ownedTyping != null)
        {
            this.ownedTyping.addAll(ownedTyping);
        }
    
        // Start of user code setterFinalize:ownedTyping
        // End of user code
    }
    
    // Start of user code setterAnnotation:featuringType
    // End of user code
    public void setFeaturingType(final Set<Link> featuringType )
    {
        // Start of user code setterInit:featuringType
        // End of user code
        this.featuringType.clear();
        if (featuringType != null)
        {
            this.featuringType.addAll(featuringType);
        }
    
        // Start of user code setterFinalize:featuringType
        // End of user code
    }
    
    
}
