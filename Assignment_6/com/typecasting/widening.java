package com.thoughtfocus.typecasting;

public class widening {
	public static void main(String[] args) {
		byte ram = 8;
		int RAM = ram;

		int price = 43000;
		double mobilePrice = price; 

		short ROM = 32;
		@SuppressWarnings("unused")
		int Mobile = ROM; 

		System.out.println(RAM);
		System.out.println(mobilePrice);
		System.out.println(ROM);
	}

}
