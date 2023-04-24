package com.cokkiePack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cook3")
public class Cookie13 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie[] cookies = req.getCookies();
		
		String id=null;
		String name=null;
		String product=null;
		String type=null;
		String gst=null;
		String price=null;
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("id"))id=c.getValue();
			if(c.getName().equals("name"))name=c.getValue();
			if(c.getName().equals("product"))product=c.getValue();
			if(c.getName().equals("type"))type=c.getValue();
			if(c.getName().equals("gst"))gst=c.getValue();
			if(c.getName().equals("price"))price=c.getValue();
		}
		
		PrintWriter out = resp.getWriter();
		
		out.println(id);
		out.println(name);
		out.println(product);
		out.println(type);
		out.println(gst);
		out.println(price);
	}
}
