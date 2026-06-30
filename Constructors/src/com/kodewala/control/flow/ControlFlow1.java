package com.kodewala.control.flow;

import java.util.Scanner;

public class ControlFlow1
{
	public static void main(String[] args)
	{
		int luckyNumber = 8;
		int userEntered = 0;

		Scanner sc = new Scanner(System.in);// creating connection with console so 
		                                    // that user can enter input
		System.out.println(" Please enter the number...");

		while (userEntered != luckyNumber)
		{
			userEntered = sc.nextInt();
			if (userEntered != luckyNumber)
			{
				System.out.println(" try again");
			}
		}
		System.out.println(" You won!!!!");
		sc.close();
        // .........
		
		do {
			System.out.println("ControlFlow1.main()");
		}
		while(false);
		
		
	}
}
