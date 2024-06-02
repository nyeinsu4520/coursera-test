<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
	int num1=30;
	int num2=12;
	public int add(){
		return num1+num2;
	}
	public int sub(){
		return num1-num2;
	}
	%>
	Addition:
	<%=add() %><br>
	Subtration:
	<%=sub() %><br>
</body>
</html>