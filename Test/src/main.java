import java.util.Scanner;

public class main {

	public static void main (String[] args){
		int n;
		int x;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number that you want to factorial.");
		n = input.nextInt();
		x = factorial(n);
		System.out.println("The factorial of "+ n +" is "+ x +".");
		
	}
	public static int factorial(int n){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
}
