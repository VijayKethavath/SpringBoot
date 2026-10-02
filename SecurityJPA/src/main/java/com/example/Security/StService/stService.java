package com.example.Security.StService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Security.Entity.Student1;
import com.example.Security.StudentRepo.StudentRepo;


@Service
public class stService {
	
	@Autowired
	public StudentRepo repo;
	
	@Autowired
	public PasswordEncoder encoder;

	public String register(Student1 id) {
		String password = id.getPassword();
		String encoderpassword = encoder.encode(password);
		id.setPassword(encoderpassword);
		repo.save(id);
		return "Succesfully.....";
	}

}
