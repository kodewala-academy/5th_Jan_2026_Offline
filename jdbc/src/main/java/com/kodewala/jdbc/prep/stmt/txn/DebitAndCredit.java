package com.kodewala.jdbc.prep.stmt.txn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kodewala.jdbc.prep.stmt.DBDetails;

public class DebitAndCredit
{
	private static final Logger LOGGER = LogManager.getLogger(DebitAndCredit.class);

	public void doFundTransfer() throws ClassNotFoundException, SQLException
	{

		// System.out.println("DebitAndCredit.doFundTransfer() START");

		LOGGER.trace("doFundTransfer() START");

		// CREDIT
		Connection connection = DriverManager.getConnection(DBDetails.URL, DBDetails.USER, DBDetails.PWD);
		try
		{
			int amounttoBeTransferred = 1000;
			// register jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			PreparedStatement ps0 = connection.prepareStatement(DBDetails.GET_BALANCE);
			ps0.setInt(1, 12345);
			ResultSet rs0 = ps0.executeQuery();
			int senderBalance = 0;
			while (rs0.next())
			{
				LOGGER.debug("inside loop");
				senderBalance = rs0.getInt(1);
			}
			LOGGER.info(" Sender current balance is " + senderBalance);

			// START the TXN
			connection.setAutoCommit(false);

			PreparedStatement ps1 = connection.prepareStatement(DBDetails.UPDATE_BALANCE);
			senderBalance = senderBalance - amounttoBeTransferred;
			ps1.setInt(1, senderBalance);
			ps1.setInt(2, 12345);
			int recordUpdated = ps1.executeUpdate();
			LOGGER.info(" Record update... " + recordUpdated);
			PreparedStatement ps3 = connection.prepareStatement(DBDetails.GET_BALANCE);
			ps3.setInt(1, 67890);
			ResultSet rs1 = ps3.executeQuery();
			int recBalance = 0;
			while (rs1.next())
			{
				LOGGER.debug(" inside loop");
				recBalance = rs1.getInt(1);
			}
			LOGGER.info(" Receiver current balance is " + recBalance);
			PreparedStatement ps4 = connection.prepareStatement(DBDetails.UPDATE_BALANCE);
			recBalance = recBalance + amounttoBeTransferred;
			ps1.setInt(1, recBalance);
			ps1.setInt(3, 67890);
			recordUpdated = ps1.executeUpdate();
			LOGGER.info(" Record update... " + recordUpdated);

			connection.commit(); // Commit now as all update went though

		} catch (Exception e)
		{

			connection.rollback();
			e.printStackTrace();
			LOGGER.error(" doing rollback....",e);
		}

		LOGGER.trace("doFundTransfer() END");
	}

}
