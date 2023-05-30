package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {

	public static void main(String[] args) {
		ApplicationContext context =
   			 new ClassPathXmlApplicationContext("com/wiley/springcore/ci/ciconfig.xml");
		
		Perrson p1 = (Perrson) context.getBean("p1");
		
		System.out.println(p1);

	}

}
