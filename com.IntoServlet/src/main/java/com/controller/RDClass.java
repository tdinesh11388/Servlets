package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqDespatch")
public class RDClass extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		String name = req.getParameter("name");
	
		req.setAttribute("n", name.toUpperCase());
		
		RequestDispatcher rd = req.getRequestDispatcher("rd1");
		rd.forward(req, resp);
	}
}
