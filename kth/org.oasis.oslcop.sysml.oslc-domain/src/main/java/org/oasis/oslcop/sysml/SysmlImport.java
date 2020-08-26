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
import org.oasis.oslcop.sysml.Relationship;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.oasis.oslcop.sysml.Relationship;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.IMPORT_NAMESPACE)
@OslcName(SysmlDomainConstants.IMPORT_LOCALNAME)
@OslcResourceShape(title = "Import Resource Shape", describes = SysmlDomainConstants.IMPORT_TYPE)
public class SysmlImport
    extends Relationship
    implements ISysmlImport
{
    // Start of user code attributeAnnotation:visibility
    // End of user code
    private String visibility;
    // Start of user code attributeAnnotation:importedPackage
    // End of user code
    private Link importedPackage;
    // Start of user code attributeAnnotation:importOwningPackage
    // End of user code
    private Link importOwningPackage;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public SysmlImport()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public SysmlImport(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.IMPORT_PATH,
        SysmlImport.class);
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
            result = result + "{a Local Import Resource} - update Import.toString() to present resource as desired.";
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
    
    
    // Start of user code getterAnnotation:visibility
    // End of user code
    @OslcName("visibility")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "visibility")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcAllowedValue({"public", "private", "protected", "package"})
    public String getVisibility()
    {
        // Start of user code getterInit:visibility
        // End of user code
        return visibility;
    }
    
    // Start of user code getterAnnotation:importedPackage
    // End of user code
    @OslcName("importedPackage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "importedPackage")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PACKAGE_TYPE})
    @OslcReadOnly(false)
    public Link getImportedPackage()
    {
        // Start of user code getterInit:importedPackage
        // End of user code
        return importedPackage;
    }
    
    // Start of user code getterAnnotation:importOwningPackage
    // End of user code
    @OslcName("importOwningPackage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "importOwningPackage")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PACKAGE_TYPE})
    @OslcReadOnly(false)
    public Link getImportOwningPackage()
    {
        // Start of user code getterInit:importOwningPackage
        // End of user code
        return importOwningPackage;
    }
    
    
    // Start of user code setterAnnotation:visibility
    // End of user code
    public void setVisibility(final String visibility )
    {
        // Start of user code setterInit:visibility
        // End of user code
        this.visibility = visibility;
    
        // Start of user code setterFinalize:visibility
        // End of user code
    }
    
    // Start of user code setterAnnotation:importedPackage
    // End of user code
    public void setImportedPackage(final Link importedPackage )
    {
        // Start of user code setterInit:importedPackage
        // End of user code
        this.importedPackage = importedPackage;
    
        // Start of user code setterFinalize:importedPackage
        // End of user code
    }
    
    // Start of user code setterAnnotation:importOwningPackage
    // End of user code
    public void setImportOwningPackage(final Link importOwningPackage )
    {
        // Start of user code setterInit:importOwningPackage
        // End of user code
        this.importOwningPackage = importOwningPackage;
    
        // Start of user code setterFinalize:importOwningPackage
        // End of user code
    }
    
    
}
