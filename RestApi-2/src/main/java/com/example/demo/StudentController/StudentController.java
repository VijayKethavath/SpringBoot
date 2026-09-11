package com.example.demo.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentSevice;
import com.example.demo.Entity.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentSevice stService;
	
	@GetMapping("/view")
	public List<Student> getMethodName(){
		return stService.getData();
	}
	
	@GetMapping("/viewbyid/{id}")
	public Student getStudent(@PathVariable int id) {
		return stService.findById(id);
		
	}
	
	@PostMapping("/post")
	public Student postData(@RequestBody Student s) {
		return stService.postStudent(s);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student s) {
		return stService.updateSudent(id,s);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return stService.DeleteStudent(id);
	}
    
	@DeleteMapping("/delete")
	public String deleteStudent1(@RequestParam int id) {
		return stService.DeleteStudent(id);
	}
	
}
