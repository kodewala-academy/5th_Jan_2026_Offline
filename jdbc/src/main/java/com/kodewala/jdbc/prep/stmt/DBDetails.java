package com.kodewala.jdbc.prep.stmt;

public class DBDetails
{
	public static final String URL = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
	public static final String USER = "root";
	public static final String PWD = "Test@12345";

	public static final String SELETC_QUERY = "select * from orders where id=?";
	public static final String SELETC_QUERY_BY_STATUS = "select * from invoice where status in(? , ?)";
	
	public static final String UPDATE_BALANCE = "update account set balance=? where user_id=?";
	
	public static final String GET_BALANCE ="select balance from account where user_id=?";
}
