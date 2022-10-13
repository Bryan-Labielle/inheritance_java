package com.wcs.inheritance;

public class Hangar {

	public static void main(String[] args) {
		
		Car ferrari = new Car("Ferrary", 100000);
		
		Boat zodiac = new Boat("Zodiac", 15000);
		
		System.out.println(ferrari.doStuff());
		System.out.println(zodiac.doStuff());
	}

}
