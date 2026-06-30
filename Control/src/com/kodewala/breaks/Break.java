package com.kodewala.breaks;

public class Break
{
	public static void main(String[] args)
	{
		String[] electronicProducts =
		{ "Laptop&", "Smar@tphone", null, "Smartwatch", "Bluetooth $Speaker", "Wireless !Headphones", "Smart TV", null,
				"Power Bank", null };

		// loop the array
		for (int index = 0; index < electronicProducts.length; index++)
		{
			System.out.println(" Executing loop.... " + index + " time");
			String currentProduct = electronicProducts[index];
			if (currentProduct == null)
			{
				System.out.println(" Found null product....");
				continue;
			}
			// code the remove junk char from product
		}
	}
}
