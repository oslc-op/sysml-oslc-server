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
import org.oasis.oslcop.sysml.Membership;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Definition;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Usage;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.VARIANTMEMBERSHIP_NAMESPACE)
@OslcName(SysmlDomainConstants.VARIANTMEMBERSHIP_LOCALNAME)
@OslcResourceShape(title = "VariantMembership Resource Shape", describes = SysmlDomainConstants.VARIANTMEMBERSHIP_TYPE)
public class VariantMembership
    extends Membership
    implements IVariantMembership
{
    // Start of user code attributeAnnotation:owningVariationDefinition
    // End of user code
    private Link owningVariationDefinition;
    // Start of user code attributeAnnotation:owningVariationUsage
    // End of user code
    private Link owningVariationUsage;
    // Start of user code attributeAnnotation:ownedVariantUsage_comp
    // End of user code
    private Link ownedVariantUsage_comp;
    // Start of user code attributeAnnotation:ownedVariantUsage
    // End of user code
    private Link ownedVariantUsage;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public VariantMembership()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public VariantMembership(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.VARIANTMEMBERSHIP_PATH,
        VariantMembership.class);
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
            result = result + "{a Local VariantMembership Resource} - update VariantMembership.toString() to present resource as desired.";
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
    
    
    // Start of user code getterAnnotation:owningVariationDefinition
    // End of user code
    @OslcName("owningVariationDefinition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningVariationDefinition")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.DEFINITION_TYPE})
    @OslcReadOnly(false)
    public Link getOwningVariationDefinition()
    {
        // Start of user code getterInit:owningVariationDefinition
        // End of user code
        return owningVariationDefinition;
    }
    
    // Start of user code getterAnnotation:owningVariationUsage
    // End of user code
    @OslcName("owningVariationUsage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningVariationUsage")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningVariationUsage()
    {
        // Start of user code getterInit:owningVariationUsage
        // End of user code
        return owningVariationUsage;
    }
    
    // Start of user code getterAnnotation:ownedVariantUsage_comp
    // End of user code
    @OslcName("ownedVariantUsage_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedVariantUsage_comp")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedVariantUsage_comp()
    {
        // Start of user code getterInit:ownedVariantUsage_comp
        // End of user code
        return ownedVariantUsage_comp;
    }
    
    // Start of user code getterAnnotation:ownedVariantUsage
    // End of user code
    @OslcName("ownedVariantUsage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedVariantUsage")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedVariantUsage()
    {
        // Start of user code getterInit:ownedVariantUsage
        // End of user code
        return ownedVariantUsage;
    }
    
    
    // Start of user code setterAnnotation:owningVariationDefinition
    // End of user code
    public void setOwningVariationDefinition(final Link owningVariationDefinition )
    {
        // Start of user code setterInit:owningVariationDefinition
        // End of user code
        this.owningVariationDefinition = owningVariationDefinition;
    
        // Start of user code setterFinalize:owningVariationDefinition
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningVariationUsage
    // End of user code
    public void setOwningVariationUsage(final Link owningVariationUsage )
    {
        // Start of user code setterInit:owningVariationUsage
        // End of user code
        this.owningVariationUsage = owningVariationUsage;
    
        // Start of user code setterFinalize:owningVariationUsage
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedVariantUsage_comp
    // End of user code
    public void setOwnedVariantUsage_comp(final Link ownedVariantUsage_comp )
    {
        // Start of user code setterInit:ownedVariantUsage_comp
        // End of user code
        this.ownedVariantUsage_comp = ownedVariantUsage_comp;
    
        // Start of user code setterFinalize:ownedVariantUsage_comp
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedVariantUsage
    // End of user code
    public void setOwnedVariantUsage(final Link ownedVariantUsage )
    {
        // Start of user code setterInit:ownedVariantUsage
        // End of user code
        this.ownedVariantUsage = ownedVariantUsage;
    
        // Start of user code setterFinalize:ownedVariantUsage
        // End of user code
    }
    
    
}
