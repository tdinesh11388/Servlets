package com.IntoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Save extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		System.out.println("hello world");
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		
		res.setContentType("text/html");
		//this method is use to modify the content type 
		//of the response by default 
		//content type of a response is text
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(course);
		
		PrintWriter writer = res.getWriter();
		
		writer.write("<body bgcolor=cyan>");
		writer.println("<h1>"+id+"</h1>");
		writer.println(name);
		writer.println(email);
		writer.println(course);
		writer.write("</body>");
	
	}

	//life cycl
	//req-object request is based in frontend
	//to access the request ffrom the frontend
	//
	//res-is empty
	
}
