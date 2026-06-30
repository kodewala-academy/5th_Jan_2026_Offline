package com.rapido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController
{

	@GetMapping("/doLogin")
	public String login()
	{
		System.out.println("LoginController.login()::::::::::::::::::::::::::::::::::::::::::::::::");
		return "login-page"; // Review Resolver --> /WEB-INF/views/login-page.jsp
	}
	
	
	
}
