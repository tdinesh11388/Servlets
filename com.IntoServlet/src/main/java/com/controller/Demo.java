package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/action")
public class Demo extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		PrintWriter out = res.getWriter();
		out.println(name);
		out.println(age);
	}
	
}
