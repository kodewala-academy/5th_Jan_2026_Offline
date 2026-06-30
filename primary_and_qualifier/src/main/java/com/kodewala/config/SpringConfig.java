package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.kodewala")
public class SpringConfig
{

	@Bean("emp1")
	@Primary
	public Employee createEmp1()
	{
		Employee e = new Employee("Kodewala1", "Academy1", "Engineering");
		return e;
	}

	@Bean("emp2")
	public Employee createEmp2()
	{
		Employee e = new Employee("Kodewala2", "Academy2", "Engineering");
		return e;
	}

}
