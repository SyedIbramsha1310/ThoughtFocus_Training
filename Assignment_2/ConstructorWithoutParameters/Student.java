package ConstructorWithoutParameters;

public class Student {
	String name;
	int id;
	public Student(int i ,String n) {
		id = i;
		name = n;
	}
	void display() {
		System.out.println(id+" "+name);
	}

}
