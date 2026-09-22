package com.example.demo.StController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StController {

	private List<Student> students = new ArrayList<>();
	
   @PostMapping	
   public String addStudent(@Valid @RequestBody Student st) {
	   students.add(st);
	   return "Student added successfully";
   }
   
   @GetMapping
   public List<Student> getStudent(){
	   return students;
   }
   
   @ExceptionHandler(MethodArgumentNotValidException.class)
   public String handleValidationException(MethodArgumentNotValidException ex) {

       return ex.getBindingResult()
               .getFieldErrors()
               .get(0)
               .getDefaultMessage();
   }
}
