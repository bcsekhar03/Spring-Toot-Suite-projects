<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<body bgcolor="pink">
<h1>View Page </h1>
<table border="2" width="100%" cellpadding="15">
<tr>
    <th>sid</th>
    <th>fullname</th>
    <th>sub1</th>
    <th>sub2</th>
    <th>sub3</th>    
    <th>total</th>
    <th>percentage</th>
    <th>grade</th>
    <th>Delete</th>
    <th>Update</th>
</tr>
<c:forEach var="stud" items="${stds}">
<tr>
    <td>${stud.sid}</td>
    <td>${stud.fullname}</td>
    <td>${stud.sub1}</td>
    <td>${stud.sub2}</td>
    <td>${stud.sub3}</td>
    <td>${stud.total}</td>
    <td>${stud.percentage}</td>
    <td>${stud.grade}</td>
    <td><a href="/delete/${stud.sid}">Delete</a></td>
        <td><a href="/edit/${stud.sid}">Edit</a></td>
</tr>
</c:forEach>
<a href="/reg">Register Form</a>
<a href="/viewrelt">View Customers</a>
</table>
</body>
