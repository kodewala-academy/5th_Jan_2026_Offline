package com.kodewala.payment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.payment.config.SpringConfig;
import com.kodewala.payment.pojo.Payment;
import com.kodewala.payment.test.AppConfig;
import com.kodewala.payment.test.Employee;

public class App 
{
    public static void main( String[] args )
    {
       
    	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
			/*
			 * Payment payment = (Payment) context.getBean("pay1");
			 * 
			 * payment.printPaymentDetails();
			 */
    	    
    	    Employee emp = context.getBean(Employee.class);
            emp.display();
    }
}
