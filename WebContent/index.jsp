<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Sign Up to SA67</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <div class="container">
    <form action="LoginServlet" method="post">
      <input type="text" name="fname" placeholder="First Name" required>
      <input type="text" name="lname" placeholder="Last Name" required>
      <input type="email" name="emailid" placeholder="Email Id" required>
      <input type="password" name="pwd" placeholder="Password" required>
      <input type="submit" value="Sign Up" />
    </form>
  </div>
</body>

</html>
