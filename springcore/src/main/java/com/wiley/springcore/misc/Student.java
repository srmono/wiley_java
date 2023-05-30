package com.wiley.springcore.misc;

public class Student {
	
	//this is factory method
	// a static factory method that returns instance of own class
	// it is used in singleton design pattern
	public static Student getStudentInfo() {
		return new Student();
	}
	
	
	// a non static factory method that retuns the instance of another class
	//
}
