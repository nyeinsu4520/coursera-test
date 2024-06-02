<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String numstr1=request.getParameter("num1");
	String numstr2=request.getParameter("num2");
	String operation=request.getParameter("operation");
	String result="";
	
	if(numstr1!=null && numstr2!=null && operation !=null){
		try{
			double num1=Double.parseDouble(numstr1);
			double num2=Double.parseDouble(numstr2);
			double calresult=0;
			
			if(operation.equals("+")){
				calresult=num1+num2;
				
			}
			else if(operation.equals("-")){
				calresult=num1-num2;
			}
			else if(operation.equals("*")){
				calresult=num1*num2;
			}
			else if(operation.equals("/")){
				if(num2!=0){
				calresult=num1/num2;
				}else{
					result="Cannot divide by zero.";
				}
			
			}
			
			if(result.isEmpty()){
				result=String.valueOf(calresult);
			}
		}catch(NumberFormatException e){
			result="Invalid Input.Please enter valid numbers. ";
		}
		
	}
	
	%>
	
	
	
	<form action="" method="post">
        <label>Enter Number 1: </label>
        <input type="text" name="num1" value="<%= numstr1 != null ? numstr1 : "" %>">
        <br><br>
        <label>Enter Number 2: </label>
        <input type="text" name="num2" value="<%= numstr2 != null ? numstr2 : "" %>">
        <br><br>
        <input type="submit" name="operation" value="+">
        <input type="submit" name="operation" value="-">
        <input type="submit" name="operation" value="*">
        <input type="submit" name="operation" value="/">
        <br><br>
        <label>Result: </label>
        <input type="text" name="result" readonly value="<%= result %>">
    </form>
</body>
</html>