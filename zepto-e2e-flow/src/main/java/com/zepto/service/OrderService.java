package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.repository.OrderRepository;
import com.zepto.request.OrderRequest;

// all the business req will be implemented...

@Service
public class OrderService
{
	@Autowired
	OrderRepository orderRepository;

	public String createOrder(OrderRequest orderRequest)
	{
		System.out.println("OrderService.createOrder() START");

		System.out.println("OrderService Item : " + orderRequest.getItemName());
		System.out.println("OrderService Qty : " + orderRequest.getQty());
		System.out.println("OrderService Price : " + orderRequest.getPrice());

		OrderEntity entity = new OrderEntity();
		
		entity.setItemName(orderRequest.getItemName());
		entity.setQty(orderRequest.getQty());
		entity.setPrice(orderRequest.getPrice());
		
		orderRepository.save(entity); // this will create an record in orders table (ORM)
		
		System.out.println("OrderService.createOrder() END");
		
		return "ORD12345";
	}
}
