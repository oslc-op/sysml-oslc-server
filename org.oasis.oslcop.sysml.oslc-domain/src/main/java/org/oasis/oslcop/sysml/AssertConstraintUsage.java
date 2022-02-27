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
import org.oasis.oslcop.sysml.ConstraintUsage;
import org.oasis.oslcop.sysml.IBooleanExpression;
import org.oasis.oslcop.sysml.IExpression;
import org.oasis.oslcop.sysml.IInvariant;
import org.oasis.oslcop.sysml.IStep;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.ActionUsage;
import org.oasis.oslcop.sysml.AllocationUsage;
import org.oasis.oslcop.sysml.AnalysisCaseUsage;
import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.AttributeUsage;
import org.oasis.oslcop.sysml.Behavior;
import org.oasis.oslcop.sysml.CalculationUsage;
import org.oasis.oslcop.sysml.CaseUsage;
import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.ConcernUsage;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.ConnectorAsUsage;
import org.oasis.oslcop.sysml.ConstraintUsage;
import org.oasis.oslcop.sysml.Definition;
import org.oasis.oslcop.sysml.Disjoining;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.EnumerationUsage;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureChaining;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.FlowConnectionUsage;
import org.oasis.oslcop.sysml.Function;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.InterfaceUsage;
import org.oasis.oslcop.sysml.ItemUsage;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.Namespace;
import org.oasis.oslcop.sysml.OccurrenceDefinition;
import org.oasis.oslcop.sysml.OccurrenceUsage;
import org.oasis.oslcop.sysml.PartUsage;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.PortUsage;
import org.oasis.oslcop.sysml.PortioningFeature;
import org.oasis.oslcop.sysml.Predicate;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.ReferenceUsage;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.RenderingUsage;
import org.oasis.oslcop.sysml.RequirementUsage;
import org.oasis.oslcop.sysml.Specialization;
import org.oasis.oslcop.sysml.StateUsage;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.TextualRepresentation;
import org.oasis.oslcop.sysml.TransitionUsage;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.TypeFeaturing;
import org.oasis.oslcop.sysml.Usage;
import org.oasis.oslcop.sysml.UseCaseUsage;
import org.oasis.oslcop.sysml.VariantMembership;
import org.oasis.oslcop.sysml.VerificationCaseUsage;
import org.oasis.oslcop.sysml.ViewUsage;
import org.oasis.oslcop.sysml.ViewpointUsage;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.ASSERTCONSTRAINTUSAGE_NAMESPACE)
@OslcName(SysmlDomainConstants.ASSERTCONSTRAINTUSAGE_LOCALNAME)
@OslcResourceShape(title = "AssertConstraintUsage Shape", describes = SysmlDomainConstants.ASSERTCONSTRAINTUSAGE_TYPE)
public class AssertConstraintUsage
    extends ConstraintUsage
    implements IAssertConstraintUsage, IBooleanExpression, IExpression, IInvariant, IStep
{
    // Start of user code attributeAnnotation:assertedConstraint
    // End of user code
    private Link assertedConstraint;
    // Start of user code attributeAnnotation:predicate
    // End of user code
    private Link predicate;
    // Start of user code attributeAnnotation:isNegated
    // End of user code
    private Boolean isNegated;
    // Start of user code attributeAnnotation:behavior
    // End of user code
    private Set<Link> behavior = new HashSet<Link>();
    // Start of user code attributeAnnotation:parameter
    // End of user code
    private Set<Link> parameter = new HashSet<Link>();
    // Start of user code attributeAnnotation:isModelLevelEvaluable
    // End of user code
    private Boolean isModelLevelEvaluable;
    // Start of user code attributeAnnotation:function
    // End of user code
    private Link function;
    // Start of user code attributeAnnotation:result
    // End of user code
    private Link result;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public AssertConstraintUsage()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public AssertConstraintUsage(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.ASSERTCONSTRAINTUSAGE_PATH,
        AssertConstraintUsage.class);
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
            result = result + "{a Local AssertConstraintUsage Resource} - update AssertConstraintUsage.toString() to present resource as desired.";
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
    
    public void addBehavior(final Link behavior)
    {
        this.behavior.add(behavior);
    }
    
    public void addParameter(final Link parameter)
    {
        this.parameter.add(parameter);
    }
    
    
    // Start of user code getterAnnotation:assertedConstraint
    // End of user code
    @OslcName("assertedConstraint")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "assertedConstraint")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONSTRAINTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Link getAssertedConstraint()
    {
        // Start of user code getterInit:assertedConstraint
        // End of user code
        return assertedConstraint;
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
    
    // Start of user code getterAnnotation:isNegated
    // End of user code
    @OslcName("isNegated")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isNegated")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsNegated()
    {
        // Start of user code getterInit:isNegated
        // End of user code
        return isNegated;
    }
    
    // Start of user code getterAnnotation:behavior
    // End of user code
    @OslcName("behavior")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "behavior")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.BEHAVIOR_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getBehavior()
    {
        // Start of user code getterInit:behavior
        // End of user code
        return behavior;
    }
    
    // Start of user code getterAnnotation:parameter
    // End of user code
    @OslcName("parameter")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "parameter")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getParameter()
    {
        // Start of user code getterInit:parameter
        // End of user code
        return parameter;
    }
    
    // Start of user code getterAnnotation:isModelLevelEvaluable
    // End of user code
    @OslcName("isModelLevelEvaluable")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isModelLevelEvaluable")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsModelLevelEvaluable()
    {
        // Start of user code getterInit:isModelLevelEvaluable
        // End of user code
        return isModelLevelEvaluable;
    }
    
    // Start of user code getterAnnotation:function
    // End of user code
    @OslcName("function")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "function")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FUNCTION_TYPE})
    @OslcReadOnly(false)
    public Link getFunction()
    {
        // Start of user code getterInit:function
        // End of user code
        return function;
    }
    
    // Start of user code getterAnnotation:result
    // End of user code
    @OslcName("result")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "result")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getResult()
    {
        // Start of user code getterInit:result
        // End of user code
        return result;
    }
    
    
    // Start of user code setterAnnotation:assertedConstraint
    // End of user code
    public void setAssertedConstraint(final Link assertedConstraint )
    {
        // Start of user code setterInit:assertedConstraint
        // End of user code
        this.assertedConstraint = assertedConstraint;
    
        // Start of user code setterFinalize:assertedConstraint
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
    
    // Start of user code setterAnnotation:isNegated
    // End of user code
    public void setIsNegated(final Boolean isNegated )
    {
        // Start of user code setterInit:isNegated
        // End of user code
        this.isNegated = isNegated;
    
        // Start of user code setterFinalize:isNegated
        // End of user code
    }
    
    // Start of user code setterAnnotation:behavior
    // End of user code
    public void setBehavior(final Set<Link> behavior )
    {
        // Start of user code setterInit:behavior
        // End of user code
        this.behavior.clear();
        if (behavior != null)
        {
            this.behavior.addAll(behavior);
        }
    
        // Start of user code setterFinalize:behavior
        // End of user code
    }
    
    // Start of user code setterAnnotation:parameter
    // End of user code
    public void setParameter(final Set<Link> parameter )
    {
        // Start of user code setterInit:parameter
        // End of user code
        this.parameter.clear();
        if (parameter != null)
        {
            this.parameter.addAll(parameter);
        }
    
        // Start of user code setterFinalize:parameter
        // End of user code
    }
    
    // Start of user code setterAnnotation:isModelLevelEvaluable
    // End of user code
    public void setIsModelLevelEvaluable(final Boolean isModelLevelEvaluable )
    {
        // Start of user code setterInit:isModelLevelEvaluable
        // End of user code
        this.isModelLevelEvaluable = isModelLevelEvaluable;
    
        // Start of user code setterFinalize:isModelLevelEvaluable
        // End of user code
    }
    
    // Start of user code setterAnnotation:function
    // End of user code
    public void setFunction(final Link function )
    {
        // Start of user code setterInit:function
        // End of user code
        this.function = function;
    
        // Start of user code setterFinalize:function
        // End of user code
    }
    
    // Start of user code setterAnnotation:result
    // End of user code
    public void setResult(final Link result )
    {
        // Start of user code setterInit:result
        // End of user code
        this.result = result;
    
        // Start of user code setterFinalize:result
        // End of user code
    }
    
    
}
