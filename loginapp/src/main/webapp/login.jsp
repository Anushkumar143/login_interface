<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body class="popup-auth">
<p style="color:green">${msg}</p>
<h2>Login</h2>
<form action="login" method="post">
    <input type="text" name="username" placeholder="Email"><br></br>
    <input type="password" name="password" placeholder="Password"><br>
    <a href="forgotpassword.jsp">Forgot password?</a><br></br>
    <input type="submit" value="Login">
    <a href="signup.jsp">Create account</a>
</form>
</body>
</html>