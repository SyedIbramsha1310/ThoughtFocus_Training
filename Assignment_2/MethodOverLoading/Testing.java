package MethodOverLoading;

public class Testing {
	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println(obj.sum(13, 34));
		System.out.println(obj.sum(2,6));
		System.out.println(obj.sum(6.2,7.9));
		System.out.println(obj.sum(5,7.7));
	}

}
