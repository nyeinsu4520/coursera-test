<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Student Information</h1>
	<h3> Name: <%=session.getAttribute("name") %>
	<br> 
	Roll No:<%=session.getAttribute("rollno") %>
	</h3>
</body>
</html>