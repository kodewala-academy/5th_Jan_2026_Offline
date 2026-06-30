package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderDetailsController
{

	@GetMapping("/details/{orderId}/{value}")
	@ResponseBody
	public String getDetails(@PathVariable("orderId") String orderId, @PathVariable("value") String value)
	{
		System.out.println(" Order id " + orderId);
		System.out.println(" Value " + value);
		return " You order id and details are :::: " + orderId;
	}

}
