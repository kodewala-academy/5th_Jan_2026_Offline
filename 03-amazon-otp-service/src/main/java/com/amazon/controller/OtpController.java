package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.request.OtpRequest;
import com.amazon.request.OtpResponse;
import com.amazon.service.OTPService;
import com.amazon.test.Test;

@RestController // Controller + ResponseBody
@RequestMapping("otp")
public class OtpController
{
	@Autowired
	OTPService otpService;
    
	@Autowired
	Test test;
	
	@PostMapping("/generate")
	public OtpResponse generateOtp(@RequestBody OtpRequest otpRequest)
	{
		test.print();
		String name = otpRequest.getName();
		String mobile = otpRequest.getMobile();
		OtpResponse otpResponse = otpService.saveOtp(mobile, name);
		return otpResponse;
	}

}
