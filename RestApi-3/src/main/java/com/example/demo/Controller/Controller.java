package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class Controller {
	
	@Autowired
	public StudentService stservice;
	
	@PostMapping
	public Student postData(@RequestBody Student s) {
		return stservice.savedata(s);
	}
	
	@GetMapping
	public List<Student> getData(){
		return stservice.getdata();
	}
	
	@PutMapping("{/id}")
	public Student UpadteData(@PathVariable int id,@RequestBody Student s ) {
		return stservice.updateData(id,s);
	}
	
	@DeleteMapping("{/id}")
    public String Deletedata(@PathVariable int id) {
    	return stservice.deleteData(id);
    }

}
