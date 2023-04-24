package com.CountryInformation;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DeleteName extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		
		CountryDAO dao=new CountryDAO();
		
		res.getWriter().write(dao.deleteName(name));
	}
	
}
