package com.kodewala.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kodewala.jdbc.prep.stmt.DBDetails;

public class UploadProducts
{

	public void upload() throws ClassNotFoundException, SQLException
	{

		// register jdbc driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create connection Object

		Connection connection = DriverManager.getConnection(DBDetails.URL, DBDetails.USER, DBDetails.PWD);

		PreparedStatement pstmt = connection.prepareStatement(ProductJDBCConstants.INSERT_PRODUCT_QUERY);

		long start = System.currentTimeMillis();
		for (int index = 0; index < 10000; index++)
		{
			pstmt.setString(1, "iPhone" + index);
			pstmt.setInt(2, 120000 + index);
			pstmt.setString(3, "Available");
			System.out.println("UploadProducts.upload().. executing " + index + " times");
			pstmt.addBatch();
			
			if(index % ProductJDBCConstants.BATCH_SIZE ==0)
			{
				System.out.println(" Executing Batch of 1000 products....");
				pstmt.executeBatch();
			}
		}
        // executing remaining 
		pstmt.executeBatch();
		
		long end = System.currentTimeMillis();

		System.out.println(" Total time taken " + (end - start + " ms"));
	}

}
