package com.kodewala.jdbc.batch;

import java.sql.SQLException;

public class Driver
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{

		UploadProducts products = new UploadProducts();
		products.upload();
	}

}
