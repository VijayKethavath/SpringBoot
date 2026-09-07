package com.example.demo.Location;

import org.springframework.stereotype.Component;

@Component
public class Location {
  private String City;

  public void setCity(String city) {
	City = city;
  }



  @Override
  public String toString() {
	return "Location [City=" + City + "]";
  }
  
  
}
