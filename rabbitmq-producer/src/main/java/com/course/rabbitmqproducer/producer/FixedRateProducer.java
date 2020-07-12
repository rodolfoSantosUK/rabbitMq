package com.course.rabbitmqproducer.producer;

import org.slf4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
 

@Service
public class FixedRateProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	private Logger log = org.slf4j.LoggerFactory.getLogger(FixedRateProducer.class);
	
	private int i = 0;
	
	@Scheduled(fixedRate = 500)
	public void sendMessage() {
		i++;
		log.info("i  is " + i);
		rabbitTemplate.convertAndSend("course.fixedrate", "fixed rate " + i);
	}
	
}
