package com.wiley.springcore.misc;

public class SingleTonA {
	private static final SingleTonA obj = new SingleTonA();

	public SingleTonA() {
		System.out.println("SingletonA object is created");
	}
	
	//factory method
	public static SingleTonA getSingleTonA() {
		return obj;
	}
	
	public void sayHello() {
		System.out.println("say hello to the employee");
	}
	
}
