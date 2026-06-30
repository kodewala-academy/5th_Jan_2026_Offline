package com.kodewala.control.flow;

public class ControlFlowElseIf
{

	public static void main(String[] args)
	{
		int amount = 8000;

		if (amount > 1000 && amount < 2000)
		{
			System.out.println(" 10% Discount");
		} else if (amount >= 2000 && amount < 3000)
		{
			System.out.println(" 15% Discount");
		} else if (amount >= 3000)
		{
			System.out.println(" 20% Discount");
		} else
		{
			System.out.println(" No Discount");
		}

	}

}
