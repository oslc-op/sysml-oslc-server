// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
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
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
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

import org.oasis.oslcop.sysml.IActionUsage;
import org.oasis.oslcop.sysml.IAnalysisCaseUsage;
import org.oasis.oslcop.sysml.IAttributeUsage;
import org.oasis.oslcop.sysml.ICalculationUsage;
import org.oasis.oslcop.sysml.ICaseUsage;
import org.oasis.oslcop.sysml.IConjugation;
import org.oasis.oslcop.sysml.IConnectionUsage;
import org.oasis.oslcop.sysml.IConstraintUsage;
import org.oasis.oslcop.sysml.IDefinition;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IFeature;
import org.oasis.oslcop.sysml.IFeatureMembership;
import org.oasis.oslcop.sysml.IFeatureTyping;
import org.oasis.oslcop.sysml.IGeneralization;
import org.oasis.oslcop.sysml.ISysmlImport;
import org.oasis.oslcop.sysml.IIndividualUsage;
import org.oasis.oslcop.sysml.IInterfaceUsage;
import org.oasis.oslcop.sysml.IItemUsage;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.IMultiplicity;
import org.oasis.oslcop.sysml.ISysmlPackage;
import org.oasis.oslcop.sysml.IPartUsage;
import org.oasis.oslcop.sysml.IPortUsage;
import org.oasis.oslcop.sysml.IRedefinition;
import org.oasis.oslcop.sysml.IReferenceUsage;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.IRequirementUsage;
import org.oasis.oslcop.sysml.IStateUsage;
import org.oasis.oslcop.sysml.ISubsetting;
import org.oasis.oslcop.sysml.ITransitionUsage;
import org.oasis.oslcop.sysml.IType;
import org.oasis.oslcop.sysml.IUsage;
import org.oasis.oslcop.sysml.IVariantMembership;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.USAGE_NAMESPACE)
@OslcName(SysmlDomainConstants.USAGE_LOCALNAME)
@OslcResourceShape(title = "Usage Resource Shape", describes = SysmlDomainConstants.USAGE_TYPE)
public interface IUsage
{

    public void addNestedUsage(final Link nestedUsage );
    public void addNestedPort(final Link nestedPort );
    public void addNestedAction(final Link nestedAction );
    public void addNestedState(final Link nestedState );
    public void addNestedConstraint(final Link nestedConstraint );
    public void addNestedTransition(final Link nestedTransition );
    public void addNestedRequirement(final Link nestedRequirement );
    public void addNestedCalculation(final Link nestedCalculation );
    public void addFlow(final Link flow );
    public void addNestedCase(final Link nestedCase );
    public void addVariantMembership_comp(final Link variantMembership_comp );
    public void addVariant(final Link variant );
    public void addNestedAnalysisCase(final Link nestedAnalysisCase );
    public void addUsage(final Link usage );
    public void addNestedReference(final Link nestedReference );
    public void addNestedConnection(final Link nestedConnection );
    public void addNestedItem(final Link nestedItem );
    public void addNestedPart(final Link nestedPart );
    public void addNestedIndividual(final Link nestedIndividual );
    public void addNestedInterface(final Link nestedInterface );
    public void addNestedAttribute(final Link nestedAttribute );
    public void addVariantMembership(final Link variantMembership );

    @OslcName("isVariation")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isVariation")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsVariation();

    @OslcName("nestedUsage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedUsage")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedUsage();

    @OslcName("owningUsage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningUsage")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningUsage();

    @OslcName("nestedPort")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedPort")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PORTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedPort();

    @OslcName("nestedAction")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedAction")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ACTIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedAction();

    @OslcName("nestedState")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedState")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STATEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedState();

    @OslcName("nestedConstraint")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedConstraint")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONSTRAINTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedConstraint();

    @OslcName("nestedTransition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedTransition")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TRANSITIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedTransition();

    @OslcName("nestedRequirement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedRequirement")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.REQUIREMENTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedRequirement();

    @OslcName("nestedCalculation")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedCalculation")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CALCULATIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedCalculation();

    @OslcName("owningVariationDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningVariationDefinition")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.DEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getOwningVariationDefinition();

    @OslcName("flow")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "flow")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getFlow();

    @OslcName("nestedCase")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedCase")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CASEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedCase();

    @OslcName("owningVariantMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningVariantMembership")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.VARIANTMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Link getOwningVariantMembership();

    @OslcName("variantMembership_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "variantMembership_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.VARIANTMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getVariantMembership_comp();

    @OslcName("owningVariationUsage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningVariationUsage")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningVariationUsage();

    @OslcName("variant")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "variant")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getVariant();

    @OslcName("nestedAnalysisCase")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedAnalysisCase")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ANALYSISCASEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedAnalysisCase();

    @OslcName("usage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "usage")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getUsage();

    @OslcName("nestedReference")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedReference")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.REFERENCEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedReference();

    @OslcName("nestedConnection")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedConnection")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONNECTIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedConnection();

    @OslcName("nestedItem")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedItem")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ITEMUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedItem();

    @OslcName("nestedPart")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedPart")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedPart();

    @OslcName("nestedIndividual")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedIndividual")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.INDIVIDUALUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedIndividual();

    @OslcName("nestedInterface")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedInterface")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.INTERFACEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedInterface();

    @OslcName("nestedAttribute")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "nestedAttribute")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ATTRIBUTEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getNestedAttribute();

    @OslcName("owningDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningDefinition")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.DEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getOwningDefinition();

    @OslcName("variantMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "variantMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.VARIANTMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getVariantMembership();


    public void setIsVariation(final Boolean isVariation );
    public void setNestedUsage(final Set<Link> nestedUsage );
    public void setOwningUsage(final Link owningUsage );
    public void setNestedPort(final Set<Link> nestedPort );
    public void setNestedAction(final Set<Link> nestedAction );
    public void setNestedState(final Set<Link> nestedState );
    public void setNestedConstraint(final Set<Link> nestedConstraint );
    public void setNestedTransition(final Set<Link> nestedTransition );
    public void setNestedRequirement(final Set<Link> nestedRequirement );
    public void setNestedCalculation(final Set<Link> nestedCalculation );
    public void setOwningVariationDefinition(final Link owningVariationDefinition );
    public void setFlow(final Set<Link> flow );
    public void setNestedCase(final Set<Link> nestedCase );
    public void setOwningVariantMembership(final Link owningVariantMembership );
    public void setVariantMembership_comp(final Set<Link> variantMembership_comp );
    public void setOwningVariationUsage(final Link owningVariationUsage );
    public void setVariant(final Set<Link> variant );
    public void setNestedAnalysisCase(final Set<Link> nestedAnalysisCase );
    public void setUsage(final Set<Link> usage );
    public void setNestedReference(final Set<Link> nestedReference );
    public void setNestedConnection(final Set<Link> nestedConnection );
    public void setNestedItem(final Set<Link> nestedItem );
    public void setNestedPart(final Set<Link> nestedPart );
    public void setNestedIndividual(final Set<Link> nestedIndividual );
    public void setNestedInterface(final Set<Link> nestedInterface );
    public void setNestedAttribute(final Set<Link> nestedAttribute );
    public void setOwningDefinition(final Link owningDefinition );
    public void setVariantMembership(final Set<Link> variantMembership );
}

