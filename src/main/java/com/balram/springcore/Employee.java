package com.balram.springcore;


import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String name;
	private int id;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

}
