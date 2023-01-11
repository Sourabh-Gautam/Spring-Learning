<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<body>
 <form:form action="/demoproject/test" modelAttribute="userDto" method="get">
 	Name : <form:input type="text" path = "name" /> 
 	<input type="submit" />
 </form:form>
</body>
</html>
