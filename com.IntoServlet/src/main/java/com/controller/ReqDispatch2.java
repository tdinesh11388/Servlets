package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqDis2")
public class ReqDispatch2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
//		PrintWriter out = resp.getWriter();
//		out.println("this is the doPost() method of ReqDispatch2")

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String e = req.getParameter("email");
		
		Object at = (String)req.getAttribute("data");
		
		PrintWriter out = resp.getWriter();
		//resp.setContentType("text/html");
		out.println(id);
		out.println(name.toUpperCase());
		out.println(e.toUpperCase());
		out.println(at);
	}
}
