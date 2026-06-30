package com.kodewala.payment.pojo;

// POJO
public class Payment
{
	private String paymentRefNo;
	private String status;

	public String getPaymentRefNo()
	{
		return paymentRefNo;
	}

	public void setPaymentRefNo(String paymentRefNo)
	{
		this.paymentRefNo = paymentRefNo;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public void printPaymentDetails()
	{
		System.out.println(" ref : " + paymentRefNo + " status " + status);
	}
}
