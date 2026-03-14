package com.drone2Receiver.drone2Receiver;

import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Drone2ReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Drone2ReceiverApplication.class, args);
	}
        
        @Bean 
               JacksonJsonMessageConverter converter() { 
                return new JacksonJsonMessageConverter(); 
                   } 

}
