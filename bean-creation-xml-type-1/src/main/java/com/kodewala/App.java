package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.bean.Account;

public class App
{
	public static void main(String[] args)
	{
		String bean_def_file = "beans.xml";
		
		// Creating IOC container - we are providing beans.xml(how beans to be created)
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(bean_def_file);// 10k

		// request the bean

		Account account = (Account) iocContainer.getBean("acc"); // 10k

		// using the account bean
		account.printSomething();


	}
}
