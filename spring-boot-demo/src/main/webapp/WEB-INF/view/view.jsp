<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <b>The  Object Names Are:-
            <br>

            <table>
                <c:forEach items="${employee}" var="employee">
                    <tr>
                    
                    <td>${employee.emp_id}</td>
                    <td>${employee.emp_name}</td>
                        <td>${employee.emp_salary}</td>
                        
                        	
                    </tr>
                </c:forEach> 

            </table>
    </body>
</html>