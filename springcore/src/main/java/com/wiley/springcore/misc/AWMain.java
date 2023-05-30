package com.wiley.springcore.misc;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Resource 
//	Based on JSR-250
//	byName
//	byType
//	Qualifier 
//@Autowired 
//	specified in Spring
//	byType 
//	Qualifier 
//	byName

public class AWMain {
	public static void main( String[] args )
    {
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("com/wiley/springcore/misc/config.xml");
    	
    	Employee emp1 =  context.getBean("employee", Employee.class);
    	System.out.println(emp1);
    	emp1.displayEmployee();
    	System.out.println("************************************************");
    	
    	SingleTonA objA =  context.getBean("venkat", SingleTonA.class);
    	objA.sayHello();
    	
    	
    	
    	

    }
}
