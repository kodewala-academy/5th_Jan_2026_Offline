package com.kodewala.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver
{
	public static void main(String[] args)
	{
		List<String> cityList = new ArrayList<String>();
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Hyderabad");
		cityList.add("Delhi");

		// Task - Convert all the cities to upper case using Stream API.

		// 1 - Convert the collection in stream.

		Stream<String> stream = cityList.stream();

		// 2 - Perform operation(convert the string/elements to upperc ase)

		Stream<String> convertedStream = cityList.stream().map(word -> word.toUpperCase());
		
		// 3 Collect the data 

		List<String> output = convertedStream.collect(Collectors.toList());

		System.out.println(" output : " + output);
	}
}
