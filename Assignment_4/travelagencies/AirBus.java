package com.thoughtfocus.travelagencies;

public class AirBus implements Plane,Bus {

	@Override
	public void run() {
		System.out.println("Bus travelling is Cheaper than Plane travelling");
		
	}

	@Override
	public void fly() {
		System.out.println("Plane travelling is the costliest travel");
		
	}

}
