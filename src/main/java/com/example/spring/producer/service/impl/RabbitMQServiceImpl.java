package com.example.spring.producer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.producer.amqp.AmqpProducer;
import com.example.spring.producer.dto.Message;
import com.example.spring.producer.service.AmqpService;

@Service
public class RabbitMQServiceImpl implements AmqpService {
	
	@Autowired
	private AmqpProducer<Message> amqp;

	@Override
	public void sendToConsumer(Message message) {
		amqp.producer(message);
	}
	
}
