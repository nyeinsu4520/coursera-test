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
	String nrcno=request.getParameter("nrcno");
	String dob=request.getParameter("dob");
	String address=request.getParameter("address");
	String year=request.getParameter("year");
	String gender=request.getParameter("gender");
	
	pageContext.setAttribute("rollno",rollno);
	pageContext.setAttribute("name",name);
	pageContext.setAttribute("nrcno",nrcno);
	pageContext.setAttribute("dob",dob);
	pageContext.setAttribute("address",address);
	pageContext.setAttribute("year",year);
	pageContext.setAttribute("gender",gender);
	
	%>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/university" user="root" password="root"/>
	
	<sql:update var="result" dataSource="${db }" sql="insert into student(rollno,name,nrcno,dateofbirth,address,year,gender) values (?,?,?,?,?,?,?)">
	<sql:param value="${rollno }"></sql:param>
	<sql:param value="${name }"></sql:param>
	<sql:param value="${nrcno }"></sql:param>
	<sql:param value="${dob }"></sql:param>
	<sql:param value="${address }"></sql:param>
	<sql:param value="${year }"></sql:param>
	<sql:param value="${gander }"></sql:param>	
	</sql:update>
	
	<c:if test="${result>0 }">
	<c:out value="Insert Successful!"></c:out>
	</c:if>
</body>
</html>