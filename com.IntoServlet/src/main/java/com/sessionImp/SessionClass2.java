package com.sessionImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session2")
public class SessionClass2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		
		String id=(String)session.getAttribute("id");
		session.removeAttribute("id");
		String name=(String)session.getAttribute("name");
		session.removeAttribute("name");
		String email=(String)session.getAttribute("email");
		session.removeAttribute("email");
		
		session.setMaxInactiveInterval(1000);
		
		PrintWriter out = resp.getWriter();
		out.println(id);
		out.println(name);
		out.println(email);
	}
}
