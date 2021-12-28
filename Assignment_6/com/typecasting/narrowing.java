package com.thoughtfocus.typecasting;

public class narrowing {
	public static void main(String[] args) {
		long mobileprice = 20000;
		short price1 = (short) mobileprice; 
		int price2 = (int) mobileprice; 
		float floatprice = (float) mobileprice;

		System.out.println(floatprice);
		System.out.println(price2);
		System.out.println(price1);

		int ram = 4;
		byte mobileRAM = (byte) ram; 
		char chr = (char) ram; 

		System.out.println(mobileRAM);
		System.out.println(chr);
	}

}
