<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentServlet" method="post">
	Name:<input type="text" name="name"><br>
	Roll No:<input type="text" name="rno"><br>
	Password:<input type="password" name="pass"><br>
	Age:<input type="text" name="age" ><br>
	Class:<input type="text" name="class"><br>
	Gender:<input type="radio" name="gender">Male<input type="radio" name="gender">Female
	<input type="submit" value="Register">
	</form>
</body>
</html>