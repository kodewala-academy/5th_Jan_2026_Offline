package com.kodewala;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Payment;
import com.kodewala.config.SpringConfig;

public class App
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringConfig.class);

		Payment payment1 = (Payment) applicationContext.getBean("payment"); // 1st

		System.out.println(payment1.getPaymentId());

		Payment payment2 = (Payment) applicationContext.getBean("payment"); // 2nd

		System.out.println(payment2.getPaymentId());

		System.out.println(payment1 == payment2); // coz it is singleton bean. default scope is singleton

		payment2.destroy();

		applicationContext.close();
	}
}
