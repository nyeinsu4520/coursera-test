<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="Errorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Mathematics Calculation:
	<%
	int num=7;
	int result=num/0;
	out.println("Result = "+result);
	%>
</body>
</html>