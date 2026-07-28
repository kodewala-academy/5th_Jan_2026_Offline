package com.irctc.booking.kafka.producer.service;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService
{
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void publishMessage(String _topic, String _message)
	{
		System.out.println("KafkaService.publishMessage():::::::::::::::::::START::::::::::::::::::::::");
		
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(_topic, null, _message);

		kafkaTemplate.send(record);
		
		System.out.println("KafkaService.publishMessage():::::::::::::::::::END::::::::::::::::::::::");
	}

}
