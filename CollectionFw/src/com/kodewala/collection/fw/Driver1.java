package com.kodewala.collection.fw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver1
{
	public static void main(String[] args)
	{

		List<String> state = new ArrayList<String>(20);

		state.add("Karnataka");
		state.add("Maharastra");
		state.add("Delhi");
		state.add("TN");
		System.out.println(state);
		

		// for loop
		for (int i = 0; i < state.size(); i++)
		{
			String element = state.get(i);

			if (element.startsWith("K"))
			{
				System.out.println(element.toUpperCase());
			}
		}
		// for each
		for (String element : state)
		{
			System.out.println(element);
		}
		
		// iterator

		Iterator<String> itr =  state.iterator();
		System.out.println(" Using iterator:::::");
		while (itr.hasNext())
		{
			String element = (String) itr.next();
			System.out.println(element);
			
		}
		
	}
}
