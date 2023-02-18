<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>

<style>
.container {
	width: 25%;
	border: 1px solid black;
	margin: auto;
	padding: 20px;
	font-size: 20px;
}

#myform table tr td input {
	font-size: 15px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Online Quiz Portal</h1>
		<h2>Register Here</h2>
		<form id="myform" action="../RegisterServ" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="user-name"
						placeholder="Enter Here" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="number" name="user-age" placeholder="00" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="user-email"
						placeholder="Enter Here" /></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="text" name="user-phone"
						placeholder="Enter Here" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="user-password"
						placeholder="Enter Here" /></td>
				</tr>
				<tr>
					<td>Re-Enter Password</td>
					<td><input type="password" name="user-password"
						placeholder="Enter Here" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="user-gender" value="male" />Male
						&nbsp; &nbsp; <input type="radio" name="user-gender"
						value="female" /> Female</td>
				</tr>
				<tr>
					<td style="text-align: right"><input type="checkbox"
						value="checked" name="condition" /></td>
					<td>Agree with <a href="../termsAndCondtition/terms.jsp">terms
							& conditions</a>
					</td>
				</tr>
				<tr>
					<td></td>

					<td>
						<button type="submit">Register</button>
						<button type="reset">Reset</button>
					</td>

				</tr>
				<tr>
					<td>Already have an account?</td>
					<td><a href="../index.jsp">Log In</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>