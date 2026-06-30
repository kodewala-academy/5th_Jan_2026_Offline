package com.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{

		// Loading the JDBC driver - Optional
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create Connection Object
		String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
		String username = "root";
		String password = "Test@12345";

		Connection con = DriverManager.getConnection(url, username, password);

		// Create statement object

		Statement stmt = con.createStatement();
 
		String selectQuery = "select * from orders";
		String updateQuery = " update orders set status='delivered' where id=2";
		//ResultSet rs = stmt.executeQuery(selectQuery); // fetch the data from the table

		int recordUpdated = stmt.executeUpdate(updateQuery); // int --? 1 record updated
		
		System.out.println("Total record updated.... " + recordUpdated);
		
		/*
		 * while (rs.next()) { int id = rs.getInt(1); String name = rs.getString(2); int
		 * price = rs.getInt(3); String status = rs.getString(4);
		 * 
		 * System.out.println(" id " + id + " " + name + " " + price + " " + status); }
		 */
	}
}
