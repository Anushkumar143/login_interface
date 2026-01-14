package com.controller;
import java.io.*;
import com.dao.*;
import com.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Loginservlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        String email= req.getParameter("username");
        String password = req.getParameter("password");
        Usermodel lm=new Usermodel();
        lm.setemail(email);
        lm.setpassword(password);
        Userdao ld=new Userdao();
        Usermodel user=ld.valid(lm);
        if(user!=null)
        {
        	req.setAttribute("name","welcome "+user.getfirstname());
        	req.setAttribute("email","your email id is "+user.getemail());
        	req.setAttribute("phone","you phone number is "+user.getphone());
        	req.getRequestDispatcher("vendorproducts.jsp").forward(req,res);
        }
        else
        {
        	req.setAttribute("msg","invalid credantials");
        	req.getRequestDispatcher("login.jsp").forward(req,res);
        }
        
    }
}