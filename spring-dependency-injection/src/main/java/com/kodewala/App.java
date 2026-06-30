package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Employee1;
import com.kodewala.beans.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	  ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	 Employee1 employee =  (Employee1) context.getBean(Employee1.class);
    	 
    	 System.out.println(employee);
    	
    }
}
