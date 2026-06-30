package com.kodewala.collection.fw.set;

import java.util.HashSet;

class Employee1
{
	@Override
	public int hashCode()
	{

		return 1234321;
	}
}

public class Driver1
{

	public static void main(String[] args)
	{
		HashSet<Employee1> hashSet = new HashSet<Employee1>(64); // default 16

		hashSet.add(new Employee1());
		hashSet.add(new Employee1());
		hashSet.add(new Employee1());
		
		Employee1 e4 = new Employee1();
		
		hashSet.add(e4);
		
		Employee1 e5 = new Employee1();
		
		hashSet.add(e5);
		
		Employee1 e6 = new Employee1();
		hashSet.add(e6);

		Employee1 e7 = new Employee1();
		hashSet.add(e7);

		Employee1 e8 = new Employee1();
		hashSet.add(e8);

		Employee1 e9 = new Employee1();
		hashSet.add(e9);


		hashSet.remove(e9);
		hashSet.remove(e8);
		hashSet.remove(e7);
		hashSet.remove(e6);
		hashSet.remove(e5);
		hashSet.remove(e4);
		System.out.println(hashSet);

	}

}
