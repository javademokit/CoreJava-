import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/*package com.bt.rabbitmq.controller;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messagevalidation {

	@RequestMapping("/send/{msg}")
	public String sendMsg(@Valid @PathVariable(name="msg",required = true) String msg){
		//producer.produceMsg(msg);
		return "Done";
	}
	@GetMapping("/message/{msg}")
	public ResponseEntity<String> getmessage( @Valid @PathVariable(name = "msg", required = false) String msg)
	{
		//name = "param", required = true
		String msg1="Hello World"+msg;
		return new ResponseEntity<String>(msg1, HttpStatus.CREATED);
		
	}
	@GetMapping("/valid/{name}")
	public String  createUsername(@PathVariable("name") @NotBlank @Size(max = 10) String username) {
		System.out.println("nooo");
		return username;
		
	}
	 @GetMapping("/{id}")
	    public int validatedPath(@PathVariable("id") @Max(9) int id) 
	  {
	        return id;
	        
	 }
       @ExceptionHandler
	    public String constraintViolationHandler(ConstraintViolationException ex) {
	        
	    	return ex.getConstraintViolations().iterator().next().getMessage();
	    }
	    
	    @GetMapping(value = "/api/{someInt}")
	    	public ResponseEntity<String> someRestApiMethod(@PathVariable @Valid @Min(0) @Digits(integer=10, fraction=0) int someInt) {
	    	    return new ResponseEntity<String>("sample:"+someInt, HttpStatus.OK);
	    	}
}
*/
/* @GetMapping("/getBaseUrl")
	 public ResponseEntity<String> getBaseUrl(@RequestHeader HttpHeaders headers) {
	     InetSocketAddress host = headers.getHost();
	     String url = "http://" + host.getHostName() + ":" + host.getPort();
	     return new ResponseEntity<String>(String.format("Base URL = %s", url), HttpStatus.OK);
	 }*/
	/* 
	 @GetMapping("/greeting")
	 public ResponseEntity<String> greeting(@RequestHeader("accept-language") String language) {
	     String greeting="hello";
		// code that uses the language variable
	     return new ResponseEntity<String>(greeting, HttpStatus.OK);
	 }*/
	 /*
	 @GetMapping("/multiValue")
	 public ResponseEntity<String> multiValue(
	   @RequestHeader MultiValueMap<String, String> headers) {
	     headers.forEach((key, value) -> {
	         LOG.info(String.format(
	           "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
	     });
	          
	     return new ResponseEntity<String>(
	       String.format("Listed %d headers", headers.size()), HttpStatus.OK);
	 }
	 */