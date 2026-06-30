package com.kodewala.jdbc.prep.stmt;

import java.sql.SQLException;

public class Driver
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		JDBCPrepStmt jdbcPrepStmt = new JDBCPrepStmt();
		jdbcPrepStmt.doJDBCOperation();

	}

}
