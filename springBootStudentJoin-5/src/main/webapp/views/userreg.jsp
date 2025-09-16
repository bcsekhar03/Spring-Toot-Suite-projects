<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="post" modelAttribute="user" action="/register">
    Enter your Name:<form:input path="uname"/><p></p>
    Enter your mail:<form:input path="email"/><p></p>
    Gender:<form:radiobuttons path="gender" items="${genders}"/><p></p>
    password:<form:password path="password"/><p></p>
    confirm password:<form:password path="confirmpassword"/><p></p>
    please select your course:<form:select path="course" multiple="true"><p></p>
    <form:option value="" label="please select"/>
    <form:options items="${courses}"/>
    </form:select><p></p>
    Choose your batch:<form:checkboxes path="batch" items="${batches}"/><p></p>
    <input type="submit" value="Register">
</form:form>