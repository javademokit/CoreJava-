package com.javasampleapproach.rabbitmq.model;

public interface Messageservices {
	 Iterable<Messagemodel> listAllProducts();
	 Messagemodel saveProduct(Messagemodel product);

}
