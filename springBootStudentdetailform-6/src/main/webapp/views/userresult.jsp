<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

My name : ${user.name}<br>
My mail : ${user.mail}<br>
My dob : ${user.dob}<br>
My gender : ${user.gender}<br>
My mbl : ${user.mbl}<br>
My quali : ${user.qualification}<br>

My course details are :
<c:forEach var="course" items="${user.course}">
    <c:out value="${course}"/><br>
</c:forEach>

You have choosen below batch :
<C:forEach var="time" items="${user.time}">
    <c:out value="${time}"/><br>
</C:forEach>

My address : ${user.addr},${user.city},${user.state},${user.country}<br>
My city : ${(user.city)}<br>
My state : ${user.state}<br>
My country : ${user.country}

