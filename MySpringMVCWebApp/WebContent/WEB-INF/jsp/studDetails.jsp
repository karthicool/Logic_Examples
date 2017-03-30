<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
${studentDetails}
<br>
<h3>username:</h3>${s1.uname}
<br>
<h3>password:</h3>${s1.pwd}
<br>
<h3>company:</h3>${s1.cmpny}
<br>
<h3>date:</h3>${s1.date}
<br>
<h3>mobile:</h3>${s1.mobile}
<br>
<h3>country:</h3>${s1.studAddress.country}
<br>
<h3>city:</h3>${s1.studAddress.city}
</body>
</html>