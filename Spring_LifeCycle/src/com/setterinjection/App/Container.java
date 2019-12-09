package com.setterinjection.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container 
{
public static void main(String[] args) {
	//AbstractApplicationContext only contains close init 
	AbstractApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	Student obj=ac.getBean("s", Student.class);
	System.out.println(obj);
	Student obj1=ac.getBean("s1", Student.class);
			System.out.println(obj1);
			ac.close();
}
}
