<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h3>Tabs</h3>
  <ul class="nav nav-tabs">
    <%-- <c:forEach var = "i" begin = "1" end = "13">
         <li><a href="#">${list}[0]</a></li>
      </c:forEach>
     --%>
   <li class="active"><a href="#">Home</a></li>
    <li oncl><a href="#">Menu 1</a></li>
    <li><a href="#">Menu 2</a></li>
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    <li><a href="#">Menu 3</a></li> 
    
  </ul>
  <br>
  <p><strong>Note:</strong> This example shows how to create a basic navigation tab. It is not toggleable/dynamic yet (you can't click on the links to display different content)- see the last example in the Bootstrap Tabs and Pills Tutorial to find out how this can be done.</p>
</div>
<!-- *************************************** Testing code for popup  ******************************** -->
<div class="container">
  <h2>Small Modal</h2>
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Small Modal</button>
</div><div>
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
  <select class="country" multiple searchable="Search here..">
  <option value="" disabled selected>Choose your country</option>
  <option value="1" onclick="addAttributes(this.value)">USA</option>
  <option value="2">Germany</option>
  <option value="3">France</option>
  <option value="4">Poland</option>
  <option value="5">Japan</option>
</select>


        </div>
        <div class="modal-footer">
          <button class="btn-save btn btn-primary btn-sm">Save</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
<script>

$("select.country").change(function(){

    var selectedCountry = $(".country option:selected").val();

    alert("You have selected the country - " + selectedCountry);

});
</script>

</html>
