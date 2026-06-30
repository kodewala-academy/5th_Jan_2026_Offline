package com.kodewala;

public class SBIUser {

	String firstName;
	String bankCode;
	String lastName;

	public SBIUser(String _firstName, String _bankCode, String _lastName) 
	{
		System.out.println("SBIUser Constructor START ");
		firstName = _firstName;
		bankCode = _bankCode;
		lastName = _lastName;
		System.out.println("SBIUser Constructor END ");
	}

	public static void main(String[] args) 
	{
		System.out.println("SBIUser.main() START");
		
		SBIUser umang = new SBIUser("Umang", "Bank12345", "Kolhe");
		
		SBIUser deepak = new SBIUser("Deepak", "Bank234", "Kumar");
		System.out.println("SBIUser.main() END");
	}

}
