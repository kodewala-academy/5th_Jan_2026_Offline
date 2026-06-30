package com.kodewala.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2
{

	public static void main(String[] args)
	{

		List<List<String>> cities = Arrays.asList(Arrays.asList("Bangalore", "Chennai"),
				Arrays.asList("Delhi", "Hyderabad", "Mumbai"), Arrays.asList("Jaipur"),
				Arrays.asList("Ahemdabad", "surat", "raipur"));

		System.out.println(cities);

		// Task : find the cities whose length is more than 5

		// convert nest to 1D

		Stream<String> flattenedStream = cities.stream().flatMap(list -> list.stream());

		List<String> output = flattenedStream.collect(Collectors.toList());

		// List<String> output = flattenedStream.filter(city -> city.length() >
		// 5).collect(Collectors.toList());

		System.out.println(output);
	}

}
