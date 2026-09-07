package com.example.demo.Location;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
  @Value("HYD")
  private String City;
  
  

  @Override
  public String toString() {
	return "Location [City=" + City + "]";
  }
  
  
}
