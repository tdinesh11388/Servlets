package com.sessionImp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session1")
public class SessionClass1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		List<Integer>list=new ArrayList<>();
		
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(12);
		HttpSession session = req.getSession();
		
		session.setAttribute("list", list);
		
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		
		resp.sendRedirect("display.jsp");
	}
}
