package com.example.Security.StudentRepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Security.Entity.Student1;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Integer>{
     
	Optional<Student1> findByUser(String user);
}
