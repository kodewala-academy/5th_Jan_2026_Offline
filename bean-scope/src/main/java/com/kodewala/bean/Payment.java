package com.kodewala.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Payment
{

	private String paymentId;

	public Payment()
	{
		System.out.println("1. Bean Instantiated");
	}

	public String getPaymentId()
	{
		return paymentId;
	}

	public void setPaymentId(String paymentId)
	{
		this.paymentId = paymentId;
		System.out.println("2. Dependency Injected");
	}

	@PostConstruct
	public void init()
	{
		System.out.println("3. Bean Initialized");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("4. Bean Destroyed");
	}
}
