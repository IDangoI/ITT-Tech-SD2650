package com.universalbank.contact;

public class Account {
	
	int acctNo;
	String acctType;
	String acctStatus;
	double acctBalance;
	
	public void getAccount(){
		acctNo = 123456789;
		acctType = "Saving";
		acctStatus = "Vaild";
		acctBalance = 1000.00;
	}
	
	public void displayAccount(){
		System.out.println("Account number: " + acctNo);
		System.out.println("Account type: \t" + acctType);
		System.out.println("Status: \t" + acctStatus);
		System.out.println("Balance: \t" + acctBalance);		
	}
}
