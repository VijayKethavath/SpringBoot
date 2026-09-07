package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.Location.Location;

@Component
public class Student {
	
	@Value("101")
	private int id;
	
	@Value("vijay")
	private String name;
	
	@Autowired
    private Location location;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
  
}
