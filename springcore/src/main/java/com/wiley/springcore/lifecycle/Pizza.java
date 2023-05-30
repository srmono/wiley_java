package com.wiley.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza  {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pizza(double price) {
		super();
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Inside the init method");
	}
	
	@PreDestroy 
	public void end() {
		System.out.println("Inside the destroy method");
	}

}
