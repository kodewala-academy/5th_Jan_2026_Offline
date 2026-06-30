package com.infosys;

import java.util.HashMap;
import java.util.Map;

public class SalaryCalculation
{

	public Map<String, Object> calculateSalary(int baseSalary)
	{
		
		
		Map<String, Object> salDetails = new HashMap<String, Object>();

		if (baseSalary < 5000)
		{
			salDetails.put("ErrorCode", "Min Salary should be more than 5000");
		}

		if (baseSalary < 10000)
		{
			salDetails.put("base", baseSalary);
			salDetails.put("bonus", 0);
			salDetails.put("tax", 0);
			salDetails.put("CTC", baseSalary);
		} else
		{
			int bonus = (baseSalary * 20) / 100;
			int tax = (baseSalary * 10) / 100;
			int ctc = baseSalary + bonus - tax;
			salDetails.put("base", baseSalary);
			salDetails.put("bonus", bonus);
			salDetails.put("tax", tax);
			salDetails.put("CTC", ctc);
		}
		return salDetails;
	}

}
