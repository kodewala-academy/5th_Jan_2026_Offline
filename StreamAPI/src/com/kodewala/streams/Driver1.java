package com.kodewala.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1
{

	public static void main(String[] args)
	{
		// Storage or input
		List<String> cities = Arrays.asList("Bangalore", "Chennai", "Hyd", "Mumbai", "Delhi", "Bombay", "Bbr");
		System.out.println(" input : " + cities);
		// Task : find the cities starting with 'B' and convert to upper case.

		// convert collection to stream object
		Stream<String> inputStream = cities.stream();
       
		// applying filter(it will reduce the size of input as per filter condition). This is an intermediate operation.
		Stream<String> filteredStream = inputStream.filter(c -> c.startsWith("B"));

		// applying map(it will convert all the elements to upper case).This is an intermediate operation.
		Stream<String> upperCaseStream = filteredStream.map(w -> w.toUpperCase());

		// Collecting result. collect(this is an terminal operation and it will terminate the stream.)
		List<String> output = upperCaseStream.collect(Collectors.toList());

		System.out.println(" output : " + output);
	}

}
