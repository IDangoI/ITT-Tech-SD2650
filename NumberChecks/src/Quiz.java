import java.util.Scanner;

class Employee{
	int empCode;
	String empName;
	char empAddress;
	int empPhone;
	char empEmail;
	
	public void getEmployee(){
		System.out.println("Please Enter the employee's Code");
		Scanner scan = new Scanner(System.in);
		empCode = scan.nextInt();
		
	}
	public void displayEmployee(int empCode){
		System.out.println("The employee name is " + empName);
		System.out.println("Employee Code: " + empCode);
		System.out.println("Phone Number: " + empPhone);
		System.out.println("Address: " + empAddress);
		System.out.println("Email: " + empEmail);
		
	}
}
class Branch{
	int branchCode;
	char branchAddress;
	char country;
	
	public void getBranch(){
		
	}
	
	public void displayBranch(){
		
	}
}