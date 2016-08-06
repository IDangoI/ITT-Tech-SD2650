import java.util.Scanner;

public class grade {
	
	public static void main (String[] args){
		
		double x = 0;
		int i = 0;
		
		for (i = 1; i < 25;i++){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the percentages of grade here: ");
			x = (scan.nextDouble());
			
			if (x >= 90 && x <= 100){
				System.out.println("The grade is A.");;
			}else if(x >= 80 && x < 90){
				System.out.println("The grade is B.");
			}else if(x >= 70 && x < 80){
				System.out.println("The grade is C.");
			}else if(x >= 60 && x < 70){
				System.out.println("The grade is D.");
			}else if(x >= 0 && x < 60){
				System.out.println("The grade is F.");
			}else{
				System.out.println("Error");
			}					
		}
	}

}
