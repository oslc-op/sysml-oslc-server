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
import org.oasis.oslcop.sysml.IParameter;
import org.oasis.oslcop.sysml.IPartUsage;
import org.oasis.oslcop.sysml.IPortUsage;
import org.oasis.oslcop.sysml.IPredicate;
import org.oasis.oslcop.sysml.IRedefinition;
import org.oasis.oslcop.sysml.IReferenceUsage;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.IRequirementDefinition;
import org.oasis.oslcop.sysml.IRequirementUsage;
import org.oasis.oslcop.sysml.IStateUsage;
import org.oasis.oslcop.sysml.ISubsetting;
import org.oasis.oslcop.sysml.ITransitionUsage;
import org.oasis.oslcop.sysml.IType;
import org.oasis.oslcop.sysml.IUsage;
import org.oasis.oslcop.sysml.IVariantMembership;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.REQUIREMENTUSAGE_NAMESPACE)
@OslcName(SysmlDomainConstants.REQUIREMENTUSAGE_LOCALNAME)
@OslcResourceShape(title = "RequirementUsage Resource Shape", describes = SysmlDomainConstants.REQUIREMENTUSAGE_TYPE)
public interface IRequirementUsage
{

    public void addRequiredConstraint(final Link requiredConstraint );
    public void addAssumedConstraint(final Link assumedConstraint );

    @OslcName("reqId")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "reqId")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getReqId();

    @OslcName("text")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "text")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getText();

    @OslcName("requirementDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "requirementDefinition")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.REQUIREMENTDEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getRequirementDefinition();

    @OslcName("subjectParameter")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "subjectParameter")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Link getSubjectParameter();

    @OslcName("requiredConstraint")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "requiredConstraint")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONSTRAINTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getRequiredConstraint();

    @OslcName("assumedConstraint")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "assumedConstraint")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONSTRAINTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getAssumedConstraint();


    public void setReqId(final String reqId );
    public void setText(final String text );
    public void setRequirementDefinition(final Link requirementDefinition );
    public void setSubjectParameter(final Link subjectParameter );
    public void setRequiredConstraint(final Set<Link> requiredConstraint );
    public void setAssumedConstraint(final Set<Link> assumedConstraint );
}

