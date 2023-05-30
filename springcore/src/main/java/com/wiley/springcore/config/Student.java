package com.wiley.springcore.config;

import org.springframework.stereotype.Component;

//@Component("student1")
public class Student {
	
	private Beer beer;
	
	public Beer getBeer() {
		return beer;
	}

	public void setBeer(Beer beer) {
		this.beer = beer;
	}

	public Student(Beer beer) {
		super();
		this.beer = beer;
	}

	public void study() {
		beer.display();
		System.out.println("Student Sachin is studying");
	}
}
