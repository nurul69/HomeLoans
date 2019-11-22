<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<body>
  <form:form id="regForm" modelAttribute="user" action="registrationProcess" method="POST">

    <table align="center">
      <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" name="email" id="email" /></td>
      </tr>
      
      <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:password path="password" name="password" id="password" /></td>
        <td><form:errors path="password" /></td>
      </tr>
      
       <tr>
        <td><form:label path="cpassword">Confirm Password</form:label></td>
        <td><form:password path="cpassword" name="cpassword" id="cpassword" /></td>
        <td><form:errors path="cpassword" /></td>
      </tr>
      
      <tr>
        <td></td>
        <td><form:button id="register" name="register">Register</form:button></td>
      </tr>
      
    </table>
  </form:form>

</body>
</html>