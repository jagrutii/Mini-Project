<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<style>
  body {
    background-color: #f8f9fa;
  }

  .card {
    border: none;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    background-color: #ffffff;
  }

  .form-label {
    font-weight: bold;
  }

  .form-control {
    border-radius: 0;
  }

  .form-control:focus {
    box-shadow: none;
  }

  .btn-primary {
    background-color: #007bff;
    border-color: #007bff;
    border-radius: 0;
  }

  .btn-primary:hover {
    background-color: #0069d9;
    border-color: #0062cc;
  }
</style>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center align-items-center" style="min-height: 50vh;">
			<div class="col-md-6 mt-2">
				<div class="card">
				<div class="card-header text-center fs-3">Employee Register</div>
				<% 
				String msg = (String)session.getAttribute("msg");
				if(msg!=null){
				%>
					<p class="text-center fs-4  text-success" > <%=msg %></p>
				<%
				}
				session.removeAttribute("msg");
				%>
					<div class="card-body">
						<form method="post" action="register">
						
							<div class="mb-3">
								<label for="name" class="form-label">Name</label>
								<input type="text" class="form-control" id="name" name="name">
							</div>
							
							<div class="mb-3">
								<label for="department" class="form-label">Department</label>
								<input type="text" class="form-control" id="department" name="department">
							</div>
							
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Salary</label>
								<input type="text" class="form-control" id="salary" name="salary">
							</div>
							
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email address</label>
								<input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control" id="password" name="password">
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input" id="exampleCheck1">
								<label class="form-check-label" for="exampleCheck1">Click here before register</label>
							</div>
							<button type="submit" class="btn btn-primary">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
