package com.EmployeeDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeGet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		int id = Integer.parseInt(req.getParameter("id"));
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		EmployeeDAO dao=new EmployeeDAO();
		try {
			out.println(dao.getEmployeeId(id));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
