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
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	pageContext.setAttribute("rollno",rollno);
	pageContext.setAttribute("name",name);
	pageContext.setAttribute("address",address);

	%>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/university" user="root" password="root"/>
	
	
	<sql:update var="result" dataSource="${db }" sql="update student set address=?,name=? where rollno=?">
	<sql:param value="${address }"></sql:param>
	<sql:param value="${name}"></sql:param>
	<sql:param value="${rollno }"></sql:param>
	</sql:update>
	
	<c:if test="${result>0 }">
		<c:out value="Update Successful!"></c:out>
	</c:if>
</body>
</html>