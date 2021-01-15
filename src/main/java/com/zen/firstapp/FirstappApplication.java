package com.zen.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstappApplication.class, args);

		GreetingService gs = context.getBean("greetingService", GreetingService.class);
		gs.greet();
	}

}
