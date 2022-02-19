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
import org.oasis.oslcop.sysml.ItemFlow;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.ISuccession;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.Association;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Disjoining;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Expression;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureChaining;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.ItemFeature;
import org.oasis.oslcop.sysml.ItemFlowEnd;
import org.oasis.oslcop.sysml.ItemFlowFeature;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Specialization;
import org.oasis.oslcop.sysml.Step;
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
@OslcNamespace(SysmlDomainConstants.SUCCESSIONITEMFLOW_NAMESPACE)
@OslcName(SysmlDomainConstants.SUCCESSIONITEMFLOW_LOCALNAME)
@OslcResourceShape(title = "SuccessionItemFlow Shape", describes = SysmlDomainConstants.SUCCESSIONITEMFLOW_TYPE)
public class SuccessionItemFlow
    extends ItemFlow
    implements ISuccessionItemFlow, IRelationship, ISuccession
{
    // Start of user code attributeAnnotation:transitionStep
    // End of user code
    private Link transitionStep;
    // Start of user code attributeAnnotation:triggerStep
    // End of user code
    private Set<Link> triggerStep = new HashSet<Link>();
    // Start of user code attributeAnnotation:effectStep
    // End of user code
    private Set<Link> effectStep = new HashSet<Link>();
    // Start of user code attributeAnnotation:guardExpression
    // End of user code
    private Set<Link> guardExpression = new HashSet<Link>();
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
    public SuccessionItemFlow()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public SuccessionItemFlow(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.SUCCESSIONITEMFLOW_PATH,
        SuccessionItemFlow.class);
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
            result = result + "{a Local SuccessionItemFlow Resource} - update SuccessionItemFlow.toString() to present resource as desired.";
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
    
    public void addTriggerStep(final Link triggerStep)
    {
        this.triggerStep.add(triggerStep);
    }
    
    public void addEffectStep(final Link effectStep)
    {
        this.effectStep.add(effectStep);
    }
    
    public void addGuardExpression(final Link guardExpression)
    {
        this.guardExpression.add(guardExpression);
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
    
    
    // Start of user code getterAnnotation:transitionStep
    // End of user code
    @OslcName("transitionStep")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "transitionStep")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Link getTransitionStep()
    {
        // Start of user code getterInit:transitionStep
        // End of user code
        return transitionStep;
    }
    
    // Start of user code getterAnnotation:triggerStep
    // End of user code
    @OslcName("triggerStep")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "triggerStep")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getTriggerStep()
    {
        // Start of user code getterInit:triggerStep
        // End of user code
        return triggerStep;
    }
    
    // Start of user code getterAnnotation:effectStep
    // End of user code
    @OslcName("effectStep")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "effectStep")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getEffectStep()
    {
        // Start of user code getterInit:effectStep
        // End of user code
        return effectStep;
    }
    
    // Start of user code getterAnnotation:guardExpression
    // End of user code
    @OslcName("guardExpression")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "guardExpression")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.EXPRESSION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getGuardExpression()
    {
        // Start of user code getterInit:guardExpression
        // End of user code
        return guardExpression;
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
    
    
    // Start of user code setterAnnotation:transitionStep
    // End of user code
    public void setTransitionStep(final Link transitionStep )
    {
        // Start of user code setterInit:transitionStep
        // End of user code
        this.transitionStep = transitionStep;
    
        // Start of user code setterFinalize:transitionStep
        // End of user code
    }
    
    // Start of user code setterAnnotation:triggerStep
    // End of user code
    public void setTriggerStep(final Set<Link> triggerStep )
    {
        // Start of user code setterInit:triggerStep
        // End of user code
        this.triggerStep.clear();
        if (triggerStep != null)
        {
            this.triggerStep.addAll(triggerStep);
        }
    
        // Start of user code setterFinalize:triggerStep
        // End of user code
    }
    
    // Start of user code setterAnnotation:effectStep
    // End of user code
    public void setEffectStep(final Set<Link> effectStep )
    {
        // Start of user code setterInit:effectStep
        // End of user code
        this.effectStep.clear();
        if (effectStep != null)
        {
            this.effectStep.addAll(effectStep);
        }
    
        // Start of user code setterFinalize:effectStep
        // End of user code
    }
    
    // Start of user code setterAnnotation:guardExpression
    // End of user code
    public void setGuardExpression(final Set<Link> guardExpression )
    {
        // Start of user code setterInit:guardExpression
        // End of user code
        this.guardExpression.clear();
        if (guardExpression != null)
        {
            this.guardExpression.addAll(guardExpression);
        }
    
        // Start of user code setterFinalize:guardExpression
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
