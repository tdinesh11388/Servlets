package com.cokkiePack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/coo")
public class Cookie1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		Cookie cookie = new Cookie("id", id);
		Cookie cookie2 = new Cookie("name",name);
		Cookie cookie3 = new Cookie("emial",email);
		
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		resp.sendRedirect("coo1");
	}
}
