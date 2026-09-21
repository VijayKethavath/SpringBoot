package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studnet")
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private Integer age;
	private Integer marks;
	
	
	public Student() {
		
	}


	public Student(Integer id, String name, Integer age, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Integer getAge() {
		return age;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	

}
