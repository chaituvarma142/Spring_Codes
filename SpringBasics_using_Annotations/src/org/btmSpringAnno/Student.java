package org.btmSpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Student
{
	
	String name="chaitu";
	String name1="pintu";
	String name2="pinky";
	public Student() 
	{
		System.out.println("Student  objects are created");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", name1=" + name1 + ",name2=" + name2 + "]";
	}

}
