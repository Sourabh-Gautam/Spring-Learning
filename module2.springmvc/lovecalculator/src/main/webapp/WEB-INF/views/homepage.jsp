<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<div align='center'>
	<h1>Love calculator</h1>
	<form:form action="/lovecalculator/processhomepage" modelAttribute="userDto">
		<div>
			<label for='yourname'>Your name : </label>
			<form:input path='yourName' id='yourname' />
			<form:errors path='yourName' />
		</div>
		<div>
			<label for='crushname'>Crush name : </label>
			<form:input path='crushName' id='crushname' />
			<form:errors path='crushName' />
		</div>
		<div>
			<input type='submit' value='calculate' />
		</div>
	</form:form>
	</div>
</body>
</html>