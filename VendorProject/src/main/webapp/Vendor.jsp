

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vendor Registration Form</title>
</head>
<body>
<h2>Vendor Details</h2>
	<form action="VendorServlet" method="post">
    <table>
        <tr>
            <td>Vendor Name:</td>
            <td><input type="text" name="vendorName" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>Vendor Email:</td>
            <td><input type="email" name="vendorEmail" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>GST Number:</td>
            <td><input type="text" name="vendorGst" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td>Vendor Address:</td>
            <td><input type="text" name="vendorAddress" required></td>
        </tr>

        <tr><td colspan="2"><br></td></tr>

        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form>
	
	
	</body>
	</html>
