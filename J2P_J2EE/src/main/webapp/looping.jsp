<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loop Here</title>
</head>
<body>
	<%
		for(int i=1; i<=100;i++){
			if(i%2==0){
	%>
		<h1>Number <%=i %></h1>
	<% 
		}
	}
	%>
</body>
</html>