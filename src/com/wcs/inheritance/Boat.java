package com.wcs.inheritance;

public class Boat extends Vehicle{
	
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	@override
	public String doStuff() {
		return "I am " + this.getBrand() +  " and I go glug glug!";
	}

}
