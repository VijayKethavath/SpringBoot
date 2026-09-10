package com.example.demo.Student;

public class Student {

	private Integer id;
	private String name;
	private Integer marks;
	private Integer age;
	
	public Student() {
		
	}

	public Student(Integer id, String name, Integer marks, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getMarks() {
		return marks;
	}

	public Integer getAge() {
		return age;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
