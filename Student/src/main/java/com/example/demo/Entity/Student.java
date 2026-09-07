package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Location.Location;

@Component
public class Student {
	
	private int id;
	private String name;
	
	@Autowired
	private Location location;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
	
	
	

}
