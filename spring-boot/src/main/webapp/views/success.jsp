<!DOCTYPE html>
<html>
<head>
<title>Success</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <header style="height: 30px;background-color: #03a9f4;"></header>
   
  <div class="container"> 
 <img style="height: 220px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHtlxGb48hhh98FxbjJAY6-aFQsDjAvlPyTw&usqp=CAU" class="img-thumbnail" alt="Cinque Terre">
 <img style="height: 220px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHtlxGb48hhh98FxbjJAY6-aFQsDjAvlPyTw&usqp=CAU" class="img-thumbnail" alt="Cinque Terre">
 <img style="height: 220px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHtlxGb48hhh98FxbjJAY6-aFQsDjAvlPyTw&usqp=CAU" class="img-thumbnail" alt="Cinque Terre">
 <hr/>
 <!-- This is scriptlet tag -->
 <%
       String str="Nagendra";
       str  = "Mr. "+str +" welcome!!!";  
 %>
  
  <table class="table table-bordered">
    <thead>
      <tr style="background-color: #f0f70c;">
       <th>SNO</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Gender</th>
      </tr>
    </thead>
    <tbody>
    
    <%
     for(int x=0;x<5;x++) {
    	 %>
      <tr>
        <td><%= x+1%></td>
        <td><b>${mota.username} ->>> <%= str%></b></td>
        <td>${mota.email}</td>
        <td>${mota.mobile}</td>
     	<td>${mota.gender} </td>
      </tr>
    <%  } %>
     
    </tbody>
  </table>
  
 <hr/>
    <%
     for(int x=0;x<22;x++) {
    	 %>
   <img style="height: 60px;" src="images/student.jpg" class="img-thumbnail" alt="Cinque Terre">
   <% } %>
</div>
</body>
</html>