package com.example.spring.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.producer.dto.Message;
import com.example.spring.producer.service.AmqpService;

@RestController
@RequestMapping("api/messages/send")
public class AmqpApi {
	
	private AmqpService service;
	
	public AmqpApi(AmqpService service) {
		super();
		this.service = service;
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping
	public void sendToConsumer(@RequestBody Message message) {
		service.sendToConsumer(message);
	}
	
}
