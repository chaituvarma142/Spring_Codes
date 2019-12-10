package com.setterinjection.App;

public class Student {
private int rollNo;
private String name;


//for constructor injection getters and setters are not required
// and  we require parameterized constructors

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}


public Student()
{
	super();
	System.out.println("default or no args constructer is called");
}


public Student(int rollNo) {
	super();
	this.rollNo = rollNo;
	System.out.println("int type");
}


public Student(String name) {
	super();
	this.name = name;
	System.out.println("String type");
}


public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}


}
 