package com.kodewala.opps.poly5;

class Registration
{
	// V1
	public void doRegister(int otp, String mobile) // 2 params , int , string
	{
		System.out.println("Registration.doRegister(int otp, String mobile)");
	}

	// V2
	public void doRegister(String pan, String passport) // 2 param , String, string
	{
		System.out.println("Registration.doRegister(String pan, String passport)");
	}

	// V3
	public void doRegister(String mobile, String aadhar, int otp) // 3 param srtring, string and int
	{
		System.out.println("Registration.doRegister(String mobile, String aadhar, int otp)");
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		Registration reg = new Registration();
		reg.doRegister(1234, "987654321"); // which method to call, decided at the time of compilation
		reg.doRegister("999999999", "45245345", 452); // 3rd 
	}

}
