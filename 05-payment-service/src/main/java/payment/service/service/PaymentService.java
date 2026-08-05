package payment.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import payment.service.entity.PaymentEntity;
import payment.service.repository.PaymentRepository;

@Service
public class PaymentService
{

	@Autowired
	PaymentRepository paymentRepository;

	public String confirmPayment(String refId, String status, int amount)
	{
		System.out.println("PaymentService.confirmPayment() ::::::::::::::::::::::::::::::::::::::::::");
		
		PaymentEntity entity = new PaymentEntity();
		entity.setRefNo(refId);
		entity.setStatus(status);
		entity.setAmount(amount);
		PaymentEntity response = paymentRepository.save(entity);
		if (response.getId() > 0)
		{
			return "SUCCESS";
		} else
		{
			return "FAILED";
		}

	}
}
