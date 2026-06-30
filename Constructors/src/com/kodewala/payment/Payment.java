package com.kodewala.payment;

class PaymentManager extends Object {

	public PaymentManager() {
		super();
	}
}

public class Payment extends PaymentManager {

	private String paymentDesc;
	private int amount;
	private String gateway;

	Payment(String _paymentDesc, int _amount, String _gateway) {
		this(_paymentDesc, _amount, _gateway, "PC-1"); // this(Payment class's) no arg constructor

	}

	public Payment(String _paymentDesc, int _amount, String _gateway, String code) {
		super(); // call super class(PaymentManager's) no arg constructor
	}

	public static void main(String[] args) {

		Payment pay1 = new Payment("internet bill", 1270, "HDFC"); // call to Payment(String, int, String)
		System.out.println(pay1.amount + " " + pay1.gateway + " " + pay1.paymentDesc);

		pay1.hashCode();

		Payment pay2 = new Payment("food bill", 234, "razorpay");
		System.out.println(pay2.amount + " " + pay2.gateway + " " + pay2.paymentDesc);
	}
}
