package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.beans.Employee;

@Component
public class EmployeeService
{
    @Autowired
    @Qualifier("emp2")
	private Employee employee;
	
	public void displayEmpDetails()
	{
		System.out.println("EmployeeService.displayEmpDetails()");
		employee.display();
	}
	
}
