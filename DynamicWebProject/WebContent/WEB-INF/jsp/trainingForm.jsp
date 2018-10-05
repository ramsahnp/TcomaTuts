<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Training Form</title>
</head>
<body>
<form:errors path="student.*"/>
<h2>${heading}</h2>

<form action="./submitFormModelAttribute.htm" method="post">
<table>
<tr>
<td>Student's Name:</td><td><input type="text" name="sname"/></td></tr>
<tr><td>Student's DOB:</td><td><input type="text" name="dob"/></td></tr>
<tr><td>Student's Mobile:</td><td><input type="text" name="mobile"/></td></tr>
<tr> <td>Student's Address:</td><td><input type="text" name="address"/></td></tr>
<tr> <td>Address_Sector</td><td><input type="text" name="address_model.sector"/></td></tr>
<tr> <td>Address_House_No</td><td><input type="text" name="address_model.houseNo"/></td></tr>
<tr> <td>Address_city</td><td><input type="text" name="address_model.city"/></td></tr>
</table>
<input type="submit" value="Submit"/>
</form>
</body>
</html>