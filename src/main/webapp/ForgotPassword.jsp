<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Set Up Your Account</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">


<!-- Font Awesome -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
  rel="stylesheet"
/>
<!-- Google Fonts -->
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<!-- MDB -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.css"
  rel="stylesheet"
/>
</head>
<body>

	<div class="main">

		<!-- Sign up f.orm -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Forgot Password?..</h2>
					
					      <div class="forgot">
					
					<p>Change your password in three easy steps. This will help you
						to secure your password!</p>
	                   <ol class="list-group list-group-light list-group-numbered">
  <li class="list-group-item border-0">Enter
							your email address below.</li>
  <li class="list-group-item border-0">Our
							system will send you an OTP to your email</li>
  <li class="list-group-item border-0">Enter the OTP on the 
						next page</li>
</ol>
				</div>
						
						<form class="card mt-4" action="forgotPassword" method="POST">
					<div class="card-body">
						<div class="form-group">
						<br><input value="Enter your email address"
								class="form-control" type="text" name="email" id="email-for-pass" required=""><small
								class="form-text text-muted">Enter the registered email address . Then we'll
								email a OTP to this address.</small>
						</div>
					</div>
					<div class="card-footer">
						<button class="btn btn-success" type="submit">Get New
							Password</button>
						
					</div>
				</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/forgortPassword.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">Back to login</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>


</body>
</html>

