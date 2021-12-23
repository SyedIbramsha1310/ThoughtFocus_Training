package com.thoughtfocus.array;

public class Tester {
	public static void main(String[] args) {
		Month months = new Month();
		
		months.save("January");
		months.save("February");
		months.save("March");
		months.save("April");
		months.save("May");
		months.save("June");
		months.save("July");
		months.save("August");
		months.save("September");
		months.save("October");
		months.save("November");
		months.save("December");
		
		months.printAll();
		
		String resp = months.delete("October");
		System.out.println(resp);
		
		months.printAll();
		
	}

}
