package com.bt.rabbitmq.controller;

import java.net.InetSocketAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.websocket.server.PathParam;

import org.apache.http.HttpHeaders;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bt.rabbitmq.entity.Producer;
import com.getordr.dao.ExceptionResponse;
import com.getordr.dao.ResourceNotFoundException;
import com.getordr.dao.get_order;
//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Validated
public class WebController<object> {
	@Autowired
	Producer producer;
	static 
	{
		Map<Integer ,get_order>respo=new HashMap<Integer,get_order>();
		get_order or=new get_order();
		 or.setAddress("krpuram");
		 or.setContact_details("8095042235");
		 or.setEmail("shyam99sm@gmail.com");
		 or.setFood_name("paneer");
		 or.setNo_of_item("1");
		 or.setOrder_date(new Date());
		 or.setOrder_id(1234);
		 or.setOrdername("food chicken");
		 or.setPaymentmode("by credit card");
		 or.setTotal_amount(314);
		 respo.put(1, or);
	}
	
	@RequestMapping("/send/{msg}")
	public String sendMsg(@Valid @PathVariable(name="msg",required = true) String msg){
		//producer.produceMsg(msg);
		return "Done";
	}
	
	// @CrossOrigin(origins = "http://localhost:3000")
	 @RequestMapping(method = RequestMethod.GET, value="/publish_order")
	 @ResponseBody
	 public get_order publish_order1() throws ResourceNotFoundException ,ExceptionResponse
	 
	 {
		 get_order or=new get_order();
		 or.setAddress("krpuram");
		 or.setContact_details("8095042235");
		 or.setEmail("shyam99sm@gmail.com");
		 or.setFood_name("paneer");
		 or.setNo_of_item("1");
		 or.setOrder_date(new Date());
		 or.setOrder_id(1234);
		 or.setOrdername("food chicken");
		 or.setPaymentmode("by credit card");
		 or.setTotal_amount(314);
		// producer.produceMsg(or.toString());
		return or;
		 
	 }
	// @CrossOrigin(origins = "http://localhost:3000")
	 @RequestMapping(method = RequestMethod.POST, value="/publish")

	 public  ResponseEntity<Object> publish_order( @RequestBody @Valid get_order Get_order)
	 {
		 System.out.println("heeloooooo");
		 get_order published =new get_order();
		 published.setAddress(Get_order.getAddress());
		 published.setContact_details(Get_order.getContact_details());
		 published.setEmail(Get_order.getEmail());
		 published.setFood_name(Get_order.getFood_name());
		 published.setNo_of_item(Get_order.getNo_of_item());
		 published.setOrder_date(Get_order.getOrder_date());
		 published.setOrder_id(Get_order.getOrder_id());
		 published.setOrdername(Get_order.getOrdername());
		 published.setPaymentmode(Get_order.getPaymentmode());
		 published.setTotal_amount(Get_order.getTotal_amount());
		//producer.produceMsg(published.toString());
		 
		 return new ResponseEntity<>("Your item has been order have a nice food!!",HttpStatus.ACCEPTED);
	
		 
	 }
	
	
}
