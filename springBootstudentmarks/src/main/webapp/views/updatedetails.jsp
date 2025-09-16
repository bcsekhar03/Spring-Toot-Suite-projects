<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<center><body bgcolor="orange">
<h1>Customer Update Page </h1>

<form:form method="POST" action="/update">
    <table >
    <tr>
        <td>sId</td>
        <td><form:hidden path="sid"/></td>
    </tr>
    <tr>
        <td>Full Name</td>
        <td><form:input path="fullname"/></td>
    </tr>
    <tr>
        <td>sub1</td>
        <td><form:input path="sub1"/></td>

    </tr>
    <tr>
        <td>sub2</td>
        <td><form:input path="sub2"/></td>

    </tr>
    <tr>
        <td>sub3</td>
        <td><form:input path="sub3"/></td>

    </tr>
    <tr>
    <td><input type="submit" value="PrintResult"></td>
</tr>
    </table>
</form:form>

</body></center>
