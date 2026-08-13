package payment.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import payment.service.service.PaymentService;

@RestController
public class PaymentController
{

	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	private PaymentService paymentService;

	private final Tracer tracer;

	@Autowired
	public PaymentController(Tracer tracer)
	{
		this.tracer = tracer;
	}

	@PostMapping("/pay/{amount}")
	public String acceptPayment(@PathVariable("amount") int amount)
	{

		log.info("PaymentController.acceptPayment() START");

		Span currentSpan = tracer.currentSpan();

		if (currentSpan != null)
		{

			log.info("PAYMENT TRACE -> Trace ID: {}, Span ID: {}", currentSpan.context().traceId(),
					currentSpan.context().spanId());

		} else
		{

			log.warn("PAYMENT TRACE -> No current span found");

		}

		log.info("Processing payment for amount: {}", amount);

		String response = paymentService.confirmPayment("REF54321", "PAID", amount);

		log.info("PaymentController.acceptPayment() END");

		return response;
	}
}