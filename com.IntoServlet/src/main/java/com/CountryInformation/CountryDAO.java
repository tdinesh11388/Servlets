package com.CountryInformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class CountryDAO 
{
	String url="jdbc:mysql://localhost:3306/it";
	String username="root";
	String password="root";
	public String SaveCountry(Country country)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query="insert into country values(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, country.getName());
			ps.setInt(2, country.getNumberOfStates());
			ps.setString(3, country.getCapital());
			ps.setString(4, country.getPm());
			
			int res = ps.executeUpdate();
			con.close();
			return res+"no.of lines";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String deleteName(String name)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			Connection con = DriverManager.getConnection(url,username,password);
			String query="delete from country where name=?";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			
			int res = ps.executeUpdate();
			return res+"= lines executed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "not deleted";
	}
}
