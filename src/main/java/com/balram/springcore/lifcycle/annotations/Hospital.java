package com.balram.springcore.lifcycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hospital  {

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter method");
		this.name = name;
	}

	@PostConstruct
	public void hi() throws Exception {
		System.out.println("init Method");
		
	}

	@PreDestroy
	public void by() throws Exception {
		System.out.println("distroy Method");
		
	}

	

}
