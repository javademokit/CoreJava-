package com.javasampleapproach.rabbitmq.consumer;
import java.io.IOException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javasampleapproach.rabbitmq.model.Messagemodel;
@Component
public class Consumer {
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void recievedMessage(String  messageEntity) {
        System.out.println("Recieved Message: " + messageEntity.toString());
        
       String json=messageEntity;
        
	   ObjectMapper mapper = new ObjectMapper();
	try
	{
		Messagemodel emp = mapper.readValue(json, Messagemodel.class);
	     
	    System.out.println("consume data -------------------------->"+emp);
	} 
	catch (JsonGenerationException e) 
	{
	    e.printStackTrace();
	} catch (JsonMappingException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
        
      
		 
    }
}

