package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private String hello;

	public WelcomeController(@Value("${WELCOME_MESSAGE:NOT SET}") String welcomeMessage) {
		this.hello = welcomeMessage;

	}

	@GetMapping("/")
	public String sayHello() {
		System.out.println(hello); 
		
		return hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}