package com.setterinjection.App;

public class Water 
{
private  double quantity;
private String type;


public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;

}
public Water() {
	System.out.println("water obj is created");
}
@Override
public String toString() {
	return "Water [quantity=" + quantity + ", type=" + type + "]";
}

}
