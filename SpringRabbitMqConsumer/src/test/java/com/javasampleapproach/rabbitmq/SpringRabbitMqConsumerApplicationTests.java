package com.javasampleapproach.rabbitmq;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRabbitMqConsumerApplicationTests {

	@Test
	public void contextLoads() {
	}

	    @Test
	public    void testGet() {
	        assertEquals("Hello JUnit 5", "Hello JUnit 5");
	    }
}
