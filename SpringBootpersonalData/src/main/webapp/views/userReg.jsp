
<h1 style="color:brown">ADD NEW USER</h1>
<form action="/register" method="post">
ID : <input type="text" name="id"><p></p>
Name :<input type="text" name="name"><p></p>
Password :<input type="password" name="password"><p></p>
Email :<input type="text" name="email"><p></p>
Gender :<input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Female">Female<p></p>
Country :<select name="country">
          <option value="India">India</option>
          <OPTIOn value="Russia">Russia</OPTIOn>
          <OPTIOn value="Japan">Japan</OPTIOn>
          <OPTIOn value="England">England</OPTIOn>
          <OPTIOn value="Paris">Paris</OPTIOn>
          <OPTIOn value="Dubai">Dubai</OPTIOn>
          </select><p></p>
        <input type="submit" value="ADD USER">          
</form>

<a href="/"><h3 style="color:green">Go to Home<h3/></a>