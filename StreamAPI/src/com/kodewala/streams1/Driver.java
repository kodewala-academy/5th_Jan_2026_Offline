package com.kodewala.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver
{

	public static void main(String[] args)
	{
		List<List<Integer>> input = Arrays.asList(Arrays.asList(2, 5, 3, 8, 5, 4),
				Arrays.asList(20, 125, 223, 82, 15, 4));

		// need to flatten
		input.parallelStream().flatMap(list -> list.stream()).filter(n -> n % 2 == 0)
				.forEach(value -> System.out.println(value));

		List<String> words = Arrays.asList("i", "am", "from", "bangalore", "bangalore", "is", "in", "karnataka",
				"bangalore");

		// remove duplicates

		words.stream().distinct().forEach(v -> System.out.println(v));

		// find the first element

		Optional<String> output = words.stream().skip(1).findFirst();
		System.out.println("First word is : " + output.get());

		// limit the 5 element

		words.stream().limit(5).forEach(v -> System.err.println(v));

		// Sort
		System.out.println("Driver.main().. sorting");
		words.stream().sorted((a,b) -> b.length() - a.length()).forEach(System.out::println);
	}

}
