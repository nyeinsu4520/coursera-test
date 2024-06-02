<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${name} is ${param.age } years old."></c:out><br>
	<c:out value="${param.address}"> </c:out><br>
	<c:out value="${param.email}"> </c:out><br>
	
	<c:redirect url="JSTL_third.jsp">
		<c:param name="name" value="${param.name }"></c:param>
	</c:redirect>
</body>
</html>