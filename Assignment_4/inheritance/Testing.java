package com.thoughtfocus.inheritance;

public class Testing {
	public static void main(String[] args) {
		Movies movies = new Movies();
		NationalAwards na = new NationalAwards();
		
		movies.Rajini();
		movies.Kamal();
		movies.Ajith();
		movies.Vijay();
		movies.Surya();
		movies.Vikram();
		
		System.out.println("------ NATIONAL AWARD WINNERS LIST ------");
		
		na.Rajini();
		na.Kamal();
		na.Ajith();
		na.Vijay();
		na.Surya();
		na.Vikram();
	}

}
