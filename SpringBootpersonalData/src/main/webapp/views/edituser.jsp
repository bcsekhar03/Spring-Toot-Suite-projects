
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<body bgcolor="lightgreen">
     
    <h1 style="color:green" align="center">Edit User Data</h1>
    <form:form method="POST" action="/editu">
       <table align="center" cellpadding="2" cellscaping="2px" >
            <tr>
                <td style="color:dark; font-weight:bold;">Id  </td>
                <td><form:hidden path="id"/></td>
            </tr>
            <tr>
                <td style="color:dark; font-weight:bold;">Name</td>
                <td><form:input path="name" cssStyle="color:purple; font-weight:italic;"/></td>
            </tr>
            <tr>
                <td style="color:dark; font-weight:bold;">Email</td>
                <td><form:input path="email" cssStyle="color:purple; font-style:italic;"/></td>
            </tr>
            <tr>
                <td style="color:dark; font-weight:bold;">Password</td>
                <td><form:input path="password" cssStyle="color:purple; font-style:italic;"/></td>
            </tr>
            <tr>
                <td style="color:dark; font-weight:bold;">Gender</td>
                <td><form:input path="gender" cssStyle="color:purple; font-style:italic;"/></td>
            </tr>
            <tr>
                <td style="color:dark; font-weight:bold;">Country</td>
                <td><form:select path="country" cssStyle="color:purple; font-style:italic;">
                <form:option value="">-select country-</form:option>
                <form:option value="India">India</form:option>
                <form:option value="Russia">Russia</form:option>
                <form:option value="Japan">Japan</form:option>
                <form:option value="England">England</form:option>
                <form:option value="Paris">Paris</form:option>
                <form:option value="Dubai">Dubai</form:option>
                </form:select>
                </td>
            </tr>
            <tr>
            <td></td>
            <td><input type="submit" value="Edit User"/></td>
            </tr>
        </table>
    </form:form>
    <a href="/viewuser"><h3 style="color:firebrick" align="center">View All User Details</h3></a><p></p>
    
</body>