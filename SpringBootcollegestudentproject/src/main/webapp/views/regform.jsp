<center>
    <h1>Welcome To Student Register page</h1>
    <body bgcolor="skyblue">
        <script>
            var Id=document.getElementById(sid).value;
            var name=document.getElementById(name).value;
            var email=document.getElementById(email).value;
            var course=document.getElementById(course).value;
            var year=document.getElementById(year).value;
            
            if(id==""||name==""||email==""||course==""||year=="")
        {
            alert("All Feilds Are Required");
        }
        </script>
    <form action="/form" method="post">
    Student Id:<input type="number" name="sid"><p></p>
    Student Name:<input type="text" name="name"><p></p>
    Student Email:<input type="email" name="email"><p></p>
    Course:<input type="text" name="course"><p></p>
    Year:<input type="number" name="year"><p></p>
    <input type="submit" value="Register"><p></p>
    </form>
        
    </body>
    <a href="/reg">Register Form</a>
    <a href="/viewrelt">View Customers</a></center>
    