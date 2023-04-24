package com.Register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetStudentById extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		StudentDAO dao = new StudentDAO();
		Student studentById = dao.getStudentById(id);
		PrintWriter writer = res.getWriter();
		writer.println(studentById);
	}

	
//	NAME<input type="text" name="NAME"><br><br>
//	EMAIL<input type="text" name="EMAIL"><br><br>
//	ID_CARD<input type="text" name="ID_CARD"><br><br>
}
