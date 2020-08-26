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
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
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
import org.oasis.oslcop.sysml.Definition;
import org.oasis.oslcop.sysml.IBehavior;
import org.oasis.oslcop.sysml.IFunction;
import org.oasis.oslcop.sysml.IPredicate;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.ActionUsage;
import org.oasis.oslcop.sysml.AnalysisCaseUsage;
import org.oasis.oslcop.sysml.AttributeUsage;
import org.oasis.oslcop.sysml.CalculationUsage;
import org.oasis.oslcop.sysml.CaseUsage;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.ConnectionUsage;
import org.oasis.oslcop.sysml.ConstraintUsage;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Expression;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.IndividualUsage;
import org.oasis.oslcop.sysml.InterfaceUsage;
import org.oasis.oslcop.sysml.ItemUsage;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.oasis.oslcop.sysml.Parameter;
import org.oasis.oslcop.sysml.PartUsage;
import org.oasis.oslcop.sysml.PortUsage;
import org.oasis.oslcop.sysml.ReferenceUsage;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.RequirementUsage;
import org.oasis.oslcop.sysml.StateUsage;
import org.oasis.oslcop.sysml.Step;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.TransitionUsage;
import org.oasis.oslcop.sysml.Usage;
import org.oasis.oslcop.sysml.VariantMembership;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.CONSTRAINTDEFINITION_NAMESPACE)
@OslcName(SysmlDomainConstants.CONSTRAINTDEFINITION_LOCALNAME)
@OslcResourceShape(title = "ConstraintDefinition Resource Shape", describes = SysmlDomainConstants.CONSTRAINTDEFINITION_TYPE)
public class ConstraintDefinition
    extends Definition
    implements IConstraintDefinition, IBehavior, IFunction, IPredicate
{
    // Start of user code attributeAnnotation:expression
    // End of user code
    private Set<Link> expression = new HashSet<Link>();
    // Start of user code attributeAnnotation:result
    // End of user code
    private Link result;
    // Start of user code attributeAnnotation:step
    // End of user code
    private Set<Link> step = new HashSet<Link>();
    // Start of user code attributeAnnotation:parameter
    // End of user code
    private Set<Link> parameter = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ConstraintDefinition()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ConstraintDefinition(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.CONSTRAINTDEFINITION_PATH,
        ConstraintDefinition.class);
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
            result = result + "{a Local ConstraintDefinition Resource} - update ConstraintDefinition.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public void addExpression(final Link expression)
    {
        this.expression.add(expression);
    }
    
    public void addStep(final Link step)
    {
        this.step.add(step);
    }
    
    public void addParameter(final Link parameter)
    {
        this.parameter.add(parameter);
    }
    
    
    // Start of user code getterAnnotation:expression
    // End of user code
    @OslcName("expression")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "expression")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.EXPRESSION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getExpression()
    {
        // Start of user code getterInit:expression
        // End of user code
        return expression;
    }
    
    // Start of user code getterAnnotation:result
    // End of user code
    @OslcName("result")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "result")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Link getResult()
    {
        // Start of user code getterInit:result
        // End of user code
        return result;
    }
    
    // Start of user code getterAnnotation:step
    // End of user code
    @OslcName("step")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "step")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getStep()
    {
        // Start of user code getterInit:step
        // End of user code
        return step;
    }
    
    // Start of user code getterAnnotation:parameter
    // End of user code
    @OslcName("parameter")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "parameter")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getParameter()
    {
        // Start of user code getterInit:parameter
        // End of user code
        return parameter;
    }
    
    
    // Start of user code setterAnnotation:expression
    // End of user code
    public void setExpression(final Set<Link> expression )
    {
        // Start of user code setterInit:expression
        // End of user code
        this.expression.clear();
        if (expression != null)
        {
            this.expression.addAll(expression);
        }
    
        // Start of user code setterFinalize:expression
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
    
    // Start of user code setterAnnotation:step
    // End of user code
    public void setStep(final Set<Link> step )
    {
        // Start of user code setterInit:step
        // End of user code
        this.step.clear();
        if (step != null)
        {
            this.step.addAll(step);
        }
    
        // Start of user code setterFinalize:step
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
    
    
}
