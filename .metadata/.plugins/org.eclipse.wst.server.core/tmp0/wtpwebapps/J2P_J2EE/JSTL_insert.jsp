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
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/university" user="root" password="root"/>
	
	<sql:update dataSource="${db }" var="result" sql="insert into student(rollno,name,nrcno,dateofbirth,address,year,gender) values (?,?,?,?,?,?,?)">
	<sql:param value="6"></sql:param>
	<sql:param value="David"></sql:param>
	<sql:param value="12/thakana(N)001234"></sql:param>
	<sql:param value="02/08/2000"></sql:param>
	<sql:param value="Yangon"></sql:param>
	<sql:param value="Third Year"></sql:param>
	<sql:param value="Male"></sql:param>
	</sql:update>

	<c:if test="${result>0}">
		<c:out value="Insert Successful!"></c:out>
	</c:if>

</body>
</html>