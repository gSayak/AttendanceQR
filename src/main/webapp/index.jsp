<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="css/style-login.css">
</head>

<body>
	<div>
		<h1>Online Quiz Portal</h1>
		<div>
			<form action="AuthenticationServ" method="post">
				<div>
					<table>
						<tr>
							<td>User name:</td>
							<td><input type="text" name="uname" id="uname"></td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><input type="password" name="pass" id="pass"></td>
						</tr>
						<tr>
							<td><input type="submit" name="login-submit"
								id="login-submit"></td>
						</tr>

						<tr>
							<td><a href="./register/index.jsp"> Register Yourself</a></td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
