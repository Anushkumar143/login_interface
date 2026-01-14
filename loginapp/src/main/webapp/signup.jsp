<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link rel="stylesheet" href="css/style.css">

</head>
<body>
    <h2>Sign Up</h2>
    <form action="signup" method="post">
        <input type="text" name="firstname"><br><br>
        <input type="text" name="lastname"><br><br>
        <input type="email" name="email"><br><br>
        <input type="text" name="phone"><br><br>
        <input type="password" name="password"><br><br>
        <input type="submit" value="Sign Up">
        <a href="login.jsp">Login</a>
    </form>
</body>
</html>