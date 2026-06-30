package com.rapido;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.request.SignUpRequest;

@Controller
public class SignUpController
{

	@PostMapping("signup")
	public String doSignup(@ModelAttribute SignUpRequest request, Model model)
	{
		System.out.println(" first Name : " + request.getFirstName());
		System.out.println(" last Name : " + request.getLastName());
		System.out.println(" email  : " + request.getEmail());
		System.out.println(" mobile : " + request.getMobile());

		String fn = request.getFirstName().substring(0, Math.min(2, request.getFirstName().length())).toUpperCase();
		String ln = request.getLastName().substring(0, Math.min(2, request.getLastName().length())).toUpperCase();
		String em = request.getEmail().substring(0, 2).toUpperCase();
		String mob = request.getMobile().substring(request.getMobile().length() - 4);

		String userId = fn + ln + em + mob;

		// Setting the response data which can be accessed on the page.
		model.addAttribute("user", userId); // key value

		return "signup-success";
	}

}
