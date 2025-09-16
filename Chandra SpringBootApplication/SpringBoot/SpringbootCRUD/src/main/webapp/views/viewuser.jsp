<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>User Details</h1>  
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
   <c:forEach var="user" items="${users}">   
   <tr>  
   <td>${user.id}</td>  
   <td>${user.name}</td> 
   <td>${user.password}</td>   
   <td>${user.email}</td>  
   <td>${user.gender}</td> 
   <td>${user.country}</td> 
   <td><a href="/delete/${user.id}">Delete</a></td>
   <td><a href="/edit/${user.id}">Edit</a></td>
    </tr>  
   </c:forEach>  
   </table>  
  
   </body>