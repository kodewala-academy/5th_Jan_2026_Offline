package com.kodewala.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.payment.pojo.Payment;

// Source of all the bean definition 
@Configuration // <beans> ..... </beans>
public class SpringConfig
{
	@Bean("pay1") // define the bean --> <bean> </bean>
	public Payment createPayment1()
	{
		Payment payment = new Payment();
		payment.setPaymentRefNo("REF4235");
		payment.setStatus("PAID");
		return payment;
	}

	@Bean("pay2") // define the bean --> <bean> </bean>
	public Payment createPayment2()
	{
		Payment payment = new Payment();
		payment.setPaymentRefNo("REF087089789");
		payment.setStatus("HOLD");
		return payment;
	}
}
