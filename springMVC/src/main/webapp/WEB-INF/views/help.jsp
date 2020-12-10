<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
<h1>THis is Help Page</h1>
<h1><% String name = (String) request.getAttribute("name"); %>
Name is
<%= name %></h1>
<c:forEach var="marks" items="${marks }">
<h1> Marks are ${marks}</h1>
</c:forEach>
</body>
</html>