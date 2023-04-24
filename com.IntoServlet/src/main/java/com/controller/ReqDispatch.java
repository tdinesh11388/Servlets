package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqDis")
public class ReqDispatch extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher rd = req.getRequestDispatcher("reqDis2");
		
		PrintWriter out = res.getWriter();
		req.setAttribute("data", "qwerty");
		//out.println("qwerty");
		rd.forward(req, res);
		
		
	}
}
