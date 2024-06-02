<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	Student s=new Student();
	s.setName("Hla Hla");
	s.setrRollnum(1);
	String name=s.getName();
	int rollno=s.getRollno(); 
	-->
	<jsp:useBean id="s" class="test.Student">
	 <jsp:setProperty property="name" value="Hla Hla" name="s" ></jsp:setProperty>
	 <jsp:setProperty property="rollno" value="2" name="s"></jsp:setProperty>
	 </jsp:useBean>
	 Name:<jsp:getProperty property="name" name="s"></jsp:getProperty>
	 Roll No:<jsp:getProperty property="rollno" name="s"></jsp:getProperty>
</body>
</html>