<html>
<head><title>Registration Success Page</title></head>
<body>
<h1>${heading}</h1>
<h2>Congratulation ! Registration Success !</h2>
<h3>Details:</h3>
<table>
<tr><td>Student's Name:</td><td>${student.sname}</td></tr>
<tr><td>Student's DOB:</td><td>${student.dob}</td></tr>
<tr><td>Student's Mobile:</td><td>${student.mobile}</td></tr>
<tr><td>Student's Address:</td><td>${student.address}</td></tr>
<tr><td>Student's Address_Sector</td><td>${student.address_model.sector}</td></tr>
<tr><td>Student's Address_HouseNo</td><td>${student.address_model.houseNo}</td></tr>
<tr><td>Student's Address_City</td><td>${student.address_model.city}</td></tr>
</table>

</body>


</html>