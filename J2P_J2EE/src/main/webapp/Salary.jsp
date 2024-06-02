<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Salary Information</h1>
	<jsp:useBean id="emp" class="test.Employee" scope="session">
	</jsp:useBean>
	Name:
	<jsp:getProperty property="name" name="emp" /><br>
	Salary:
	<jsp:getProperty property="salary" name="emp" /><br>
</body>
</html>