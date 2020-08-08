<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Login success</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <%@page import="com.shantanu.LoginBean"%>

  <%
    LoginBean bean=(LoginBean)request.getSession().getAttribute("bean");
    out.print("Welcome, "+bean.getFname()+" You are successfully logged in!");
  %>

  <div class="container">
    <p>I dont know frontend.... database support is yet to be implemented. also uploading and downloading feature coming soon</p>
    <p>meanwhile click on the link to watch some YouTube videos</p>
    <a href="https://www.youtube.com/">Open Youtube</a>
  </div>
</body>

</html>
