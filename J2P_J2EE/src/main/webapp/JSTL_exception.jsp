<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int num=10;
	
	pageContext.setAttribute("num",num);
	
	%>
	
	<c:catch var="e">
		<c:out value="${num/0}"></c:out>
	</c:catch>
	<c:if test="${e!=null }">
		<c:out value="${e}"></c:out>
	</c:if>
	
</body>
</html>