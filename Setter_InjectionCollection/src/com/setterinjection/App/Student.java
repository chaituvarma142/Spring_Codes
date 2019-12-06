package com.setterinjection.App;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private int rollNo;
private String name;
private List<String>favBooks;
private Set<Integer>number;
private Map<Integer,String> friends;
public List<String> getFavBooks() {
	return favBooks;
}
public void setFavBooks(List<String> favBooks) {
	this.favBooks = favBooks;
}
public Set<Integer> getNumber() {
	return number;
}
public void setNumber(Set<Integer> number) {
	this.number = number;
}
public Map<Integer, String> getFriends() {
	return friends;
}
public void setFriends(Map<Integer, String> friends) {
	this.friends = friends;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	System.out.println("rollNo is called");
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("name is called");
	this.name = name;
	
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", favBooks=" + favBooks + ", number=" + number
			+ ", friends=" + friends + "]";
}

}
 