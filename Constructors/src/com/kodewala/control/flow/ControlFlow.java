package com.kodewala.control.flow;

public class ControlFlow {

	public static void main(String[] args) {

		int minAge = 18;
		int age = Integer.parseInt(args[0]);

		if (age >= minAge) // true
		{
			System.out.println(" You can apply for voting card!!");
		}
		else // if, if() is false then else will execute
		{
			System.out.println(" You can not apply for voting card. Your age is below 18.");
		}

	}

}
