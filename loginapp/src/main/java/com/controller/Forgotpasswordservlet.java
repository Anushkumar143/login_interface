package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import com.dao.Userdao;
import com.model.Usermodel;
public class Forgotpasswordservlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        try 
        {
        	String email=req.getParameter("email");
        	Usermodel lm=new Usermodel();
        	lm.setemail(email);
            Userdao ld=new Userdao();
            if(ld.forgot(lm) != null)
            {
            	res.sendRedirect("resetpassword.jsp"); 
            }
            else 
            {
                req.setAttribute("msg","Email not found");
                req.getRequestDispatcher("forgotpassword.jsp").forward(req,res);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
