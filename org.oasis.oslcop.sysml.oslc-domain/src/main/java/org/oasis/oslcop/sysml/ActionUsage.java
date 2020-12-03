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
import org.oasis.oslcop.sysml.Usage;
import org.oasis.oslcop.sysml.IStep;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.ActionUsage;
import org.oasis.oslcop.sysml.AnalysisCaseUsage;
import org.oasis.oslcop.sysml.AttributeUsage;
import org.oasis.oslcop.sysml.Behavior;
import org.oasis.oslcop.sysml.CalculationUsage;
import org.oasis.oslcop.sysml.CaseUsage;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.ConnectionUsage;
import org.oasis.oslcop.sysml.ConstraintUsage;
import org.oasis.oslcop.sysml.Definition;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
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
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.PortUsage;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.ReferenceUsage;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.RequirementUsage;
import org.oasis.oslcop.sysml.StateUsage;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.TransitionUsage;
import org.oasis.oslcop.sysml.Type;
import org.oasis.oslcop.sysml.Usage;
import org.oasis.oslcop.sysml.VariantMembership;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.ACTIONUSAGE_NAMESPACE)
@OslcName(SysmlDomainConstants.ACTIONUSAGE_LOCALNAME)
@OslcResourceShape(title = "ActionUsage Resource Shape", describes = SysmlDomainConstants.ACTIONUSAGE_TYPE)
public class ActionUsage
    extends Usage
    implements IActionUsage, IStep
{
    // Start of user code attributeAnnotation:actionDefinition
    // End of user code
    private Set<Link> actionDefinition = new HashSet<Link>();
    // Start of user code attributeAnnotation:behavior
    // End of user code
    private Set<Link> behavior = new HashSet<Link>();
    // Start of user code attributeAnnotation:parameter
    // End of user code
    private Set<Link> parameter = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ActionUsage()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ActionUsage(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.ACTIONUSAGE_PATH,
        ActionUsage.class);
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
            result = result + "{a Local ActionUsage Resource} - update ActionUsage.toString() to present resource as desired.";
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
    
    public void addActionDefinition(final Link actionDefinition)
    {
        this.actionDefinition.add(actionDefinition);
    }
    
    public void addBehavior(final Link behavior)
    {
        this.behavior.add(behavior);
    }
    
    public void addParameter(final Link parameter)
    {
        this.parameter.add(parameter);
    }
    
    
    // Start of user code getterAnnotation:actionDefinition
    // End of user code
    @OslcName("actionDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "actionDefinition")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.BEHAVIOR_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getActionDefinition()
    {
        // Start of user code getterInit:actionDefinition
        // End of user code
        return actionDefinition;
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
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getParameter()
    {
        // Start of user code getterInit:parameter
        // End of user code
        return parameter;
    }
    
    
    // Start of user code setterAnnotation:actionDefinition
    // End of user code
    public void setActionDefinition(final Set<Link> actionDefinition )
    {
        // Start of user code setterInit:actionDefinition
        // End of user code
        this.actionDefinition.clear();
        if (actionDefinition != null)
        {
            this.actionDefinition.addAll(actionDefinition);
        }
    
        // Start of user code setterFinalize:actionDefinition
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
    
    
}
