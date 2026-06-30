package com.kodewala.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver3
{

	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

		// find the min/mx

		long output = list.stream().max((a, b) -> a - b).get();

		// System.out.println(output);

		long output1 = list.stream().collect(Collectors.counting());
		// System.out.println("toral elements are : " + output1);

		List<String> list1 = Arrays.asList("Delhi", "Hyderabad", "Mumbai", "Bangalore", "Mysore", "Bombay", "Chennai",
				"Bengaluru", "tumkuru", "noida", "ggn");

		Map<Boolean, List<String>> map = list1.stream().collect(Collectors.partitioningBy(w -> w.startsWith("B")));

		Map<Integer, List<String>> groupMap =  list1.stream().collect(Collectors.groupingBy(w -> w.length()));
		
		System.out.println(groupMap);

	}

}
