<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<div class="container">
		<h2>Registration Page</h2>
		<hr/>
		<form action="/register" method="post">
		
		<div class="form-group">
			<label>Name</label>
			<input class="form-control" name="name"/>
		</div> 
		
		<div class="form-group">
			<label>Username</label>
			<input class="form-control" name="username"/>
		</div> 
		
		<div class="form-group">
			<label>Password</label>
			<input type="password" class="form-control" name="password"/>
		</div> 
		
		<div class="form-group">
			<label>Email</label>
			<input type="email" class="form-control" name="email"/>
		</div> 
		
		<div class="form-group">
			<label>Gender</label>
			<input type="text" class="form-control" name="gender"/>
		</div> 
		<div class="form-group">
			<label>Role</label>
			<select class="form-control" multiple="multiple" name="urole">
				<option value="">--Select Your Role--</option>
				<option value="ADMIN">ADMIN</option>
				<!-- <option value="STUDENT">STUDENT</option> -->
				<option value="EMPLOYEE">EMPLOYEE</option>
			</select>
		</div> 
			<button class="btn btn-primary">Signup</button>
			<a href="/login" class="btn btn-success m-3">Signin</a>
		</form>
		<h5>${message}</h5>
		
	</div>
</body>
</html>