package payment.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import payment.service.service.PaymentService;

@RestController
public class PaymentController
{
	@Autowired
	PaymentService paymentService;

	@PostMapping("/pay/{amount}")
	public String acceptPayment(@PathVariable("amount") int amount)
	{
		System.out.println("PaymentController.acceptPayment() ::::::::::::::::::::::::::::::::::::::::::::::: ");
		
		String response = paymentService.confirmPayment("REF54321", "PAID", amount);
		return response;
	}
}
