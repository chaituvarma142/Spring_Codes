package com.setterinjection.App;

public class Person {
	public Person(Car car) {
		this.audi = car;
		System.out.println("person created");
	}

//this reference matter alot in byName
	// as we have created an object with this reference
	Car audi;//---->associated object 

	public void startCar() {
		audi.startEngine();
	}

	public void stopCar() {
		audi.stopEngine();
	}

	public Car getAudi() {
		return audi;
	}

	public void setAudi(Car audi) {
		this.audi = audi;
	}

}
