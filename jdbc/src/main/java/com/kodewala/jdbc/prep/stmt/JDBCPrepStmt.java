package com.kodewala.jdbc.prep.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPrepStmt
{

	public void doJDBCOperation() throws ClassNotFoundException, SQLException
	{
		// register jdbc driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create connection Object

		Connection connection = DriverManager.getConnection(DBDetails.URL, DBDetails.USER, DBDetails.PWD);

		PreparedStatement pstmt = connection.prepareStatement(DBDetails.SELETC_QUERY_BY_STATUS);

		pstmt.setString(1, "active");
		pstmt.setString(2, "in-progress");

		ResultSet rs = pstmt.executeQuery();

		while (rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			String status = rs.getString(4);

			System.out.println(" id " + id + " " + name + " " + price + " " + status);
		}

	}
}
