package com.example.Security.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	
	@GetMapping("/hi")
	public String getData() {
		return "hi";
	}
     
	@PostMapping("/hello")
	 public String postData() {
		 return "Hello";
	 }
}
