package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAccess extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String e="dn11388@gmail.com";
		String p="Dn@123";
		if(email.equals(e) && password.equals(p))
		{
			//out.println("Welcome user!!!");
			
			RequestDispatcher rd = req.getRequestDispatcher("log2");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("log3");
			rd.forward(req, res);
//			out.print("Invalid username or Password");
//			out.print("Try Again!!");
		}
	}
	
}
