package com.balram.springcore.property.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/balram/springcore/property/placeholder/config.xml");
		
    MyDao bean = applicationContext.getBean("mydao", MyDao.class);
    System.out.println(bean.getDbServer());
		

	}

}
