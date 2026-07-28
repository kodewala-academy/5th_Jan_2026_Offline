package com.irctc.notification.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService
{

	@KafkaListener(topics = "booking-confirmed", groupId = "CG1")
	public void consume(ConsumerRecord<String, String> record)
	{
		System.out.println("KafkaConsumerService.consume()......");
		String message = record.value();
		System.out.println(" Message received :::: " + message);
		
	}

}
