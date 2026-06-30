package com.kodewala.jdbc.prep.stmt.txn;

import java.sql.SQLException;

public class Driver
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		DebitAndCredit debitAndCredit = new DebitAndCredit();
		
		debitAndCredit.doFundTransfer();
	}
}
