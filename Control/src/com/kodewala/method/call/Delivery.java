package com.kodewala.method.call;

public class Delivery
{
	String agentName;

	Delivery(String _agentName)
	{
		this.agentName = _agentName;
	}

	public String getCurrentStatus(String orderId)
	{
		String status = "On The Way and your delivery partner is " + agentName;
		return status;
	}

}
