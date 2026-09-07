package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.Address.Address;

@Component
@Scope("prototype")
public class Student {
	
	@Value("1")
	private int id;
	@Value("Devi")
	private String name;
	@Value("94")
	private String marks;
	
	@Autowired
	private Address adress;
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, String marks, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMarks() {
		return marks;
	}
	public Address getAdress() {
		return adress;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", adress=" + adress + "]";
	}
	
	
	

}
