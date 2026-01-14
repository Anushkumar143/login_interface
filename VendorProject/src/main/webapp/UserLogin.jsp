

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2>User Login</h2>
<form action="LoginController" method="post">

    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>
                <input type="submit" value="Login">
            </td>
            <td>
                <button type="button" onclick="location.href='UserRegister.jsp'">
                    New Register
                </button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
    
