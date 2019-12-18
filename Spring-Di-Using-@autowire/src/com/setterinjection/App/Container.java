package com.setterinjection.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
	 Switch s=ac.getBean("switch",Switch.class);
	 Bulb b=ac.getBean("bulb",Bulb.class);
s.switchOn();

	}

}
