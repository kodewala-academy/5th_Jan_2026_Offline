package com.kodewala.arrays;

public class ArrayExp
{

	public static void main(String[] args)
	{
		// Create an array
		int marks[] = new int[10]; // index 0 to 9
		System.out.println(marks[3]); // 0

		// add an elements
		marks[0] = 120;
		marks[1] = 167;
		marks[2] = 43;
		marks[3] = 54;
		marks[4] = 545;
		marks[5] = 86;

		int studentMarks[] =
		{ 324, 154, 452, 54, 4, 4, -54, -543, 52, -1, 43 };
		// loop an array....
		for (int index = 0; index < marks.length; index++)
		{
			int mark = marks[index];
			System.out.println(" mark " + mark);
		}

	}

}
