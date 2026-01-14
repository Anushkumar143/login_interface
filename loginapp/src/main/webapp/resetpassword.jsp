<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<p style="color:green">${msg}</p>
    <h2>Reset Password</h2>
    <form action="resetpassword" method="post">
        Email: <input type="text" name="email"><br><br>
        New Password: <input type="password" name="newPassword"><br><br>
        Confirm: <input type="password" name="confirmPassword"><br><br>
        <input type="submit" value="Reset">
        <a href="login.jsp">Cancel</a>
    </form>
</body>
</html>