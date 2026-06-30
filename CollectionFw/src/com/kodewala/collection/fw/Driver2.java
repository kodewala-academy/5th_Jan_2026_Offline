package com.kodewala.collection.fw;

import java.util.Iterator;
import java.util.LinkedList;

public class Driver2
{

	public static void main(String[] args)
	{
		// Created container
		LinkedList<String> cityList = new LinkedList<String>();

		// Storing data
		cityList.add("BLR");
		cityList.add("Chennai");
		cityList.add("HYD");
		cityList.add("DEL");
		cityList.add("KOL");

		// Processing data( Replaced by Stream API)
		
		Iterator<String> itr = cityList.iterator();
		while (itr.hasNext())
		{
			String element = itr.next();
			if (element.startsWith("B"))
			{
				System.out.println(" YES, Bangalore is party of the city list");
			}
		}

	}

}
