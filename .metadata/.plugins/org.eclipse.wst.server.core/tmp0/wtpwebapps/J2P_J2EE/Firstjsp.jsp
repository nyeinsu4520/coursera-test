<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First File</title>
</head>
<body>
	<%! String name="Smith";
	int age=30;
	public String show(){
		return "Greeting";
	}
	%>
	<h1>Welcome from JSP Page!</h1>
	Hello
	<%=name %>
	<br>
	<%=name+" is "+age+" years old."  %>
	<br>
	<% 
	if(age>30){
	%>
	<h3>
	<%= name+ " is old." %>
	</h3>	
	<%
	}
	else{
		%>
		<h3><%= name+" is young." %></h3>
	<% 
	}
	%>	<br>
	<%= show() %>
	
	
	
</body>
</html>