package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/info2")
public class Info_Details2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = (String)req.getAttribute("id");
		String fname =(String) req.getAttribute("fname");
		String lname =(String) req.getAttribute("lname");
		String email =(String) req.getAttribute("email");
		
		PrintWriter out = resp.getWriter();
		out.println(id);
		out.println(fname);
		out.println(lname);
		out.println(email);
	}
}
