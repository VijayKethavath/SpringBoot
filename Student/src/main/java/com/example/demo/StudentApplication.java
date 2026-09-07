package com.example.demo;

import java.util.Scanner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entity.Student;
import com.example.demo.Location.Location;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter student Name:");
		String name = sc.nextLine();
		 
		 
		
		System.out.println("Enter student id:");
		String city = sc.nextLine();
		
		Student student = context.getBean(Student.class);
		Location location = context.getBean(Location.class);
		
		student.setId(id);
		student.setName(name);
		location.setCity(city);
		student.setLocation(location);
		
		System.out.println(student);
		
	}

}
