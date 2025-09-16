<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
My name:${user.uname}<br>
My mail:${user.email}<br>
My gender:${user.gender}<br>
My course details are<br>

<c:forEach var="course" items="${user.course}">
    <c:out value="${course}"/><br>
</c:forEach>

You have choose below batches:<br>
<c:forEach var="batch" items="${user.batch}">
    <c:out value="${batch}"/><br>
</c:forEach>