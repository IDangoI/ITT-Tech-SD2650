import java.util.Scanner;

public final class Lab1_1 {
	
	public static void main( String[] args){
		
		int num = 0;
		
		Scanner input = (new Scanner (System.in));
		
		for(int i = 0; i< (5); ++i) {
			
			System.out.print("Enter a number: ");
			num = (input.nextInt());
			System.out.print("The number you entered is " );
			if(num % 2 == (0)){
				System.out.print("even");
				
			}else{
				System.out.print("odd");
			}
			
			System.out.print(" and your number is ");
			if (num < 0){
				System.out.println("negitive.");
			}else{
				System.out.println("positive.");
			}
		}
	}
}
