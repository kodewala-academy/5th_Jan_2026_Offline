package com.kodewala.strings4;

public class Driver
{

	public static void main(String[] args)
	{

      String str = "I am from Bangalore india";
      
      String arr[] =str.split(" ");
      System.out.println(arr.length);
      int length=0;
      for(String word : arr) // for each // in java 5
      {
    	  System.out.println(word);
    	  length=length+word.length();
      }
      System.out.println(" length is "+ length);
	}

}
