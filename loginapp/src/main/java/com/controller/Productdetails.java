package com.controller;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import com.dao.Vendordao;
import com.model.Vendormodel;
public class Productdetails extends HttpServlet 
{     
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {    
        String vname = req.getParameter("vname");
        String company = req.getParameter("company");
        String gst = req.getParameter("gst");   
        String pname = req.getParameter("pname");
        String price = req.getParameter("price");
        String category = req.getParameter("category");
        String quantity = req.getParameter("quantity");
        String description = req.getParameter("description");
        
        Vendormodel vm=new Vendormodel(vname,company,gst,pname,price,category,quantity,description);
        Vendordao vd=new Vendordao();
            if (vd.products(vm)) 
            {
            	req.setAttribute("msg","Vendor & Product saved successfully");
            	req.getRequestDispatcher("login.jsp").forward(req,res);
            } 
            else 
            {
            	req.setAttribute("msg","Registration failed");
            	req.getRequestDispatcher("vendorproducts.jsp").forward(req,res);
            }
    }
}