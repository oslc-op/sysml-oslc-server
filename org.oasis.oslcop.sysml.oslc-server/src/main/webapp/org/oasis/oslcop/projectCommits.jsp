<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URI"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="org.eclipse.lyo.oslc4j.core.OSLC4JUtils"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>

<%@page import="org.eclipse.lyo.store.Store"%>
<%@page import="org.oasis.oslcop.sysml.SysmlServerManager"%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider"%>
<%@page import="org.oasis.oslcop.sysml.services.ProjectCommitSelectionService"%>
<%@page import="org.oasis.oslcop.sysml.resources.view.ProjectCommitViewModel"%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>

<%
ServiceProvider selectedServiceProvider = (ServiceProvider) request.getAttribute("selectedServiceProvider");
List<ServiceProvider> serviceProviders = (List<ServiceProvider>) request.getAttribute("serviceProviders");
%>

<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>ProjectCommits</title>

  <link href="<c:url value="/static/css/bootstrap-4.0.0-beta.min.css"/>" rel="stylesheet">
  <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">

  <script src="<c:url value="/static/js/jquery-3.2.1.min.js"/>"></script>
  <script src="<c:url value="/static/js/popper-1.11.0.min.js"/>"></script>
  <script src="<c:url value="/static/js/bootstrap-4.0.0-beta.min.js"/>"></script>
</head>

<body>
<!-- Fixed navbar -->
  <nav class="navbar navbar-expand-lg sticky-top navbar-light bg-light">
    <div class="container">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item"><a class="nav-link" href="<c:url value="/"/>"><%= application.getServletContextName() %></a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/oslc/catalog/singleton"/>">Service Provider Catalog</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/swagger-ui/index.jsp"/>">Swagger UI</a></li>
      </ul>
    </div>
  </nav>
<!-- Begin page content -->
<div class="container">
    <div>
        <h1>ProjectCommits</h1>
        <p>Selected ProjectCommit: <%= (null == selectedServiceProvider) ? "Not Set" : selectedServiceProvider.getAbout().toString()%></p>
        <p>Select another ProjectCommit from list below</p>
        <p>All Project Commits:</p>
        <ul>
        <%for (ServiceProvider serviceProvider : serviceProviders) {%>
            <li>
            <%=serviceProvider.getTitle()%>
            <%if ((null != selectedServiceProvider) && (serviceProvider.getAbout().equals(selectedServiceProvider.getAbout()))) {%>
                <strong>Current Selection</strong>
            <%
            }
            else {
            %>
                <a href="<%= UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("/projectCommits/switch").queryParam("serviceProviderUri", serviceProvider.getAbout()).build() %>" role="button">Switch to this Project Commit</a>
            <%}%>
            </li>
            <ul>
                <%
                String[] split = serviceProvider.getIdentifier().split("/");
                String projectId = split[0];
                String projectCommitId = split[1];
                %>
                <li>Project ID: <%=projectId%></li>
                <li>Commit ID: <%=projectCommitId%></li>
                <li><a href="<%= serviceProvider.getAbout() %>">Service Provider</a> (Only available after switching to this commit)</li>
            </ul>
        <%}%>
        </ul>
    </div>
</div>
  <footer class="footer">
    <div class="container">
      <p class="text-muted">
        OSLC Adaptor was generated using <a href="http://eclipse.org/lyo">Eclipse Lyo</a>.
      </p>
    </div>
  </footer>
</body>
</html>
