package com.thoughtfocus.uncheckedexception;

import java.util.Arrays;

public class Medicals {
	String[] items = {"Acetaminophen","Adderall","Amitriptyline","Amlodipine","Amoxicillin"};
	
	void searchItem(String item) {
		if( Arrays.binarySearch(items, item) >= 0) {
			System.out.println("Tablets are available right now");
		}
		else {
			MedicalsException medicalsException = new MedicalsException();
			throw medicalsException;
		}
	}

}
