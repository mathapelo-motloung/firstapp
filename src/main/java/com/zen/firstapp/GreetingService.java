package com.zen.firstapp;

import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingService {
	public void greet() {
		System.out.println("Hello SpringBoot!!!");
	}
}
