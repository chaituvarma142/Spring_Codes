package com.setterinjection.App;

public class Student {
private String rollNo;
private String name;


//for constructor injection getters and setters are not required
// and  we require parameterized constructors

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}



public Student(String name,String rollNo)
{
	super();
	this.name = name;
	this.rollNo = rollNo;
	System.out.println("int-String type");
}



}
 