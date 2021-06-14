<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
<h3> Hello <%= request.getAttribute("user") %>,Login Successfully.</h3>
<a href="Login.html">Login Page</a>
</body>
</html>