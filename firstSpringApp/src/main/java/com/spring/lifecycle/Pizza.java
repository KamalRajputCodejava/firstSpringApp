package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private int price ;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pizza(int price) {
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
		System.out.println("starting : method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending  : method ");
		
	}

}
