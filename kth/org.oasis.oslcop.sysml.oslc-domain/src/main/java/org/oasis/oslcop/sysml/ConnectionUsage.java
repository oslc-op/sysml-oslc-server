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
import org.oasis.oslcop.sysml.PartUsage;
import org.oasis.oslcop.sysml.IConnector;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.ActionUsage;
import org.oasis.oslcop.sysml.AnalysisCaseUsage;
import org.oasis.oslcop.sysml.Association;
import org.oasis.oslcop.sysml.AttributeUsage;
import org.oasis.oslcop.sysml.CalculationUsage;
import org.oasis.oslcop.sysml.CaseUsage;
import org.oasis.oslcop.sysml.SysmlClass;
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
import org.oasis.oslcop.sysml.PartDefinition;
import org.oasis.oslcop.sysml.PartUsage;
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
@OslcNamespace(SysmlDomainConstants.CONNECTIONUSAGE_NAMESPACE)
@OslcName(SysmlDomainConstants.CONNECTIONUSAGE_LOCALNAME)
@OslcResourceShape(title = "ConnectionUsage Resource Shape", describes = SysmlDomainConstants.CONNECTIONUSAGE_TYPE)
public class ConnectionUsage
    extends PartUsage
    implements IConnectionUsage, IConnector, IRelationship
{
    // Start of user code attributeAnnotation:relatedElement
    // End of user code
    private Set<Link> relatedElement = new HashSet<Link>();
    // Start of user code attributeAnnotation:target
    // End of user code
    private Set<Link> target = new HashSet<Link>();
    // Start of user code attributeAnnotation:source
    // End of user code
    private Set<Link> source = new HashSet<Link>();
    // Start of user code attributeAnnotation:owningRelatedElement
    // End of user code
    private Link owningRelatedElement;
    // Start of user code attributeAnnotation:ownedRelatedElement_comp
    // End of user code
    private Set<Link> ownedRelatedElement_comp = new HashSet<Link>();
    // Start of user code attributeAnnotation:ownedRelatedElement
    // End of user code
    private Set<Link> ownedRelatedElement = new HashSet<Link>();
    // Start of user code attributeAnnotation:isDirected
    // End of user code
    private Boolean isDirected;
    // Start of user code attributeAnnotation:relatedFeature
    // End of user code
    private Set<Link> relatedFeature = new HashSet<Link>();
    // Start of user code attributeAnnotation:association
    // End of user code
    private Set<Link> association = new HashSet<Link>();
    // Start of user code attributeAnnotation:connectorEnd
    // End of user code
    private Set<Link> connectorEnd = new HashSet<Link>();
    // Start of user code attributeAnnotation:ownedAssociationType
    // End of user code
    private Set<Link> ownedAssociationType = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ConnectionUsage()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ConnectionUsage(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.CONNECTIONUSAGE_PATH,
        ConnectionUsage.class);
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
            result = result + "{a Local ConnectionUsage Resource} - update ConnectionUsage.toString() to present resource as desired.";
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
    
    public void addRelatedElement(final Link relatedElement)
    {
        this.relatedElement.add(relatedElement);
    }
    
    public void addTarget(final Link target)
    {
        this.target.add(target);
    }
    
    public void addSource(final Link source)
    {
        this.source.add(source);
    }
    
    public void addOwnedRelatedElement_comp(final Link ownedRelatedElement_comp)
    {
        this.ownedRelatedElement_comp.add(ownedRelatedElement_comp);
    }
    
    public void addOwnedRelatedElement(final Link ownedRelatedElement)
    {
        this.ownedRelatedElement.add(ownedRelatedElement);
    }
    
    public void addRelatedFeature(final Link relatedFeature)
    {
        this.relatedFeature.add(relatedFeature);
    }
    
    public void addAssociation(final Link association)
    {
        this.association.add(association);
    }
    
    public void addConnectorEnd(final Link connectorEnd)
    {
        this.connectorEnd.add(connectorEnd);
    }
    
    public void addOwnedAssociationType(final Link ownedAssociationType)
    {
        this.ownedAssociationType.add(ownedAssociationType);
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
    
    // Start of user code getterAnnotation:source
    // End of user code
    @OslcName("source")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "source")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getSource()
    {
        // Start of user code getterInit:source
        // End of user code
        return source;
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
    
    // Start of user code getterAnnotation:ownedRelatedElement_comp
    // End of user code
    @OslcName("ownedRelatedElement_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedRelatedElement_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedRelatedElement_comp()
    {
        // Start of user code getterInit:ownedRelatedElement_comp
        // End of user code
        return ownedRelatedElement_comp;
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
    
    // Start of user code getterAnnotation:isDirected
    // End of user code
    @OslcName("isDirected")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isDirected")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsDirected()
    {
        // Start of user code getterInit:isDirected
        // End of user code
        return isDirected;
    }
    
    // Start of user code getterAnnotation:relatedFeature
    // End of user code
    @OslcName("relatedFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "relatedFeature")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getRelatedFeature()
    {
        // Start of user code getterInit:relatedFeature
        // End of user code
        return relatedFeature;
    }
    
    // Start of user code getterAnnotation:association
    // End of user code
    @OslcName("association")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "association")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ASSOCIATION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getAssociation()
    {
        // Start of user code getterInit:association
        // End of user code
        return association;
    }
    
    // Start of user code getterAnnotation:connectorEnd
    // End of user code
    @OslcName("connectorEnd")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "connectorEnd")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getConnectorEnd()
    {
        // Start of user code getterInit:connectorEnd
        // End of user code
        return connectorEnd;
    }
    
    // Start of user code getterAnnotation:ownedAssociationType
    // End of user code
    @OslcName("ownedAssociationType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedAssociationType")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ASSOCIATION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedAssociationType()
    {
        // Start of user code getterInit:ownedAssociationType
        // End of user code
        return ownedAssociationType;
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
    
    // Start of user code setterAnnotation:source
    // End of user code
    public void setSource(final Set<Link> source )
    {
        // Start of user code setterInit:source
        // End of user code
        this.source.clear();
        if (source != null)
        {
            this.source.addAll(source);
        }
    
        // Start of user code setterFinalize:source
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
    
    // Start of user code setterAnnotation:ownedRelatedElement_comp
    // End of user code
    public void setOwnedRelatedElement_comp(final Set<Link> ownedRelatedElement_comp )
    {
        // Start of user code setterInit:ownedRelatedElement_comp
        // End of user code
        this.ownedRelatedElement_comp.clear();
        if (ownedRelatedElement_comp != null)
        {
            this.ownedRelatedElement_comp.addAll(ownedRelatedElement_comp);
        }
    
        // Start of user code setterFinalize:ownedRelatedElement_comp
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
    
    // Start of user code setterAnnotation:isDirected
    // End of user code
    public void setIsDirected(final Boolean isDirected )
    {
        // Start of user code setterInit:isDirected
        // End of user code
        this.isDirected = isDirected;
    
        // Start of user code setterFinalize:isDirected
        // End of user code
    }
    
    // Start of user code setterAnnotation:relatedFeature
    // End of user code
    public void setRelatedFeature(final Set<Link> relatedFeature )
    {
        // Start of user code setterInit:relatedFeature
        // End of user code
        this.relatedFeature.clear();
        if (relatedFeature != null)
        {
            this.relatedFeature.addAll(relatedFeature);
        }
    
        // Start of user code setterFinalize:relatedFeature
        // End of user code
    }
    
    // Start of user code setterAnnotation:association
    // End of user code
    public void setAssociation(final Set<Link> association )
    {
        // Start of user code setterInit:association
        // End of user code
        this.association.clear();
        if (association != null)
        {
            this.association.addAll(association);
        }
    
        // Start of user code setterFinalize:association
        // End of user code
    }
    
    // Start of user code setterAnnotation:connectorEnd
    // End of user code
    public void setConnectorEnd(final Set<Link> connectorEnd )
    {
        // Start of user code setterInit:connectorEnd
        // End of user code
        this.connectorEnd.clear();
        if (connectorEnd != null)
        {
            this.connectorEnd.addAll(connectorEnd);
        }
    
        // Start of user code setterFinalize:connectorEnd
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedAssociationType
    // End of user code
    public void setOwnedAssociationType(final Set<Link> ownedAssociationType )
    {
        // Start of user code setterInit:ownedAssociationType
        // End of user code
        this.ownedAssociationType.clear();
        if (ownedAssociationType != null)
        {
            this.ownedAssociationType.addAll(ownedAssociationType);
        }
    
        // Start of user code setterFinalize:ownedAssociationType
        // End of user code
    }
    
    
}
