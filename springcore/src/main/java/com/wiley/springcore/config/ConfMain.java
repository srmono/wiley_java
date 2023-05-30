package com.wiley.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfMain {
	public static void main(String[] args) {

		ApplicationContext con = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student student = con.getBean("st2", Student.class);
		
		System.out.println(student);
		
		student.study();
	}
}
