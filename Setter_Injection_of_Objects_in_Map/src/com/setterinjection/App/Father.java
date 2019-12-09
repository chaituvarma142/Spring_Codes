package com.setterinjection.App;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Father {
	//declaring data members
	private  String name;
	Map<String, Son> sons=new HashMap();
	
	//generate a default constructor
	public Father() {
		System.out.println("father obj created");
	}
	//generating getters and setters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Son> getSons() {
		return sons;
	}
	public void setSons(Map<String, Son> sons) {
		this.sons = sons;
	}
	//override a toString method
	@Override
	public String toString() {
		return "Father [name=" + name + ", sons=" + sons + "]";
	}

	

}
