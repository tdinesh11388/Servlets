package com.cokkiePack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/coc1")
public class CookiesC2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie[] cookies = req.getCookies();
		String id=null;
		String name=null;
		String age=null;
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("id"))id=c.getValue();
			else if(c.getName().equals("name"))name=c.getValue();
			else if(c.getName().equals("age"))age=c.getValue();
		}
		
		PrintWriter out = resp.getWriter();
		out.println(id);
		out.println(name);
		out.println(age);
	}
}
