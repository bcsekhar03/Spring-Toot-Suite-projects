<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="post" modelAttribute="user" action="/register">

    Enter your Name:<form:input path="name"/><p></p>
    Enter your mail:<form:input path="mail"/><p></p>    
    password:<form:password path="password"/><p></p>

    Date of birth:<form:input path="dob"/><p></p>    
    Gender:<form:radiobuttons path="gender" items="${gender}"/><p></p>
    Mobile Number:<form:input path="mbl"/><p></p>    
    Qualification:<form:checkboxes path="qualification" items="${qualification}"/><p></p>
    please select your course:<form:select path="course"><p></p>
    <form:option value=""  label="please select"/>
    <form:options items="${course}"/>
    </form:select><p></p>
    Timing:<form:checkboxes path="time" items="${time}"/><p></p>
    Address:<form:input path="addr"/><p></p>
    City:<form:select path="city" items="${city}">
    <form:option value="" label="please select"/>
    <form:options items="${city}"/>
    </form:select><p></p>
    state:<form:select path="state"><p></p>
    <form:option value="" label="please select"/>
    <form:options items="${state}"/>
    </form:select><p></p>
    Country:<form:select path="country"><p></p>
    <form:option value="" label="please select"/>
    <form:options items="${country}"/>
    </form:select><p></p>
    <input type="submit" value="Register">
</form:form>