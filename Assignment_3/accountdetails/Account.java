package com.thoughtfocus.accountdetails;

public class Account {
	String name;
	String gender;
	int acc_No;
	double phoneNo;
	float amount;
	
	void details(String n, String g, int accNo, double phnNo, float a) {
		name = n;
		gender = g;
		acc_No = accNo;
		phoneNo = phnNo;
		amount = a;
	}
	void show() {
		System.out.println(name+" "+gender+" "+acc_No+" "+phoneNo+" "+amount);
	}
	void deposit(float a) {
		amount+=a;
		System.out.println("Deposit amount:"+a);
	}
	void withdraw(float a) {
		if(amount<a)
			System.out.println("Insufficient balance");
		else
			amount-=a;
		System.out.println("Withdraw amount: "+a);
	}
	public void checkbalance() {
		// TODO Auto-generated method stub
		
	}

}
