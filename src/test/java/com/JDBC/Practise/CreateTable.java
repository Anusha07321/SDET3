package com.JDBC.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class CreateTable 
{
	@Test
	public void createTable() throws SQLException
	{
		Connection connection=null;
		try {
			Driver drive=new Driver();
			DriverManager.registerDriver(drive);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet table = statement.executeQuery("create table product(pid Int(10) not null,pname varchar(10),Primary key(pid))");
			System.out.println(table);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		connection.close();
		}
	}

}
