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

import org.oasis.oslcop.sysml.IActionUsage;
import org.oasis.oslcop.sysml.IAllocationUsage;
import org.oasis.oslcop.sysml.IAnalysisCaseUsage;
import org.oasis.oslcop.sysml.IAnnotation;
import org.oasis.oslcop.sysml.IAttributeUsage;
import org.oasis.oslcop.sysml.ICalculationUsage;
import org.oasis.oslcop.sysml.ICaseUsage;
import org.oasis.oslcop.sysml.ISysmlClass;
import org.oasis.oslcop.sysml.IClassifier;
import org.oasis.oslcop.sysml.IComment;
import org.oasis.oslcop.sysml.IConcernUsage;
import org.oasis.oslcop.sysml.IConjugation;
import org.oasis.oslcop.sysml.IConnectorAsUsage;
import org.oasis.oslcop.sysml.IConstraintUsage;
import org.oasis.oslcop.sysml.IDefinition;
import org.oasis.oslcop.sysml.IDisjoining;
import org.oasis.oslcop.sysml.IDocumentation;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IEnumerationUsage;
import org.oasis.oslcop.sysml.IFeature;
import org.oasis.oslcop.sysml.IFeatureChaining;
import org.oasis.oslcop.sysml.IFeatureMembership;
import org.oasis.oslcop.sysml.IFeatureTyping;
import org.oasis.oslcop.sysml.IFlowConnectionUsage;
import org.oasis.oslcop.sysml.ISysmlImport;
import org.oasis.oslcop.sysml.IInterfaceUsage;
import org.oasis.oslcop.sysml.IItemUsage;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.IMultiplicity;
import org.oasis.oslcop.sysml.INamespace;
import org.oasis.oslcop.sysml.IOccurrenceDefinition;
import org.oasis.oslcop.sysml.IOccurrenceUsage;
import org.oasis.oslcop.sysml.IPartDefinition;
import org.oasis.oslcop.sysml.IPartUsage;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.oasis.oslcop.sysml.IPortUsage;
import org.oasis.oslcop.sysml.IPortioningFeature;
import org.oasis.oslcop.sysml.IRedefinition;
import org.oasis.oslcop.sysml.IReferenceUsage;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.IRenderingDefinition;
import org.oasis.oslcop.sysml.IRenderingUsage;
import org.oasis.oslcop.sysml.IRequirementUsage;
import org.oasis.oslcop.sysml.ISpecialization;
import org.oasis.oslcop.sysml.IStateUsage;
import org.oasis.oslcop.sysml.IStructure;
import org.oasis.oslcop.sysml.ISubsetting;
import org.oasis.oslcop.sysml.ITextualRepresentation;
import org.oasis.oslcop.sysml.ITransitionUsage;
import org.oasis.oslcop.sysml.IType;
import org.oasis.oslcop.sysml.ITypeFeaturing;
import org.oasis.oslcop.sysml.IUsage;
import org.oasis.oslcop.sysml.IUseCaseUsage;
import org.oasis.oslcop.sysml.IVariantMembership;
import org.oasis.oslcop.sysml.IVerificationCaseUsage;
import org.oasis.oslcop.sysml.IViewUsage;
import org.oasis.oslcop.sysml.IViewpointUsage;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.RENDERINGUSAGE_NAMESPACE)
@OslcName(SysmlDomainConstants.RENDERINGUSAGE_LOCALNAME)
@OslcResourceShape(title = "RenderingUsage Shape", describes = SysmlDomainConstants.RENDERINGUSAGE_TYPE)
public interface IRenderingUsage
{


    @OslcName("renderingDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "renderingDefinition")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.RENDERINGDEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getRenderingDefinition();


    public void setRenderingDefinition(final Link renderingDefinition );
}

