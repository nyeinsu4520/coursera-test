<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">Login Form</h2>
		<form action="Login_Servlet" method="post"> 
		<div class="mb-3">
		<label for="username" class="form-label">Username : </label>
		<input type="text" class="form-control" id="username" name="uname">
		</div>
		<div class="mb-3">
		<label for="password" class="form-label">Password : </label>
		<input type="text" class="form-control" id="password" name="pass">
		</div>
		<div class="text-center">
		<input type="submit" class="form-control" value="Login">
		</div>
		</form>
	</div>
</body>
</html>