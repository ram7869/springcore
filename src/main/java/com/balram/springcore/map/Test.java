package com.balram.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/balram/springcore/map/mapconfig.xml");

		Customer customer = ac.getBean("customer", Customer.class);

		System.out.println(customer.getId());
		System.out.println(customer.getProducts().getClass());
		System.out.println(customer.getClass().getName());

	}

}
