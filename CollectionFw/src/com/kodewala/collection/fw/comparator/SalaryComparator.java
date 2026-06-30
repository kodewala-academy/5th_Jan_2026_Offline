package com.kodewala.collection.fw.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
		int result = 0;
		if (o1.getSalary() < o2.getSalary())
		{
			result = -1;
		} else if (o1.getSalary() > o2.getSalary())
		{
			result = 1;
		} else
		{
			result = 0;
		}
		return result;
	}

}
