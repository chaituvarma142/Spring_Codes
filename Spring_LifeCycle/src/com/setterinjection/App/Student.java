package com.setterinjection.App;

public class Student {
private int rollNo;
private String name;

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	System.out.println("rollNo setter is called");
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("name setter is called");
	this.name = name;
	
}
public Student()
{
	System.out.println("student created");
}
//initialising init method my our own signature!!
public void initmethod()
{
	System.out.println("init method is called");
	}
//initialising destroy method my our own signature!!
public void dummyDestroy()
{
System.out.println("destroy method is called");	
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}
}
 