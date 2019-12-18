package com.setterinjection.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		Car audi = ac.getBean("audi", Car.class);
		Person ram = ac.getBean("ram", Person.class);
		ram.startCar();
		ram.stopCar();

	}

}
