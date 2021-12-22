package Constructor;

public class Student {
	String name;
	int regnum;
	static int count;
	Student(String n) {
		name=n;
		regnum=++count;
	}
	void display() {
		System.out.println("Name="+name);
		System.out.println("\tregnum="+regnum);
	}
	static int getCount() {
		return count;
	}

}
