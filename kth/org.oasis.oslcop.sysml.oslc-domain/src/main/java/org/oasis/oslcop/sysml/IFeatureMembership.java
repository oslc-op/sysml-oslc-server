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

import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IFeature;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.ISysmlPackage;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.IType;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.FEATUREMEMBERSHIP_NAMESPACE)
@OslcName(SysmlDomainConstants.FEATUREMEMBERSHIP_LOCALNAME)
@OslcResourceShape(title = "FeatureMembership Resource Shape", describes = SysmlDomainConstants.FEATUREMEMBERSHIP_TYPE)
public interface IFeatureMembership
{


    @OslcName("isDerived")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isDerived")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsDerived();

    @OslcName("isReadOnly")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isReadOnly")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsReadOnly();

    @OslcName("isComposite")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isComposite")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsComposite();

    @OslcName("isPortion")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isPortion")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsPortion();

    @OslcName("isPort")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isPort")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsPort();

    @OslcName("direction")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "direction")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcAllowedValue({"in", "inout", "out"})
    public String getDirection();

    @OslcName("memberFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberFeature")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getMemberFeature();

    @OslcName("ownedMemberFeature_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberFeature_comp")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberFeature_comp();

    @OslcName("owningType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningType")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningType();

    @OslcName("ownedMemberFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberFeature")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberFeature();


    public void setIsDerived(final Boolean isDerived );
    public void setIsReadOnly(final Boolean isReadOnly );
    public void setIsComposite(final Boolean isComposite );
    public void setIsPortion(final Boolean isPortion );
    public void setIsPort(final Boolean isPort );
    public void setDirection(final String direction );
    public void setMemberFeature(final Link memberFeature );
    public void setOwnedMemberFeature_comp(final Link ownedMemberFeature_comp );
    public void setOwningType(final Link owningType );
    public void setOwnedMemberFeature(final Link ownedMemberFeature );
}

