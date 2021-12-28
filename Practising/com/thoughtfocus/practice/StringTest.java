package com.thoughtfocus.practice;

public class StringTest {
	public static void main(String[] args) {
		String str = "Shah";
		String str1 = "Sana";
		System.out.println(String.format("%s Hi Shah", str1));
		str = "Raj";
		String s = new String("    Raj");
		System.out.println(s.intern());
		System.out.println(s.length());
		System.out.println(s.equals(str1));
		System.out.println(s.hashCode());
		System.out.println(s.isEmpty());
		System.out.println(s.concat(str));
		System.out.println(s.compareToIgnoreCase(str));
		System.out.println(s.endsWith(str1));
		System.out.println(s.indexOf(str1));
		System.out.println(s.lastIndexOf(str));
		System.out.println(s.matches(str1));
		System.out.println(s.toString());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.getBytes());
		System.out.println(s.split(s));
	}
}
