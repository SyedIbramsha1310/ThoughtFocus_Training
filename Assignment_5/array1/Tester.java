package com.thoughtfocus.array1;

public class Tester {
	public static void main(String[] args) {
		Language language = new Language();
		
		language.save("Java Language");
		language.save("HTML Language");
		language.save("CSS Language");
		language.save("JAVA SCRIPT Language");
		language.save("SQL Language");
		language.save("MYSQL Language");
		language.save("Python Language");
		language.save("C Language");
		language.save("C++ Language");
		language.save("Data Structure & Algorithms");
		language.save("Artificial Intelligence");
		language.save("Machine Learning");
		language.save("DBMS Language");
		language.save("SDLC Language");
		language.save("STLC Language");
		
		language.printAll();
		
		System.out.println("----------------------");
		
		String resp = language.delete("Data Structure & Algorithms");
		System.out.println(resp);
		
		language.Update("Python Language","Easy to Learn");
		
		language.printAll();
		
	}

}
