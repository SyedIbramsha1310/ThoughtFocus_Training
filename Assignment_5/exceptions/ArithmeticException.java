package com.thoughtfocus.exceptions;

public class ArithmeticException {
	public static void main(String[] args) {
		int x = 3;
		int y = 0;
		try {
			int division = x / y;
			System.out.println("Division: " + division);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
