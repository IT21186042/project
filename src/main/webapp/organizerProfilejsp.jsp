<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>

<link rel="stylesheet" href="css/organizerprofile.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container rounded bg-white mt-5 mb-5">
  
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span class="font-weight-bold">Edogaru</span><span class="text-black-50">edogaru@mail.com.my</span><span> </span></div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                
               
                    <h4 class="text-right">Organizer Profile</h4>
                </div>
                   <form  method="POST"  action="organizerServlet">
                <div class="row mt-3">
                
                 <c:forEach var="org" items="${organizer}">
                     
                    <div class="col-md-12"><label class="labels">Name</label><input type="text" class="form-control" placeholder="Fuck" value="" name="Name"></div>  
                    <div class="col-md-12"><label class="labels">Mobile Number</label><input type="text" class="form-control" placeholder="${org.organizerID}" value="" name="mobile"></div>
                    <div class="col-md-12"><label class="labels">Address</label><input type="text" class="form-control" placeholder="" value="" name="address"></div>
                    <div class="col-md-12"><label class="labels">Email</label><input type="text" class="form-control" placeholder="" value="" name="email"></div>
                    
                </div>
             
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="button">Save Profile</button></div><br>
                 <div class="mt-6 text-center"><button class="Delete-button"  type="button">Delete Profile</button></div>
                 
                </c:forEach> 
           </form>
</div>
            
        </div>
          </div>
    </div>



</body>
</html>