package com.kodewala.collection.fw.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver
{

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();

		set.add("KA");
		set.add("MH");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) // true or false
		{
			String element = (String) itr.next(); // get an element

			System.out.println(element);

		}

		// Key and Value
		Map<String, String> map = new HashMap<String, String>();
		map.put("GJ", "Gandhinagar");
		map.put("KA", "Bangalore");
		map.put("Haryan", "CG");
		map.put("MH", "Mumbai");
		map.put("TS", "Hyderabad");
		map.put("KA", "Bangaluru"); //

		Set<Entry<String, String>> entrySet = map.entrySet();

		Iterator<Entry<String, String>> itr1 = entrySet.iterator();

		while (itr1.hasNext())
		{
			Entry<String, String> entry = itr1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(" Key : " + key + " , Value : " + value);
		}
	}

}
