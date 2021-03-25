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

import org.oasis.oslcop.sysml.IAnnotation;
import org.oasis.oslcop.sysml.IComment;
import org.oasis.oslcop.sysml.IDocumentation;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.ISysmlImport;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.INamespace;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.ITextualRepresentation;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.NAMESPACE_NAMESPACE)
@OslcName(SysmlDomainConstants.NAMESPACE_LOCALNAME)
@OslcResourceShape(title = "Namespace Resource Shape", describes = SysmlDomainConstants.NAMESPACE_TYPE)
public interface INamespace
{

    public void addOwnedMembership_comp(final Link ownedMembership_comp );
    public void addOwnedMember(final Link ownedMember );
    public void addMembership(final Link membership );
    public void addOwnedImport_comp(final Link ownedImport_comp );
    public void addMember(final Link member );
    public void addImportedMembership(final Link importedMembership );
    public void addOwnedMembership(final Link ownedMembership );
    public void addOwnedImport(final Link ownedImport );

    @OslcName("ownedMembership_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMembership_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedMembership_comp();

    @OslcName("ownedMember")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMember")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedMember();

    @OslcName("membership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "membership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getMembership();

    @OslcName("ownedImport_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedImport_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.IMPORT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedImport_comp();

    @OslcName("member")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "member")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getMember();

    @OslcName("importedMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "importedMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getImportedMembership();

    @OslcName("ownedMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedMembership();

    @OslcName("ownedImport")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedImport")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.IMPORT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedImport();


    public void setOwnedMembership_comp(final Set<Link> ownedMembership_comp );
    public void setOwnedMember(final Set<Link> ownedMember );
    public void setMembership(final Set<Link> membership );
    public void setOwnedImport_comp(final Set<Link> ownedImport_comp );
    public void setMember(final Set<Link> member );
    public void setImportedMembership(final Set<Link> importedMembership );
    public void setOwnedMembership(final Set<Link> ownedMembership );
    public void setOwnedImport(final Set<Link> ownedImport );
}

