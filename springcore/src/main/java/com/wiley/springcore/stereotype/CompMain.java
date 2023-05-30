package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompMain {
	public static void main(String[] args) {
		ApplicationContext context =
   			 new ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/config.xml");
		
		Student student = context.getBean("sob", Student.class);
		
		System.out.println(student);
	}
}
