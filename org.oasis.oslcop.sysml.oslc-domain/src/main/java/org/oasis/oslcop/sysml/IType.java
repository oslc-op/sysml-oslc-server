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

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.IConjugation;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IFeature;
import org.oasis.oslcop.sysml.IFeatureMembership;
import org.oasis.oslcop.sysml.IGeneralization;
import org.oasis.oslcop.sysml.ISysmlImport;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.IMultiplicity;
import org.oasis.oslcop.sysml.ISysmlPackage;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.oasis.oslcop.sysml.IRelationship;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.TYPE_NAMESPACE)
@OslcName(SysmlDomainConstants.TYPE_LOCALNAME)
@OslcResourceShape(title = "Type Resource Shape", describes = SysmlDomainConstants.TYPE_TYPE)
public interface IType
{

    public void addOwnedGeneralization(final Link ownedGeneralization );
    public void addOwnedFeatureMembership_comp(final Link ownedFeatureMembership_comp );
    public void addOwnedFeature(final Link ownedFeature );
    public void addOwnedEndFeature(final Link ownedEndFeature );
    public void addFeature(final Link feature );
    public void addInput(final Link input );
    public void addOutput(final Link output );
    public void addInheritedMembership(final Link inheritedMembership );
    public void addEndFeature(final Link endFeature );
    public void addFeatureMembership(final Link featureMembership );
    public void addInheritedFeature(final Link inheritedFeature );
    public void addOwnedFeatureMembership(final Link ownedFeatureMembership );

    @OslcName("isAbstract")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isAbstract")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsAbstract();

    @OslcName("isSufficient")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isSufficient")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsSufficient();

    @OslcName("isConjugated")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isConjugated")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsConjugated();

    @OslcName("ownedGeneralization")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedGeneralization")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.GENERALIZATION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedGeneralization();

    @OslcName("ownedFeatureMembership_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedFeatureMembership_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATUREMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedFeatureMembership_comp();

    @OslcName("ownedFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedFeature")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedFeature();

    @OslcName("ownedEndFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedEndFeature")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedEndFeature();

    @OslcName("feature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "feature")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getFeature();

    @OslcName("input")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "input")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getInput();

    @OslcName("output")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "output")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOutput();

    @OslcName("inheritedMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "inheritedMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getInheritedMembership();

    @OslcName("endFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "endFeature")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getEndFeature();

    @OslcName("ownedConjugator")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedConjugator")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONJUGATION_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedConjugator();

    @OslcName("conjugator")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "conjugator")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONJUGATION_TYPE})
    @OslcReadOnly(false)
    public Link getConjugator();

    @OslcName("featureMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "featureMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATUREMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getFeatureMembership();

    @OslcName("inheritedFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "inheritedFeature")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getInheritedFeature();

    @OslcName("multiplicity")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "multiplicity")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MULTIPLICITY_TYPE})
    @OslcReadOnly(false)
    public Link getMultiplicity();

    @OslcName("ownedFeatureMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedFeatureMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATUREMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedFeatureMembership();


    public void setIsAbstract(final Boolean isAbstract );
    public void setIsSufficient(final Boolean isSufficient );
    public void setIsConjugated(final Boolean isConjugated );
    public void setOwnedGeneralization(final Set<Link> ownedGeneralization );
    public void setOwnedFeatureMembership_comp(final Set<Link> ownedFeatureMembership_comp );
    public void setOwnedFeature(final Set<Link> ownedFeature );
    public void setOwnedEndFeature(final Set<Link> ownedEndFeature );
    public void setFeature(final Set<Link> feature );
    public void setInput(final Set<Link> input );
    public void setOutput(final Set<Link> output );
    public void setInheritedMembership(final Set<Link> inheritedMembership );
    public void setEndFeature(final Set<Link> endFeature );
    public void setOwnedConjugator(final Link ownedConjugator );
    public void setConjugator(final Link conjugator );
    public void setFeatureMembership(final Set<Link> featureMembership );
    public void setInheritedFeature(final Set<Link> inheritedFeature );
    public void setMultiplicity(final Link multiplicity );
    public void setOwnedFeatureMembership(final Set<Link> ownedFeatureMembership );
}

