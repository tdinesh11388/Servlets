package com.cokkiePack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cook2")
public class Cookie12 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Cookie cookie = new Cookie("gst","18%");
		Cookie cookie2 = new Cookie("price","inINR");
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		resp.sendRedirect("cook3");
		
//		Cookie[] cookies = req.getCookies();
//		
//		String id=null;
//		String name=null;
//		String product=null;
//		String type=null;
//		
//		for(Cookie c:cookies)
//		{
//			if(c.getName().equals("id"))id=c.getValue();
//			if(c.getName().equals("name"))name=c.getValue();
//			if(c.getName().equals("product"))product=c.getValue();
//			if(c.getName().equals("type"))type=c.getValue();
//		}
//		
//		PrintWriter out = resp.getWriter();
//		out.println(id);
//		out.println(name);
//		out.println(product);
//		out.println(type);
	}
}
