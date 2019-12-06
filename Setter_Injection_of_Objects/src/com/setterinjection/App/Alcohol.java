package com.setterinjection.App;

public class Alcohol 
{
private String brand;
private double quantity;
//associated Object
private Water water;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public Water getWater() {
	return water;
}
public void setWater(Water water) {
	this.water = water;
	
}

@Override
public String toString() {
	return "Alcohol [brand=" + brand + ", quantity=" + quantity + ", water=" + water + "]";
}
public Alcohol() {
	System.out.println("alcohol obj is created");
}
}
