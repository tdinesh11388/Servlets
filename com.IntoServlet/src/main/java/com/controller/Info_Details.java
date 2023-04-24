package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/info")
public class Info_Details extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String fname = req.getParameter("FirstName");
		String lname = req.getParameter("LastName");
		String email = req.getParameter("eamil");
		
		req.setAttribute("id",id);
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("email", email);
		
		RequestDispatcher rd = req.getRequestDispatcher("info2");
		rd.forward(req, resp);
	}
}
