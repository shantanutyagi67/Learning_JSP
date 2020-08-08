<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Login to SA67</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <%@page import="com.shantanu.LoginBean"%>
  <div class="container">
    <h2>You have successfully created your account. Please Login to continue using our services.</h2>
    <%--  <%
      LoginBean bean=(LoginBean)request.getSession().getAttribute("myObjectId");
      application.setAttribute("myObjectId", bean);
      out.print("A comfirmation mail has been sent to: "+bean.getEmailid());
    %> --%>
<%--     <% session.setAttribute("key", bean); %>  --%>
<%
String myObjectId = (String)session.getAttribute("myObjectId");
LoginBean obj =(LoginBean) session.getAttribute(myObjectId);
out.print("A comfirmation mail has been sent to: "+obj.getEmailid());
%>
    <form action="ControllerServlet" method="post">
      <input type="hidden" name="myObjectId" value="${myObjectId}" />
      <input type="text" name="lfname" placeholder="Name" required>
      <input type="password" name="lpwd" placeholder="Password" required>
      <input type="submit" value="Login">
    </form>
  </div>
</body>

</html>
