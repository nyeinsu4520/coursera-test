<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL_Output</title>
</head>
<body>

	<%
	String name="James";
	int age=22;
	int num=0;
	pageContext.setAttribute("name", name);
	pageContext.setAttribute("age",age);
	pageContext.setAttribute("num",num);
	session.setAttribute("name", name);
	session.setAttribute("age",age);
	%>
	<c:out value="Hello JSP Tag Libraries!"></c:out><br>
	<c:out value="${name}"></c:out><br>
	<c:out value="${age}"></c:out><br>
	<a href="JSP_second.jsp" scope=session>Next...</a>
	<c:if test="${age>30}">
	<c:out value="${name} is old."></c:out>
	</c:if>
	<c:if test="${age<30}">
	<c:out value="${name} is young."></c:out>
	</c:if>
	<c:if test="${age==30}">
	<c:out value="${name} is 30."></c:out>
	</c:if>
	<br>
	<c:choose>
		<c:when test="${num>0}">
		<c:out value="Positive Number"></c:out>
		</c:when>
		<c:when test="${num<0 }">
		<c:out value="Negative Number"></c:out>
		</c:when>
		<c:otherwise>
		<c:out value="Zero"></c:out>
		</c:otherwise>
	</c:choose>
	
</body>
</html>