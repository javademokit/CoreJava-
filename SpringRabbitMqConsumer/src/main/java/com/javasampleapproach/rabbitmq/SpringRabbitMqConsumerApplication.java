package com.javasampleapproach.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.rabbitmq.consumer.Consumer;
import com.javasampleapproach.rabbitmq.model.Messagemodel;
import com.javasampleapproach.rabbitmq.model.Messageservices;
@SpringBootApplication
@ComponentScan("com.javasampleapproach.rabbitmq")
@EnableAutoConfiguration
@RestController
public class SpringRabbitMqConsumerApplication {
	
	@Autowired
	Messageservices messageservices;
	
	//@Autowired 
	//Consumer consumer;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMqConsumerApplication.class, args);
		
		
	}
	 @RequestMapping(method = RequestMethod.GET, value="/publish_order")
	public String save()
	{
		
		
		return null;
		
		
	}
	
	
	
}
