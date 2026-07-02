package com.amazon.request;

public class OtpResponse
{
   private int otp;
   private String status;
   private String valid ;
   public int getOtp()
   {
	return otp;
   }
   public void setOtp(int otp)
   {
	this.otp = otp;
   }
   public String getStatus()
   {
	return status;
   }
   public void setStatus(String status)
   {
	this.status = status;
   }
   public String getValid()
   {
	return valid;
   }
   public void setValid(String valid)
   {
	this.valid = valid;
   }
   
   
}
