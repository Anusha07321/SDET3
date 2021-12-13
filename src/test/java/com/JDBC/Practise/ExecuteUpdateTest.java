package com.JDBC.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest 
{
	@Test
	public void executeUpdate() throws SQLException
	{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		Statement stmt = con.createStatement();
		int value = stmt.executeUpdate("insert into students_info(regno,firstname,middlename,lastname) values('5','deepthi','k','j')");
		if(value==1)
		{
			System.out.println("successfully updated 1 row");
		}
		else
		{
			System.out.println("failed to update");
		}
	}

}
