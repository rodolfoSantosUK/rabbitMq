package com.course.rabbitmqproducer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HelloRabbitProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendHelloToQueue1(String name) {
		rabbitTemplate.convertAndSend("course.queue1", name);
	}
	
	public void sendHelloToQueue2(String name) {
		rabbitTemplate.convertAndSend("course.queue2", name);
	}
	
}
