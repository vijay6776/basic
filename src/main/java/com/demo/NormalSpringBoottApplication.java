package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.service.Demo;

@SpringBootApplication
public class NormalSpringBoottApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NormalSpringBoottApplication.class, args);
	
	context.getBean(Demo.class);
	}

}
