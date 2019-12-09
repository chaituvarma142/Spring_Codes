package com.setterinjection.App;

public class Son {
	//declaring data members
	private String name;
	//generating getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//generate a default constructor
	public Son() {
		System.out.println("son obj craeted");
	}
	//override a toString method
	@Override
	public String toString() {
		return "Son [name=" + name + "]";
	}

}
