package com.kodewala.inf.marker1;

public class Copy
{

	// 
	public void copyDcoument(Object o)
	{
		if (o instanceof Copyable) // instanceof 
		{
			System.out.println(" Allow to copy!!!");
		} else
		{
			// throw CopyNotSupportedException
			System.err.println(" CopyNotSupportedException.....................");
		}
	}
}
