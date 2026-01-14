package com.controller;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import com.dao.Userdao;
import com.model.Usermodel;

public class Resetpasswordservlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    
        String email = req.getParameter("email");
        String newpassword = req.getParameter("newPassword");
        String confirmpassword = req.getParameter("confirmPassword");
        
        if (!newpassword.equals(confirmpassword)) 
        {
        	req.setAttribute("msg","password do not match");
        	req.getRequestDispatcher("resetpassword.jsp").forward(req, res);
            return;
        }
        Usermodel lm=new Usermodel();
    	lm.setemail(email);
    	lm.setpassword(newpassword);
        Userdao ld=new Userdao();
        if(ld.reset(lm))
        {
        	req.setAttribute("msg","your password is changed");
        	req.getRequestDispatcher("login.jsp").forward(req, res);
        }
        else
        {
        	req.setAttribute("msg","reset falied");
        	req.getRequestDispatcher("resetpassword.jsp").forward(req, res);
        }
    }
}