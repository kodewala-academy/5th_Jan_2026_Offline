package com.infosys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalaryCalculationTests
{

	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("SalaryCalculationTests.beforeAll()... only once");
	}
	
	@BeforeEach
	public void beforeTest()
	{
		System.out.println("SalaryCalculationTests.beforeTest()........");
	}
	
	@Test
	public void testCalculateSalaryBelow10K()
	{
		SalaryCalculation salaryCalculation = new SalaryCalculation();
		int expectedCTC = 9000;

		Map<String, Object> result = salaryCalculation.calculateSalary(9000);
		int actulaCTC = (int) result.get("CTC");
		assertEquals(expectedCTC, actulaCTC);
	}

	@Test
	public void testCalculateSalaryAbove10K()
	{
		SalaryCalculation salaryCalculation = new SalaryCalculation(); //
		int expectedCTC = 22000;

		Map<String, Object> result = salaryCalculation.calculateSalary(20000);
		int actulaCTC = (int) result.get("CTC");
		assertEquals(expectedCTC, actulaCTC);
	}

	@Test
	public void testCalculateSalaryLessThan5K()
	{
		SalaryCalculation salaryCalculation = new SalaryCalculation();
		String expectedMsg = "Min Salary should be more than 5000";

		Map<String, Object> result = salaryCalculation.calculateSalary(4000);
		String actualMsg = (String) result.get("ErrorCode");
		assertEquals(expectedMsg, actualMsg);
	}

}
