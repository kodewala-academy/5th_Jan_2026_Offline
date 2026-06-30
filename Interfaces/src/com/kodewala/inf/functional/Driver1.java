package com.kodewala.inf.functional;

interface ICalc

{
	public abstract int doCalculation(int a, int b);

}

public class Driver1
{

	public static void main(String[] args)
	{
		// support + - * /
		calculate(20, 12, (i, j) -> i + j); // caller will decide 
		calculate(20, 12, (i, j) -> i - j);
		calculate(20, 12, (i, j) -> i * j);
	}

	public static void calculate(int x, int y, ICalc calc)
	{
		System.out.println(calc.doCalculation(x, y));
	}

}
