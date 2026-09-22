package com.example.demo.Student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@NotBlank(message = "Email is Required")
	@Email(message = "Enter a valid Email")
	private String email;
	
	@Min(value = 18,message = "Age must be at least 18")
	private int age;
	
	@Size(min = 10,max = 10,message = "Phone number must contain 10 digits")
	private String phone;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

}
