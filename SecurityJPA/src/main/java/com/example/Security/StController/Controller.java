package com.example.Security.StController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Security.Entity.Student1;
import com.example.Security.StService.stService;

@RestController
public class Controller {
   
	@Autowired
	public stService service;
	
	@PostMapping("/register")
	public String postthodName(@RequestBody Student1 id) {
		return service.register(id);
	}

    @GetMapping("/hi")	
	public String getData() {
		return "Hii..";
	}
}
