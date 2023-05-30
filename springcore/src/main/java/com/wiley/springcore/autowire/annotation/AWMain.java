package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AWMain {
	public static void main( String[] args )
    {
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/autowireconfig.xml");
    	
    	Emp emp1 =  context.getBean("emp1", Emp.class);
    	System.out.println(emp1);
    	
    	//System.out.println(emp1.getPhones().getClass().getName()); java.util.ArrayList

    }
}
