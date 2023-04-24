package com.cokkiePack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/coc")
public class CookiesC1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		Cookie cookie = new Cookie("id",id);
		Cookie cookie1 = new Cookie("name",name);
		Cookie cookie2 = new Cookie("age",age);
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		
		resp.sendRedirect("coc1");
		
		
	}
}
