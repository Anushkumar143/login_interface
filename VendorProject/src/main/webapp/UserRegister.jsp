<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2>User Register</h2>

<form action="UserRegisterServlet" method="post">
    <table>
        <tr>
            <td>Create Username:</td>
            <td><input type="text" name="username" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>Create Password:</td>
            <td><input type="password" name="password" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td colspan="2" align="center">
                <!-- FIX HERE -->
                <button type="submit">Register</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
