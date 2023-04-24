package com.CountryInformation;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.module.ModuleDescriptor.Requires;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CountryServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		int noS = Integer.parseInt(req.getParameter("NumberOfStates"));
		String captial = req.getParameter("Captial");
		String pm = req.getParameter("pm");
		
		res.setContentType("text/html");
		
		
		Country c=new Country();
		c.setName(name);
		c.setNumberOfStates(noS);
		c.setCapital(captial);
		c.setPm(pm);
		
		CountryDAO dao=new CountryDAO();
		
		res.getWriter().write(dao.SaveCountry(c));
//		out.println(name);
//		out.println(noS);
//		out.println(captial);
//		out.println(pm);
	}

}
