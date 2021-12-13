package com.JDBC.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest 
{
	@Test
	public void executeQueryTest() throws SQLException
	{
		
		Connection con=null;
		try {
			//step-1 Register the Driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			//step-2 connect to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			//step-3 create statement
			Statement stmt = con.createStatement();
			//step-4 Execute Query
			ResultSet result = stmt.executeQuery("select * from students_info");
			while(result.next())
			{
			System.out.println(result.getString(1)+" "+result.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		//step-5 close the connection
		con.close();
		}
	}

}
