package com.kodewala.collection.fw.cme;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("KA", "BLR"); // Write T2
		map.put("TN", "CHE"); // Write T2
		map.put("KA", "BENGALURU"); // Write T2
		
		Map<String, String> syncMap = Collections.synchronizedMap(map);
		
		Set entries = map.entrySet();
		Iterator itr = entries.iterator();
		while (itr.hasNext())
		{
			Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()); // Reading - T1

		}
		
		

	}

}
