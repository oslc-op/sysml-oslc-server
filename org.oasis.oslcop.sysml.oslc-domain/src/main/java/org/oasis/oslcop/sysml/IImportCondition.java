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

import org.oasis.oslcop.sysml.IConditionalImport;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.ISysmlPackage;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.oasis.oslcop.sysml.IPredicate;
import org.oasis.oslcop.sysml.IRelationship;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.IMPORTCONDITION_NAMESPACE)
@OslcName(SysmlDomainConstants.IMPORTCONDITION_LOCALNAME)
@OslcResourceShape(title = "ImportCondition Resource Shape", describes = SysmlDomainConstants.IMPORTCONDITION_TYPE)
public interface IImportCondition
{


    @OslcName("conditionalImport")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "conditionalImport")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONDITIONALIMPORT_TYPE})
    @OslcReadOnly(false)
    public Link getConditionalImport();

    @OslcName("predicate_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "predicate_comp")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PREDICATE_TYPE})
    @OslcReadOnly(false)
    public Link getPredicate_comp();

    @OslcName("predicate")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "predicate")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PREDICATE_TYPE})
    @OslcReadOnly(false)
    public Link getPredicate();


    public void setConditionalImport(final Link conditionalImport );
    public void setPredicate_comp(final Link predicate_comp );
    public void setPredicate(final Link predicate );
}

