package com.balram.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.balram.springcore.list.Hospital;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/balram/springcore/set/setconfig.xml");

		CarDelar cardelar = ac.getBean("cardelar", CarDelar.class);

		System.out.println(cardelar.getName());
		System.out.println(cardelar.getModels());


	}

}
