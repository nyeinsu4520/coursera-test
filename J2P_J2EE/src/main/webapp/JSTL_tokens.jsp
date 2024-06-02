<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forTokens items="Monday,Thursday@Wednesday!Thursday*Friday.Saturday,Sunday" delims=",@!*. " var="day">
		<c:out value="${day}"></c:out><br>
	</c:forTokens>
	<c:set var="name" value="Jame"></c:set>
	<c:out value="<h1>${name}</h1>" escapeXml="false"></c:out><br>
	<c:set var="age" value="30"></c:set>
	<%-- <c:remove var="age"/> --%>
	<c:out value="<h3>${name } is ${age } years old.</h3>" escapeXml="false"></c:out>

</body>
</html>