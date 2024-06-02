<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One Page</title>
</head>
<body>
	<%
	String name=request.getParameter("uname");
	
	%>
	<%
	if(name!=null){
		%><h2>Hello <%= name+ ", <br>"%> Welcome to JavaServer Page! </h2>
	<% 
	}else{ %>
		<form action="Onepage_Form.jsp" method="post">
			<label>Name : </label>
			<input type="text" name="uname"><br>
			<input type="submit" value="Login">
		</form>
	<% 	
		}
	%>
</body>
</html>