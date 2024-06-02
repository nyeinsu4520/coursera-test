<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculation Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>



</head>
<body>

	<form action="calculation_result.jsp" method="post">
	<table class="table table-primary table-striped text-center">
  
  	<thead>
  		<th colspan=2 >Calculation Form</th>
  	</thead>
  	<tbody>
  	<tr >
  		<td>Enter username: </td>
  		<td><input type="text" name="uname" ></td>
  	</tr>
  	<tr>
  		<td>Enter Number 1: </td>
  		<td><input type="text" name="num1"></td>
  	</tr>
  	<tr>
  		<td>Enter Number 2: </td>
  		<td><input type="text" name="num2"></td>
  	</tr>
  	</tbody>
	</table>
	<div class="text-center">
	<input class="bg-primary text-white p-2 border-0 rounded" name="operation" type="submit" value="Add">
	<input class="bg-primary text-white p-2 border-0 rounded" name="operation" type="submit" value="Sub">
	<input class="bg-primary text-white p-2 border-0 rounded" name="operation" type="submit" value="Mul">
	<input class="bg-primary text-white p-2 border-0 rounded" name="operation" type="submit" value="Div">
	
	</div>
	</form>
</body>
</html>