package com.example.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hi")
	public String getData() {
		return "Hii";
	}
	
	@GetMapping("/hello")
	public String getData1() {
		return "Hello";
	}
	
	
	@PostMapping("/bye")
	public String getData2() {
		return "bye";
	}

}
