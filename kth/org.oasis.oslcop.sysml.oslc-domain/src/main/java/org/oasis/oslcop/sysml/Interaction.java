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
import org.oasis.oslcop.sysml.Association;
import org.oasis.oslcop.sysml.IBehavior;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Connector;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.oasis.oslcop.sysml.Parameter;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Step;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.Type;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.INTERACTION_NAMESPACE)
@OslcName(SysmlDomainConstants.INTERACTION_LOCALNAME)
@OslcResourceShape(title = "Interaction Resource Shape", describes = SysmlDomainConstants.INTERACTION_TYPE)
public class Interaction
    extends Association
    implements IInteraction, IBehavior
{
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
    public Interaction()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Interaction(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.INTERACTION_PATH,
        Interaction.class);
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
            result = result + "{a Local Interaction Resource} - update Interaction.toString() to present resource as desired.";
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
    
    public void addStep(final Link step)
    {
        this.step.add(step);
    }
    
    public void addParameter(final Link parameter)
    {
        this.parameter.add(parameter);
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
