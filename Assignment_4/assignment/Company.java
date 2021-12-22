package com.thoughtfocus.assignment;

public class Company implements WashingMachine,Fridge {

	@Override
	public void cooling() {
		System.out.println("Fridge power consumption is between 100 and 250 watts");
		
	}

	@Override
	public void wash() {
		System.out.println("Washing the Clothes using LG");
		
	}

	@Override
	public void spin() {
		System.out.println("Spinning the clothes using LG");
		
	}

}
