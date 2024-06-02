<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/university" user="root" password="root" />
	<sql:query var="resultset" dataSource="${db }" sql="select * from student">
	<%--<sql:param value="Male"></sql:param>--%>
	</sql:query>
	
	<table border="1">
	<tr>
	<th>Roll No:</th>
	<th>Name:</th>
	<th>NRC No:</th>
	<th>Date of Birth:</th>
	<th>Address:</th>
	<th>Year:</th>
	<th>Gender:</th>
	
	</tr>
	<c:forEach items="${resultset.rowsByIndex }" var="row">
	<tr>
		<c:forEach items="${row }" var="col">
		<%-- 	<c:out value="${col.key }"></c:out>--%>
		<td>
			<c:out value="${col }"></c:out>
		</td>
		</c:forEach>
		<br>
	</tr>
	</c:forEach>
	</table>
</body>
</html>