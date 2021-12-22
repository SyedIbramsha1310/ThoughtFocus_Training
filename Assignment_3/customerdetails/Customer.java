package com.thoughtfocus.customerdetails;

public class Customer {
	String name;
	int age;
	String location;
	String phoneNo;
	String product;
	double price;
	double finalPrice;

	void printing(){
	price=334.50;
	double gst=price*0.18;
	finalPrice=gst+price;
	}
	
	void product(String userProduct){
		product=userProduct;
		price=150.00;
		System.out.println("The product is: "+product);
		System.out.println("\n The product price is: "+price);
		}

	void customerDetails(String n,int a,String add,String m){
	name=n;
	age=a;
	location=add;
	phoneNo=m;
	}

	void finalprinting(){
	System.out.println("\n Name is: "+name);
	System.out.println("\n Location is: "+location);
	System.out.println("\n Phone No is: "+phoneNo);
	System.out.println("\n Product is: "+product);
	System.out.println("\n Final price is: "+finalPrice);
	}

	void message(){
	    System.out.println("\n To: "+phoneNo);
	    System.out.println("\n Mr./Mrs. "+name+" Thank you for purchasing");
	}

	public static void main(String args[]){
	Customer customer=new Customer();
	customer.product("A4 Sheet Bundle");
	customer.printing();
	customer.customerDetails("Syed",13,"Chennai","6756788456");
	customer.finalprinting();
	}
}
