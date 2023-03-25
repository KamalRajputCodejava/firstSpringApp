package com.spring.constructorInj;

public class Person {
	private int Id ;
	private String name ;
	public Person(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", : name=" + name + "]";
	}
	

}
