<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<body bgcolor="pink">
<h1>View Page </h1>
<table border="2" width="100%" cellpadding="15">
<tr>
    <th>sid</th>
    <th>Name</th>
    <th>Email</th>
    <th>Course</th>
    <th>Year</th>    
    <th>Edit</th>
    <th>Delete</th>
</tr>
<c:forEach var="stud" items="${stds}">
<tr>
    <td>${stud.sid}</td>
    <td>${stud.name}</td>
    <td>${stu.email}</td>
    <td>${stud.course}</td>
    <td>${stud.year}</td>    

    <td><a href="/edit/${stud.sid}">Edit</a></td>
    <td><a href="/delete/${stud.sid}">Delete</a></td>
        
</tr>
</c:forEach>
<a href="/reg">Register Form</a>
<a href="/views">View students</a>
</table>
</body>
