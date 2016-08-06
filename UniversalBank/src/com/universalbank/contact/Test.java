package com.universalbank.contact;

public class Test {
	
	
	public static void main(String[] args){

		System.out.println("----This is Account info----");
		Account acct = new Account();
		acct.getAccount();
		acct.displayAccount();
		System.out.println("");
		
		System.out.println("----This is Employee info----");
		Employee emp = new Employee();
		emp.getEmployee();
		emp.displayEmployee();
		System.out.println("");
		
		System.out.println("----This is Customer info----");
		Customer cust = new Customer();
		cust.getCustomer();
		cust.displayCustomer();
		System.out.println("");
		
		System.out.println("----This is Branch info----");
		Branch branch = new Branch();
		branch.getBranch();
		branch.displayBranch();
	}
}
