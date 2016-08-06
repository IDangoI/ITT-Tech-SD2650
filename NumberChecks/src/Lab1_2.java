import java.util.Scanner;
public class Lab1_2 {
	
	public static void main (String[] args){
		
		Scanner input = (new Scanner (System.in));
		
		double avg = 0;
		double sum = 0;
		double num = 0;
		double min = 99999;
		double max = -99999;
		double i = (0);
		for (int O =(0); i < (5); ++i){
			System.out.print("Enter a number:");
			num = (input.nextDouble());
					
			sum +=(num);
			
			if (num > max){
				max = num;
			}
			if (num < min){
				min = num;
			}
		}
		avg = (sum/i);
		
		System.out.println("Cnt:\t" + i);
		System.out.println("Sum:\t" + sum);
		System.out.println("Avg:\t" + avg);
		System.out.println("Max:\t" + max);
		System.out.println("Min:\t" + min);
		
	}
}
