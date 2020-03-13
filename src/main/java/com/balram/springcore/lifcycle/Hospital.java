package com.balram.springcore.lifcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hospital implements InitializingBean,DisposableBean {

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter method");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Distroy Method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After propertyset Method");
		
	}

	

}
