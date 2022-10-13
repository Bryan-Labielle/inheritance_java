package com.wcs.inheritance;

public abstract class Vehicle {
	
	private String brand;
	private int kilometers;
	
	// constructor
	public Vehicle(String brand, int kilometers) {
		
		this.brand = brand;
		this.kilometers = kilometers;
	}
	
	public abstract String doStuff();
	
	//getter brand
	public String getBrand() {
		
		return this.brand;
		
	}
	
	// getter kilometers
	public int getKilometers() {
		
		return this.kilometers;
		
	}
	
	// setter brand
	public void setBrand(String brand) {
		
		this.brand = brand;
		
	}
	
	// setter kilometers
	public void setKilometers(int kilometers) {
		
		this.kilometers = kilometers;
		
	}
	
	
}
