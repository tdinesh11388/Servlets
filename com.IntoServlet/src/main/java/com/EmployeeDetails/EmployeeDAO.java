package com.EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDAO
{
	public String SaveId(Employee emp)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/it";
			Connection con = DriverManager.getConnection(url,"root","root");
			
			String query="insert into employeedetails values(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getSalary());
			ps.setString(5, emp.getDept());
			
			int res = ps.executeUpdate();
			return res+"no. of lines executed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public Employee getEmployeeId(int id) throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		String url="jdbc:mysql://localhost:3306/it";
		Connection con = DriverManager.getConnection(url,"root","root");
		
		String query="select * from employeedetails where id=?";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		Employee e=new Employee();
		ResultSet res = ps.executeQuery();
		while(res.next())
		{
			e.setId(res.getInt(1));
			e.setName(res.getString(2));
			e.setEmail(res.getString(3));
			e.setSalary(res.getString(4));
			e.setDept(res.getString(4));
		}
		return e;
	}
}
//eid, name, age, companyName, salary