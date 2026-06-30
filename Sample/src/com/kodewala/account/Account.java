// this is single line comment
package com.kodewala.account;
import com.kodewala.invoice.Invoice;
public class Account {

	public static void main(String[] args) {

		Invoice invoice = new  Invoice();
		
		 invoice.payTax(); // i am using public method.
		
		 System.out.println(invoice.companyName);
	}
}
