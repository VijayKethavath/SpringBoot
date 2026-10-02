package com.example.Security.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Security.Entity.Student1;
import com.example.Security.StudentRepo.StudentRepo;

@Service
public class UserDetailService implements UserDetailsService {

	@Autowired
	private StudentRepo repo;
	
	
	public UserDetails loadUserByUsername(String username ) throws UsernameNotFoundException {
		
		Student1 student = repo.findByUser(username).orElseThrow(()->iuiiuiiuuuuun';new UsernameNotFoundException("User not Found"));
		return User.builder()
				.username(student.getUser())
				.password(student.getPassword())
				.roles("USER")
				.build();
		
	}
}
