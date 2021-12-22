package LoopingStatements;

public class ForEach {
	public static void main(String[] args) {
		int arr[] = {13,7,9,3};
		int total=0;
		for(int i:arr) {
			total=total+i;
		}
			System.out.println("Total:" +total);
	}

}
