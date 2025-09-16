<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>User Info</title>
<style>.errors{color:red;}
table{border-collapse:collapse;}
td{padding:5px}
</style>
</head>
<body>
<h3>User Registration Form</h3>

<form:form action="register" modelAttribute="user" method="POST">

    <table>
    <tr><td>User Name : </td>
    <td><form:input path="name"/><form:errors path="name" CssClass="errors"/></td>
    </tr>
<tr><td>Password : </td>
    <td><form:password path="pwd"/><form:errors path="pwd" CssClass="errors"/></td>
</tr>
<tr><td>Email : </td>
    <td><form:input path="email"/><form:errors path="email" CssClass="errors"/></td>
</tr>
<tr><td>Mobile Number : </td>
    <td><form:input path="mobileNo"/><form:errors path="mobileNo" CssClass="errors"/></td>
</tr>
<tr><td>Age : </td>
    <td><form:input path="age"/><form:errors path="age" CssClass="errors"/></td>
</tr>
<tr><td></td>
    <td><input type="submit" value="Register"></td>
</tr>
</table>
</form:form>
</body>
</html>
