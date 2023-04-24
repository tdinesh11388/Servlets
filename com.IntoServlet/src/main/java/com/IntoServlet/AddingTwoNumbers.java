package com.IntoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/addition1")
public class AddingTwoNumbers extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		int i =Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("squar");
		
//		req.setAttribute("k",k);
//		RequestDispatcher rd = req.getRequestDispatcher("squar");
//		
//		rd.forward(req, res);
//		
//		int sum=i+j;
//		System.out.println(sum);
//		
//		PrintWriter out = res.getWriter();
//		out.println("sum of two numbers is = "+sum);
		
	}

}
