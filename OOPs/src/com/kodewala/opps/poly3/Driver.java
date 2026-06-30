package com.kodewala.opps.poly3;

public class Driver
{
	public static void main(String[] args)
	{
      InstanceProvider ip = new InstanceProvider();
       Object obj =    ip.getObject();
       Bank p1 = (Bank)obj; // 
       p1.doTask();
	}
}
