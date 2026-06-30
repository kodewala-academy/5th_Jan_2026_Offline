package com.kodewala.jdbc.batch;

public class ProductJDBCConstants
{

	public static String INSERT_PRODUCT_QUERY = "insert into products(product_name, price, status) values(?,?,?)";
	public static int BATCH_SIZE=100;
}
