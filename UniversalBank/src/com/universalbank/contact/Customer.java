package com.universalbank.contact;

public class Customer {

	String custId;
	String custName;
	String custAddress;
	long custPhone;
	String custEmail;
	
	public void getCustomer(){
		
		custId = "0001";
		custName = "Jack";
		custAddress = "111 Main St, New York, NY 11111";
		custPhone = 1234567890l;
		custEmail = "jack@email.com";

	}
	
	public void displayCustomer(){
		
		System.out.println("Customer Name: " + custName);
		System.out.println("Customer ID: \t" + custId);
		System.out.println("Address: " + custAddress);
		System.out.println("Phone: \t" + custPhone);
		System.out.println("Email: \t" + custEmail);
	}
}
