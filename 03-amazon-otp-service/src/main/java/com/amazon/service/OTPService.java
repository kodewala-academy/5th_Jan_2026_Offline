package com.amazon.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.OTPEntity;
import com.amazon.repository.OTPRepository;
import com.amazon.request.OtpResponse;

@Service
public class OTPService
{
	@Autowired
	OTPRepository otpRepository;

	public OtpResponse saveOtp(String mobile, String name)
	{
		OTPEntity entity = new OTPEntity();

		entity.setOtp(generateOtp());
		entity.setStatus("Active");
		entity.setMobile(mobile);
		entity.setName(name);
		
		OTPEntity response = otpRepository.save(entity);
		if (response.getId() > 0)
		{
			System.out.println(" Otp saved successfully......");
		} else
		{
			System.out.println(" Unable to save the otp");
		}
        OtpResponse otpResponse = new OtpResponse();
        
        otpResponse.setOtp(response.getOtp());
        otpResponse.setStatus(response.getStatus());
        otpResponse.setValid("5 mins");
        
		return otpResponse;
	}

	private int generateOtp()
	{
		SecureRandom random = new SecureRandom();
		int otp = 100000 + random.nextInt(900000); // Generates 100000 to 999999
		System.out.println(" Generated OTP :::: " + otp);
		return otp;
	}
}
