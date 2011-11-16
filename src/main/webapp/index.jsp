<!--
 ! Spinach Software & Consulting LLC
 ! Copyright 2011 by Spinach Software & Consulting LLC. All rights reserved.
-->
<html>
<br>
<br>
<br>
<br>
<%@page import="org.apache.commons.lang.StringUtils"%>
<head>
<link rel="stylesheet" href="style.css" type="text/css" /> 
</head>
<body>
<h1 align="center">Welcome to the JQuery Demo</h1>
<br>
<div class="tab">
<h4>Following calls are available to use:</h4>

<% 
String localAjaxURL = StringUtils.chompLast(request.getRequestURL().toString(), request.getRequestURI())+"/ajaxLocal.html"; 
String localControllerURL = StringUtils.chompLast(request.getRequestURL().toString(), request.getRequestURI())+"/ajaxToLocalController.html"; 
String remoteRESTURL = StringUtils.chompLast(request.getRequestURL().toString(), request.getRequestURI())+"/ajaxToRemoteREST.html"; 
%>
<br>
<ol>

<li> <p>JQuery/Ajax call to local data-source e.g. check the link <a href=<%= localAjaxURL %>> <%= localAjaxURL %></a></li> 
<li> <p>JQuery/Ajax call to local Spring Controller  e.g. check the link <a href=<%= localControllerURL %>> <%= localControllerURL %></a></li> 
<li> <p>JQuery/Ajax call to remotely deployed REST service  e.g. check the link <a href=<%= remoteRESTURL %>> <%= remoteRESTURL %></a></li> 
</ol>
</div>
</body>
<div id="footer">
		<div class="left" id="footer-left">
			<p class="quiet"><img src="img/spinachLogo_small.JPG" alt="left" /> &copy; 2011 <a href="http://www.spinachsoftware.com/">Spinach Software and Consulting LLC.</a> All rights Reserved</p>
			<div class="clearer">&nbsp;</div>
		</div>
</div>		
</html> 