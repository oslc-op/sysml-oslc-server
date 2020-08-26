<%--To avoid the overriding of any manual code changes upon subsequent code generations, disable "Generate JSP Files" option in the Adaptor model.--%>
<%--
 Copyright (c) 2018 Jad El-khoury.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.

 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.

 Contributors:

  Jad El-khoury        - Migrate toHtml methods from the resource pojos to be embedded in jsp pages.

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>

<%@page import="org.oasis.oslcop.sysml.FeatureMembership"%>
<%@page import="java.net.URI"%>
<%
String asLocalResource = request.getParameter("asLocalResource");
FeatureMembership aResource = null;
if (request.getParameter("resourceUri") != null) {
    aResource = new FeatureMembership (new URI(request.getParameter("resourceUri")));
}
else {
    if (request.getAttribute("aFeatureMembership") != null) {
        aResource = (FeatureMembership) request.getAttribute("aFeatureMembership");
    }
}

if (asLocalResource != null && asLocalResource.equalsIgnoreCase("true")) {
    out.write("{a Local FeatureMembership Resource} - update FeatureMembership.toString() to present resource as desired.");
}
else {
    if (aResource == null) {
        out.write("<em>null</em>");
    }
    else {    
        out.write("<a href=\"" + aResource.getAbout() + "\" class=\"oslc-resource-link\">" + aResource.getAbout() + "</a>");
    }
}
%>
