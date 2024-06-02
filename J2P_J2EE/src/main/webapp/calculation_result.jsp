<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>


</head>
<body>
		
	
	<%
	String name=request.getParameter("uname");
	String numstr1=request.getParameter("num1");
	String numstr2=request.getParameter("num2");
	String operation=request.getParameter("operation");
	String result="";
	
	if(numstr1!=null && numstr2!=null && operation !=null){
		try{
			double num1=Double.parseDouble(numstr1);
			double num2=Double.parseDouble(numstr2);
			double calresult=0;
			
			if(operation.equals("Add")){
				calresult=num1+num2;
				
			}
			else if(operation.equals("Sub")){
				calresult=num1-num2;
			}
			else if(operation.equals("Mul")){
				calresult=num1*num2;
			}
			else if(operation.equals("Div")){
				if(num2!=0){
				calresult=num1/num2;
				}else{
					result="Cannot divide by zero.";
				}
			
			}
			
			if(result.isEmpty()){
				result="Good Morning "+name+"! The Result is " + String.valueOf(calresult);
			}
		}catch(NumberFormatException e){
			result="Invalid Input.Please enter valid numbers. ";
		}
		
	}
	
	%>
	
	<% if (!result.isEmpty()) { %>
	<div class="container m-5 bg-light">
	<p><%=result %></p>
	</div>
	<% } %>
	
		
		
		
</body>
</html>