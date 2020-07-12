package com.course.rabbitmqconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitConsumer {

	@RabbitListener(queues="course.queue1")
	public void listenQueue1(String message) {
		System.out.println("Consuming " + message);
	}
	
	@RabbitListener(queues="course.queue2")
	public void listenQueue2(String message) {
		System.out.println("Consuming " + message);
	}
	
}
