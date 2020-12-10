<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h1>Hello</h1>
<!--
<h1><% String name = (String) request.getAttribute("name");%>
 Name is <%= name %></h1>
 -->
 <h1> My Name is ${name  }</h1>
</body>
</html>