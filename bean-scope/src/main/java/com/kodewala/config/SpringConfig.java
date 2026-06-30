package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.kodewala.bean.Payment;

@Configuration
public class SpringConfig
{

	@Bean("payment")
	@Scope("prototype")
	//@Profile("test") // famous interview question 
	public Payment createPayment()
	{
		Payment pay = new Payment();
		pay.setPaymentId("PAYREF1234");
		return pay;
	}
}
