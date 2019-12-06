package com.setterinjection.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container 
{
public static void main(String[] args) {

	ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	Alcohol jd=ac.getBean(Alcohol.class);
	Water tw=ac.getBean(Water.class);
	System.out.println(jd);
	System.out.println(tw);
	
	
	
}

}
