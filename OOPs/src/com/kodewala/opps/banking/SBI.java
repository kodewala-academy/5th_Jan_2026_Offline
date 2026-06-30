package com.kodewala.opps.banking;

public class SBI extends CoreBanking
{
    public static void main(String[] args)
	{
		SBI sbi = new SBI();
		sbi.doFundTransfer();
		
		sbi.stopCheque();
		
		// sbi.changePassword(); // it's private in super/parent class
	}
}
