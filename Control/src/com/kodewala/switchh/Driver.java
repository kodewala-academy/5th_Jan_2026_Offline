package com.kodewala.switchh;

public class Driver
{

	public static void main(String[] args)
	{
		Driver driver = new Driver();

		String customerType = "Gold";

		switch (customerType)
		{
		case "Gold":
			driver.sendRewards(customerType);
			break; // exit from switch

		case "Silver":
			driver.sendRewards(customerType);
			break; // exit from switch

		default:
			System.out.println(" Found new customer type "+customerType);
			break;
		}

	}

	public void sendRewards(String type)
	{
		System.out.println(" Sending rewards to " + type + " customer");
	}

}
