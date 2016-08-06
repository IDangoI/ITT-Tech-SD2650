package com.universalbank.contact;

public class Employee {
	
	String empCode;
	String empName;
	String empAddress;
	long empPhone;
	String empEmail;
	
	public void getEmployee(){
		
		empCode = "00001";
		empName = "John";
		empAddress = "123 Main St, New York NY 12345";
		empPhone = 8888888888l;
		empEmail = "john@email.com";
		
		
	}
	
	public void displayEmployee(){
		System.out.println("Employee name: \t" + empName);
		System.out.println("\t Code: \t" + empCode);
		System.out.println("Adress: " + empAddress);
		System.out.println("Phone: \t" + empPhone);
		System.out.println("Email: \t" + empEmail);
	}
}
