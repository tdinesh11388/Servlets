package com.cokkiePack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cook")
public class Cookie11 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String product= req.getParameter("pro");
		String type = req.getParameter("type");
		
		Cookie cookie = new Cookie("id",id);
		Cookie cookie1 = new Cookie("name",name);
		Cookie cookie2 = new Cookie("product",product);
		Cookie cookie3 = new Cookie("type",type);
		
		//Cookie c1=new Cookie(gst,"18%")
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		resp.sendRedirect("cook2");
	}
}
