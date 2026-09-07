package com.example.demo.Address;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("HYD")
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	

}
