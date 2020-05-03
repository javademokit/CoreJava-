package com.rsb.config.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.rsb.handle.productserviceInterceptore;
@Configuration
public class productservicesInterceptorAppConfig extends WebMvcConfigurerAdapter {
  @Autowired
	productserviceInterceptore sproductserviceInterceptore;
   
   @Override
   public void addInterceptors(InterceptorRegistry registery)
   {
	   
	   System.out.println("---------------config-----");
	   registery.addInterceptor(sproductserviceInterceptore);
   }
	
}
