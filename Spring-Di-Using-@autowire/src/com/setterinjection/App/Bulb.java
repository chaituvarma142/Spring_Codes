package com.setterinjection.App;

import org.springframework.stereotype.Component;

@Component
public class Bulb 
{
public void bulbOn()
{
	System.out.println("blub turned on");
	}
public Bulb() {
	System.out.println("bulb obj is created");
}
}
