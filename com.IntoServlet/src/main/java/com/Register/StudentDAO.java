package com.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.cj.Query;
import com.mysql.cj.jdbc.Driver;

public class StudentDAO
{
	public String RegisterFile (Student student) throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		String url="jdbc:mysql://localhost:3306/it";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url,user,password);
		
		String query="insert into register  values(?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,student.getId());
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		ps.setString(4,student.getId_card_number());
		
		int res = ps.executeUpdate();
		
		con.close();
		return res+"no.of lines execcuted";
		
	}
	public Student getStudentById(int id)
	{
		String query="select * from register where id=?";
		Connection con=getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet resultset = ps.executeQuery();
			
			Student student=new Student();
			
			if(resultset.next())
			{
				student.setId(resultset.getInt(1));
				student.setName(resultset.getString(2));
				student.setEmail(resultset.getString(3));
				student.setId_card_number(resultset.getString(4));
			}
			con.close();
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/registration";
		String user="root";
		String password="root";
		try {
			return DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
