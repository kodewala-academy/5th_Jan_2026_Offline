package com.kodewala.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController
{

	@GetMapping("test")
	public String login()
	{
		System.out.println("SampleRestController.login()::::::::::::::::::::::::::::::::::::::::;");
		return "login success";
	}

}
