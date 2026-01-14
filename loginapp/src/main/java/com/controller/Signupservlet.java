package com.controller;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.dao.Userdao;
import com.model.Usermodel;

public class Signupservlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        
        Usermodel lm=new Usermodel();
        lm.setfirstname(firstname);
        lm.setlastname(lastname);
        lm.setemail(email);
        lm.setphone(phone);
        lm.setpassword(password);
        Userdao ld=new Userdao();
            if (ld.register(lm)) 
            {
            	req.setAttribute("msg","signup successful");
            	req.getRequestDispatcher("login.jsp").forward(req,res);
            }
            else
            {
                req.setAttribute("msg","signup failed");
                req.getRequestDispatcher("login.jsp").forward(req,res);
            }
    }
}