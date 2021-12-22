package com.thoughtfocus.atm;

public class SBI implements ATM {

	@Override
	public void deposit() {
		System.out.println("Limited in our customers");
		System.out.println("Limited deposit another bank which is  50000");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Limit will be 20000");
		System.out.println("It will be 10000 limit");		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Limited in our customers");
		System.out.println("Limited deposit another bank which is  50000");		
	}

	@Override
	public void ministatement() {
		System.out.println("Taking a MiniStatement");
		
	}

	@Override
	public void phoneNumber() {
		System.out.println("Your number is 8766567878");
		
	}

}
