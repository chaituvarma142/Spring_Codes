package com.setterinjection.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container 
{
public static void main(String[] args) {
	//this line is used to create the container------>
	ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	Father f=ac.getBean(Father.class);
	//Son s=ac.getBean(Son.class);
	System.out.println(f);
	//System.out.println(s);
	
}
}
