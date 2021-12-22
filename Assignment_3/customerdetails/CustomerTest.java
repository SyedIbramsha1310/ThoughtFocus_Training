package com.thoughtfocus.customerdetails;

public class CustomerTest {
	public static void main(String args[]){
		Customer customer=new Customer();
		customer.product("A");
		customer.printing();
		customer.customerDetails(null, 0, null, null);
	}

}
