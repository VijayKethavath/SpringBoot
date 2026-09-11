package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;

@Service
public class StudentSevice {

	
	public List<Student> list = new ArrayList<>(Arrays.asList(
			new Student (1,"aa",20,86),
			new Student (2,"bb",21,87),
			new Student (3,"cc",30,96),
			new Student (4,"dd",40,76)));
	
	
	public List<Student> getData() {
		return list;
		
	}


	public Student findById(int i) {
	 for(Student student : list) {
		 if(student.getId() == i);
		 return student;
	 }
		return null;
	}


	public Student postStudent(Student s) {
		list.add(s);
		return s;
	}

	public String DeleteStudent(int id) {
        for(Student st : list) {
        	if(st.getId()==id) {
        		list.remove(st);
        		
        		return "Delete successfull";
        	}
        }
		return "Not found";
	}


	public Student updateSudent(int id,Student st) {
		for(Student s : list) {
			if(s.getId() == id) {
				s.setName(st.getName());
				s.setAge(st.getAge());
				s.setMarks(st.getMarks());
				
				return s;
			}
		}
		return null;
	}



}
