package JumpStatement;

public class JumpStatement {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.println("i=" +i);
			if(i==7) {
				System.out.println("The statement got Jumped");
				break;
			}
		}
	}

}
