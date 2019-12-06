package com.setterinjection.App;

import java.util.List;

public class Father {
	//declaring data members
	private  String name;
	private List<Son> sons;
//generating getters and setters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Son> getSons() {
		return sons;
	}
	public void setSons(List<Son> sons) {
		this.sons = sons;
	}
	
	//generate a default constructor
	public Father() {
		System.out.println("father obj created");
	}
	//override a toString method
	@Override
	public String toString() {
		return "Father [name=" + name + ", sons=" + sons + "]";
	}
	

}
