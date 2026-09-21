package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Student;
import com.example.demo.StudentRepository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository repo;
	
	public Student savedata(Student s) {
		return repo.save(s) ;
		
	}

	public List<Student> getdata() {
		return repo.findAll() ;
	}

	public Student updateData(int id, Student student) {
		Student exist = repo.findById(id).orElse(null);
		
		if(exist != null) {
			exist.setName(student.getName());
			exist.setAge(student.getAge());
			exist.setMarks(student.getMarks());
			
			return repo.save(exist);
		}
		return null;
		
	}

	public String deleteData(int id) {
		
		  repo.deleteById(id);
		   
		   return "Student deleted successfully";

	}
	
	
	
	
    
	
	
}
