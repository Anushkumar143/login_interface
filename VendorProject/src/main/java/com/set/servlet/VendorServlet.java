package com.set.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.set.db.DBConnection;

/**
 * Servlet implementation class VendorServlet
 */
@WebServlet("/VendorServlet")
public class VendorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("vendorName");
        String email = request.getParameter("vendorEmail");
        String gst = request.getParameter("vendorGst");
        String address = request.getParameter("vendorAddress");

        try {
        	Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO vendors(vendor_name, vendor_email, vendor_gst, vendor_address) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, gst);
            ps.setString(4, address);

            ps.executeUpdate();
            con.close();

            response.getWriter().println("<h2>Vendor Registered Successfully</h2>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}