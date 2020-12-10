<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Details</title>
</head>
<body>
<h1>Your name is ${user.name }</h1>
<h1>Your Email is ${user.email }</h1>
<h1>Your messege is ${user.messege }</h1>
</body>
</html>