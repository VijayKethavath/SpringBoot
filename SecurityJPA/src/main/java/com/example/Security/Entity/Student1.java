package com.example.Security.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student1")
public class Student1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String user;
  private String password;
  
  
  public Student1() {
	super();
}


  public Student1(Integer id, String user, String password) {
	super();
	this.id = id;
	this.user = user;
	this.password = password;
  }


  public Integer getId() {
	return id;
  }


  public String getUser() {
	return user;
  }


  public String getPassword() {
	return password;
  }


  public void setId(Integer id) {
	this.id = id;
  }


  public void setUser(String user) {
	this.user = user;
  }


  public void setPassword(String password) {
	this.password = password;
  }	
}
