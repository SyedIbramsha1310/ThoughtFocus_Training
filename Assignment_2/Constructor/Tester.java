package Constructor;

public class Tester {
	public static void main(String[] args) {
		Student S1 = new Student("Syed");
		Student S2 = new Student("Ibramsha");
		System.out.println("Number of Students"+Student.getCount());
		S1.display();
		S2.display();
	}

}
