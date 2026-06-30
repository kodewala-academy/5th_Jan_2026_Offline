package com.kodewala.exception2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader
{

	public static void main(String[] args)
	{
		FileReader fileReader = new FileReader();
		fileReader.readFile();

	}

	public void readFile()
	{
		String fileName = "C:\\Users\\Suresh\\OneDrive\\Desktop\\Academy\\workspaces\\5th_Jan_2026_Offline\\Exceptions\\src\\com\\kodewala\\exception2\\sales_data.txt";
		try
		{
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName)); // FileNotFoundException

			String line;

			while ((line = br.readLine()) != null)
			{

				String lineArr[] = line.split(",");
				String city = lineArr[3];
				if (city.equals("Bangalore"))
				{
					System.out.println(line);
				}

			}

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
