<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="link" value="JSTL_next.jsp">
	<c:param name="name" value="James"></c:param>
	<c:param name="age" value="22"></c:param>
	<c:param name="address" value="Yangon"></c:param>
	<c:param name="email" value="james@gmail.com"></c:param>
	</c:url>
	
	<a href="${link }">Go...</a>
</body>
</html>