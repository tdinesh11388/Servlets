package com.IntoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqNumber extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		//int k = (int)req.getAttribute("k");
		
		int k=0;
		Cookie[] cookies = req.getCookies();
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println(k*k);
	}
}
