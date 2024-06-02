<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	int rollno=Integer.parseInt(request.getParameter("rno"));
	pageContext.setAttribute("rollno",rollno);
	%>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/university" user="root" password="root"/>
	
	<sql:query var="resultset" dataSource="${db }" sql="select * from student where rollno=? ">
	<sql:param value="${rollno }"></sql:param>
	</sql:query>
	
	<c:forEach items="${resultset.rowsByIndex }" var="row">
		<c:forEach items="${row }" var="col">
			<c:out value="${col }"></c:out>
		</c:forEach>
	</c:forEach>
	
</body>
</html>