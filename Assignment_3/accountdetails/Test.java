package com.thoughtfocus.accountdetails;

public class Test {
	private static final String Male = null;

	public static void main(String[] args) {
		Account account = new Account();
		account.details("Syed",Male, 789675336, 10000, 0);
		account.show();
		account.deposit(50000);
		account.checkbalance();
		account.withdraw(1300);
		account.checkbalance();
		
	}

}
