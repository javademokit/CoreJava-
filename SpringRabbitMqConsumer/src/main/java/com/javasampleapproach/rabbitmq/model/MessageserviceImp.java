package com.javasampleapproach.rabbitmq.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageserviceImp implements Messageservices {

	@Autowired 
	MessageRepo messageRepo;
	@Override
	public Iterable<Messagemodel> listAllProducts() {
		
		return null;
	}

	@Override
	public Messagemodel saveProduct(Messagemodel product) {
		
		return messageRepo.save(product);
	}

}
