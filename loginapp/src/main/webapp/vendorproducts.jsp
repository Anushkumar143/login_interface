<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<p style="color:green">${name}</p>
	<p style="color:green">${email}</p>
	<p style="color:green">${phone}</p>
    <h2>Vendor Registration</h2>
    <form action="vendorproducts" method="post">  <!-- Changed action -->
        <!-- Vendor Details -->
        <h3>Vendor Details:</h3>
        Name: <input type="text" name="vname" required><br><br>
        Company: <input type="text" name="company"><br><br>
        GST: <input type="text" name="gst"><br><br>
        
        <h3>Product Details:</h3>
        Product Name: <input type="text" name="pname" required><br><br>
        Price: <input type="number" name="price" required><br><br>
        Category: <input type="text" name="category"><br><br>
        Quantity: <input type="number" name="quantity"><br><br>
        Description: <textarea name="description"></textarea><br><br>
        
        <input type="submit" value="submit Products">
        <a href="login.jsp">Login</a>
    </form>
</body>
</html>