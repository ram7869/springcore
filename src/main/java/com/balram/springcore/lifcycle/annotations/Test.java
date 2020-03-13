package com.balram.springcore.lifcycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/balram/springcore/lifcycle/annotations/config.xml");

		Hospital hospital = ac.getBean("hospital", Hospital.class);

		System.out.println(hospital.getName());
		ac.registerShutdownHook();
	
		
	}

}
