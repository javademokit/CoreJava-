package com.bt.rabbitmq.entity;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.getordr.dao.get_order;

@Component
public class Producer {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${jsa.rabbitmq.routingkey}")
	private String routingKey;
	
	public void produceMsg(String Get_order)
	{
		amqpTemplate.convertAndSend(exchange, routingKey, Get_order);
		System.out.println("Send msg = " + Get_order.toString());
	}

	public void produceMsg1(String msg){
		amqpTemplate.convertAndSend(exchange, routingKey, msg);
		System.out.println("Send msg =----- " + msg.toString());
	}
}

