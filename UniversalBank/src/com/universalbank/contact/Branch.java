package com.universalbank.contact;

public class Branch {

	String branchCode;
	String branchAddress;
	String country;
	
	public void getBranch(){
		branchCode = "0002";
		branchAddress = "1001 Main St. New York, NY 55555";
		country = "USA";
	}
	
	public void displayBranch(){
		
		System.out.println("Branch Code is: " + branchCode);
		System.out.println("Address: " + branchAddress);
		System.out.println("Country: " + country);
	}
}
