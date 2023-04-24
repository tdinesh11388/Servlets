package com.Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterFile extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		int id=Integer.parseInt(req.getParameter("ID"));
		String name=req.getParameter("NAME");
		String email=req.getParameter("EMAIL");
		String id_cardNumber = req.getParameter("ID_CARD");
		
		
		System.out.println("hello");
		res.setContentType("text/html");

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(id_cardNumber);
	
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setId_card_number(id_cardNumber);
		
		StudentDAO dao=new StudentDAO();
		try {
			res.getWriter().write(dao.RegisterFile(student));
			//res.getWriter().write(dao.getStudentById(101));
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter out = res.getWriter();
		
		out.write("<body bgcolor=yellow>");
		out.println("<h1>"+id+"</h1>");
		out.println("<h1>"+"hello"+name+"</h1>");
		out.println("<h2>"+"Thank You for Registration"+"</h2>");
		out.println("<h2>"+"your id is"+id+"</h2>");
		out.println("<h3>"+"please verify your detailes email"+id_cardNumber+"</h3>");
		out.write("</body>");
	}
}
