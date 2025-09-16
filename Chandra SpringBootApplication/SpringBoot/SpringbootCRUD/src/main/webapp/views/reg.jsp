<h1 style="color:green">Add New User</h1>
<form action="/register" method="POST">
Id:<input type="text" name="id"><p></p>
Name:<input type="text" name="name"><p></p>
Password:<input type="text" name="password"><p></p>
Email:<input type="text" name="email"><p></p>
Gender:<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female<p></p>
Country:<select name="country">
<option value="India">India</option>
<option value="USA">USA</option>
<option value="Canada">Canada</option>
<option value="Australia">Australia</option>
</select><p></p>
<input type="submit" value="Add User">
</form>