package com.example.demo.Methods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;

@RestController
@RequestMapping("/student")
public class Methods {
	
	ArrayList<Student> students = new ArrayList<>();
	
	@PostMapping
	public Student addStudent(@RequestBody Student studnet) {
		students.add(studnet);
		
		return studnet;
	}
	
	@GetMapping
	public List<Student> getstudent(){
		return students;
	}
		public Student getstudentById(@PathVariable int id) {
		
		for(Student student : students) {
			
			if(student.getId() == id) {
				return student;
			}
		}
		
		return null;
		
	}
	
	@PutMapping("/{id}")
	public Student UpdateStudent(@PathVariable int id,@RequestBody Student student  ) {
		
		for(Student st : students ) {
			
			if(st.getId() == id) {
				st.setName(student.getName());
				st.setMarks(student.getMarks());
				st.setAge(student.getAge());
				
				return st;
			}
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public String DeleteStudent(@PathVariable int id) {
		
		for(Student st : students) {
			
			if(st.getId()==id) {
			   students.remove(st);
			   
			   return "Student Deleted Successfully";
			   
			}
		}
		
		return "Student not found";
	}
	
	

}
