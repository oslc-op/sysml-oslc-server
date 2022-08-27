<%--To avoid the overriding of any manual code changes upon subsequent code generations, disable "Generate JSP Files" option in the Adaptor model.--%>
<!DOCTYPE html>
<%--
 Copyright (c) 2022 Contributors to the Eclipse Foundation
 
 See the NOTICE file(s) distributed with this work for additional
 information regarding copyright ownership.
 
 This program and the accompanying materials are made available under the
 terms of the Eclipse Distribution License 1.0 which is available at
 http://www.eclipse.org/org/documents/edl-v10.php.
 
 SPDX-License-Identifier: BSD-3-Simple

 This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@page import="org.eclipse.lyo.oslc4j.core.model.Link" %>
<%@page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider"%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.OslcConstants"%>
<%@page import="org.eclipse.lyo.oslc4j.core.OSLC4JUtils"%>
<%@page import="org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition"%>
<%@page import="org.eclipse.lyo.oslc4j.core.annotation.OslcName"%>
<%@page import="java.lang.reflect.Method"%>
<%@page import="java.net.URI"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="javax.xml.namespace.QName"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.AbstractResource"%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>

<%
  AbstractResource aResource = (AbstractResource) request.getAttribute("aResource");
  String resourceTypeName = (String) request.getAttribute("resourceTypeName");
  URI shapeUri = (URI) request.getAttribute("shapeUri");
  String catalogUrl = UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("/catalog/singleton").build().toString();
  String sourceUri = (String) request.getAttribute("sourceUri");
%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title><%= aResource.toString() %></title>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
  <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">
  <script src="<c:url value="/static/js/ui-preview-helper.js"/>"></script>
</head>

<body>
<!-- Fixed navbar -->
  <nav class="navbar navbar-expand-lg sticky-top navbar-light bg-light">
    <div class="container">
      <a class="navbar-brand" href="<c:url value="/"/>"><%= application.getServletContextName() %></a>
      <ul class="navbar-nav mr-auto">
        <li class="nav-item"><a class="nav-link" href="<c:url value="<%= catalogUrl %>"/>">Service Provider Catalog</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/swagger-ui/index.jsp"/>">Swagger UI</a></li>
      </ul>
    </div>
  </nav>
<!-- Begin page content -->
<div class="container">
        <h2>
            <%= aResource.toString() %>
            <small class="text-muted"><%= resourceTypeName %></small>
        </h2>
        
        <div class="row mt-3">
            <div class="col">
                <h3>Common properties</h3>
            </div>
        </div>
        <div class="row">
            <div class="col-2 text-right">
                <p class="font-weight-bold">Resource URI</p>
            </div>
            <div class="col">
                <a href="<%=aResource.getAbout() %>" class="text-monospace"><%=aResource.getAbout()%></a>
            </div>
        </div>
        <div class="row">
            <div class="col-2 text-right">
                <p class="font-weight-bold">OSLC Shape</p>
            </div>
            <div class="col">
                <p class="text-monospace">
                    <a href="<%=shapeUri%>"><%=shapeUri%></a>
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-2 text-right">
                <p class="font-weight-bold">Additional RDF Types</p>
            </div>
            <div class="col">
                <ul class="list-unstyled">
                    <%if (aResource.getTypes() == null || aResource.getTypes().size() == 0) {%>
                    <li><span class="text-monospace">N/A</span></li>

                    <%}%>
                    <%for (URI type : aResource.getTypes()) {%>
                    <li><span class="text-monospace"><%=type%></span></li>
                    <%}%>
                </ul>
            </div>
        </div>

        <div class="row">
            <div class="col-2 text-right">
                <p class="font-weight-bold">Data Source</p>
            </div>
            <div class="col">
                <p class="text-monospace">
                    <a href="<%=sourceUri%>"><%=sourceUri%></a>
                </p>
            </div>
        </div>

        <div class="row mt-3">
            <div class="col">
                <h3>Resource-specific properties for <%= aResource.getClass().getSimpleName()%></h3>
            </div>
        </div>
        <ul class="nav nav-tabs">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#" id="largeUiPreview">Large</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#" id="smallUiPreview">Small</a>
          </li>
        </ul>
        <div class="container">
        <div class="row mt-3">
        <div class="col" id="uiPreviewIframe">
        </div>
        </div>
        </div>

        <%
        Map<QName, Object> extendedProperties = aResource.getExtendedProperties();
        if (!extendedProperties.isEmpty()) {
        %>
            <h3>Extended Properties</h3>
            <div>
            <%
            for (Map.Entry<QName, Object> entry : extendedProperties.entrySet()) 
            {
                QName key = entry.getKey();
                Object value = entry.getValue();
            %>
            <dl class="row">
                <dt  class="col-sm-2 text-right"><a href="<%=key.getNamespaceURI() + key.getLocalPart() %>"><%=key.getLocalPart()%></a></dt>
                <dd class="col-sm-9"><%= value.toString()%></dd>
            </dl>
            <%
            }
            %>
            </div>
        <%
        }
        %>
</div>
  <footer class="footer">
    <div class="container">
      <p class="text-muted">
        OSLC Adaptor was generated using <a href="http://eclipse.org/lyo">Eclipse Lyo</a>.
      </p>
    </div>
  </footer>

  <script type="text/javascript">
    var largeUiPreview = document.getElementById("largeUiPreview");
    getUiPreviewIframes("<%= aResource.getAbout() %>", attachIframe, largeUiPreview);
    
    function attachIframe(compactStructure, largeUiPreview ) {
        var smallUiPreview = document.getElementById("smallUiPreview");
        var largeUiPreview = document.getElementById("largeUiPreview");
        var smallPrev = compactStructure.small;
        var largePrev = compactStructure.large;
        if (smallPrev !== null) {
            smallUiPreview.onclick = function(){ 
                $(largeUiPreview).removeClass("active");
                $(smallUiPreview).addClass("active");
                showPreview(smallPrev); 
                return false; 
            };
        }
        if (largePrev !== null) {
            largeUiPreview.onclick = function(){ 
                $(smallUiPreview).removeClass("active");
                $(largeUiPreview).addClass("active");
                showPreview(largePrev); 
                return false; 
            };
        }
        previewToShow = largePrev ;
        if (previewToShow == null) {
            previewToShow = smallPrev ;
        }
        if (previewToShow !== null) {
            showPreview(previewToShow);
        }
    }

    function showPreview(previewToShow) {
        var divForUiPreviewIframe = document.getElementById("uiPreviewIframe");
        var previewIframe = createIframe(previewToShow);
        if (divForUiPreviewIframe.childElementCount == 0) {
            divForUiPreviewIframe.appendChild(previewIframe);
        }
        else {
            $(divForUiPreviewIframe).children().replaceWith(previewIframe);
        }
    }
    
    function createIframe(previewToShow) {
        var w = previewToShow.width ? previewToShow.width : "45em";
        var h = previewToShow.height ? previewToShow.height : "11em";
        var previewIframe = document.createElement("iframe");
        previewIframe.src = previewToShow.uri;
        previewIframe.style.width = w;
        previewIframe.style.height = h;
        previewIframe.frameBorder ="0";
        previewIframe.scrolling = "0";
        previewIframe.style.border= "none";
        previewIframe.style.background = "white";
        return previewIframe;
    }
    
  </script>


</body>
</html>
