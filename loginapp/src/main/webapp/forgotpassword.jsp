<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Forgot Password</title>
</head>
<body>
	<p style="color:green">${msg}</p>
    <h2>Forgot Password</h2>
    <form action="forgotpassword" method="post">
        Enter your registered email: 
        <input type="email" name="email" required><br><br>
        
        <input type="submit" value="Reset Password">
        <a href="login.jsp">Back to Login</a>
    </form>
</body>
</html>