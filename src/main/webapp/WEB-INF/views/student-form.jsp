
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
	<title>Hello-world input form</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />
</head>
<body>
	<form:form method="GET" action="processForm" modelAttribute="student">
    	 <table>
         <tr>
           <td><form:label path="firstName">First Name</form:label></td>
           <td><form:input path="firstName"/></td>
         </tr>
         <tr>
           <td><form:label path="lastName">Last Name</form:label></td>
           <td><form:input path="lastName"/></td>
          </tr>
          <tr>
           <td><input type="submit" value="Submit"/></td>
          </tr>
         </table>
     </form:form>
</body>
</html>