package com.JDBC.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DataEntryDatabase 
{
	@Test
	public void dataEntryDatabase() throws SQLException
	{
		Driver drive=new Driver();
		DriverManager.registerDriver(drive);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
		Statement statement = connection.createStatement();
		int value = statement.executeUpdate("insert into employee(empid,empname) values('123','Anu')");
		if(value==1)
		{
			System.out.println("row inserted");
		}
		else
		{
			System.out.println("row not inserted");
		}
		connection.close();
	}

}
