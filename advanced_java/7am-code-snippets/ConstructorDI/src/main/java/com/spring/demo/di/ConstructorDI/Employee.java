package com.spring.demo.di.ConstructorDI;

public class Employee {

	private int id;
	private String name;
	private String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	
	
}
