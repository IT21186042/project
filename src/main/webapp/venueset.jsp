<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/venue.css">

</head>
<body>

   
  
   
     
   <div class="container">
  <div class="card">
    <div class="box">
      <div class="content">
        <h2>01</h2>
        <img src="images/venue1.jpg" height="180px" width="220px">
         <c:forEach var="ven" items="${venue}">
     
    
      <c:set var="id" value="${ven.id}"/>
      ${ven.location}
      ${ven.name}
      ${ven.capacity}
      ${ven.status}
      ${ven.place}
      ${ven.description}
      ${ven.owner}
      ${ven.hotline}
      ${ven.email}
      ${ven.website}
      ${ven.incharge}
     
        <h3>Card One</h3>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Labore, totam velit? Iure nemo labore inventore?</p>
        <form method="post" action="Avenue" name="id">
          <button type="submit">Read more</button>
        </form>
         </c:forEach>  
        
       </div>
    </div>
  </div>

</div>
    
  
</body>
</html>