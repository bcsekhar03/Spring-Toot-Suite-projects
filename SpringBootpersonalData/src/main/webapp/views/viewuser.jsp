
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body bgcolor="pink">

<h1 style="color:darkorange">User Details</h1>

<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Password</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Country</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="user" items="${user}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.email}</td>
            <td>${user.gender}</td>
            <td>${user.country}</td>
            <td><a href="/delete/${user.id}"><h2 style="color:red">Delete</h2></a></td>
            <td><a href="/edituser/${user.id}"><h2 style="color:green">Edit</h2></a></td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="/req"><h3 style="color:tomato">Add New User</h3></a>
<a href="/"><h3 style="color:indigo">Back to Home</h3></a>
</body>
