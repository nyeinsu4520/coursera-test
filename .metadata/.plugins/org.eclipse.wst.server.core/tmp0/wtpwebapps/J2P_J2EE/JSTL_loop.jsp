<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String months[]={"January","February","March","April","May"};
	pageContext.setAttribute("months",months);
	
	%>
	<!-- for(int i=1; i<=10;i++)  -->
	<c:forEach begin="1" end="10" step="1" var="i" >
	<c:out value="Number:${i}"></c:out><br>
	</c:forEach>
	
	<c:forEach items="Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday" var="day">
	<c:out value="${day}" ></c:out><br>
	</c:forEach>
	
	<c:forEach items="${months }" var="month">
	<c:out value="${month }"></c:out>
	</c:forEach>
	
	
</body>
</html>