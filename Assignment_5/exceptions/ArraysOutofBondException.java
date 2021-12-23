package com.thoughtfocus.exceptions;

public class ArraysOutofBondException {
	static int[] language = new int[3];
	static int i = 0;

	public static void addAges(int number) {
		if (i < 3)
			language[i] = number;
		i++;
	}

	public static void getAge() {
		try {
			System.out.println(language[4]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
}