package com.example.demo.StudentRepository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}