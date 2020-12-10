<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Contact Page</title>
  </head>
  <body>
<div class="container mt-5">
<form action="processform" method="post">
<h3 class="text-center">Contact Form</h3>
<% String b = (String)request.getAttribute("b");
if(b=="true"){
%>
<div class="alert alert-danger" role="alert">

 <form:errors path="user.*"/>
</div>
<% } %>
 <div class="form-group">
    <label for="Username">Enter Name</label>
    <input type="text" required class="form-control" name="name" id="Username" aria-describedby="emailHelp" placeholder="Enter Your Name">
   
  </div>


  <div class="form-group">
    <label for="exampleInputEmail1">Enter Email address</label>
    <input type="email" required class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Email">
   
  </div>
  <div class="form-group">
    <label for="msg">Enter Messege</label>
    <textarea  class="form-control" name="messege" rows="6" id="msg" placeholder="Enter Messeege here"></textarea>
  </div>
  
 <div class="container text-center">
  <button type="submit" class="btn btn-success">Submit</button>
  </div>
</form>
</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>