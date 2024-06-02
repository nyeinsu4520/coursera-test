<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
	<%
	String name=request.getParameter("uname");
	int age=(Integer.parseInt(request.getParameter("age")));
	%>
	<h1>Hello <%=name+"!" %> </h1>
	<h3>
	<%=name+" is "+age+" years old." %></h3>
	<%
	if(age>30){ %>
		<h4>
		<%=name+" is old." %>
		</h4>	
	<% 
	}
	else{ %>
		<h4><%=name+" is young." %></h4>
	<% }
	%>
</body>
</html>