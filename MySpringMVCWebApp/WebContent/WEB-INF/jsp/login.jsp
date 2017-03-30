<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Details</title>
</head>
<body><!--@RequestParam Example  -->
<h2>Enter Student Details</h2>
<form action="StudentFormModel" method="post">
Username:<input type="text" name="uname"/><br>
Password:<input type="password" name="pwd"/><br>
Company:<input type="text" name="cmpny"/><br>
Date:<input type="text" name="date"/><br>
Mobile:<input type="text" name="mobile"/><br>
country:<input type="text" name="studAddress.country"/><br>
city:<input type="text" name="studAddress.city"/><br>
<input type="submit" name="enter"/>
</form>
</body>
</html>