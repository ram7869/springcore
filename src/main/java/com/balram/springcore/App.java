package com.balram.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext cap =new ClassPathXmlApplicationContext("config.xml");
       Employee bean = cap.getBean("emp", Employee.class);
       System.out.println(bean.getId());
       System.out.println(bean.getName());
    }
}
