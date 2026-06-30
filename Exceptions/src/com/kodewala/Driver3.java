package com.kodewala;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver3
{

	public static void main(String[] args)
	{
		Registration reg = new Registration();

		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) // try with resources
		{
			// auto closable
			reg.doRegistration("xyz@gmail.com");
			System.out.println(addNumber());
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		} 
	}

	public static int addNumber()
	{
		try
		{
			return 10;
		} catch (Exception e)
		{
			// TODO: handle exception
		} finally
		{
			return 5;
		}
	}

}
