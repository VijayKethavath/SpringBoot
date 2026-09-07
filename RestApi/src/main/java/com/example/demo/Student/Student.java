package com.example.demo.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private Integer age;
	private Integer marks;
	
	public Student() {
		super();
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
	
	
	
}
	
	