package com.EmployeeDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/empd")
public class EmployeeConFtoS extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String salary = req.getParameter("salary");
		String dept = req.getParameter("department");
		
		res.setContentType("text/html");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(salary);
		System.out.println(dept);
		
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setEmail(email);
		emp.setSalary(salary);
		emp.setDept(dept);
		
		//PrintWriter writer = res.getWriter();
		
		EmployeeDAO dao=new EmployeeDAO();
		res.getWriter().write(dao.SaveId(emp));
		
		
//		writer.println(id);
//		writer.println(name);
//		writer.println(email);
//		writer.println(salary);
//		writer.println(dept);
	}

}
