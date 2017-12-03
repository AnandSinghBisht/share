<html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
            <%-- <form:form id="regForm" modelAttribute="employee" action="updateEmp">
 <form:input path="emp_name" name="emp_name" id="username" />
   <form:input path="emp_salary" name="emp_salary" id="username2" />
   <form:button id="register" name="register">Register</form:button>
</form:form> --%>
 <form action="/updateEmp">
	<input type="text" name="emp_id" >
		<input type="text"  name="emp_name">
			<input type="text"  name="emp_salary">
			<input type="submit" value="submit"> 

</form>
</body>
</html>