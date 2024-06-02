<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Current Date:
	<%=new java.util.Date() %>
	<br>
	Random Number:
	<%=Math.random() %><br>
	Host Name:
	<%=request.getRemoteHost() %><br>
	Parameter:
	<%=request.getParameter("name") %><br>
	Server Info:
	<%=application.getServerInfo() %><br>
	Session ID:
	<%=session.getId() %><br>
	
	
</body>

</html>