import java.util.Scanner;

public class bank {
	
	public static double money = 0;
	public static double d = 0;
	public static double w = 0;
	
	public static void main(String[] agrs){
				

		Scanner input = new Scanner(System.in);		
		boolean isContinue = false;
		String choice = "";
		
		do{
			System.out.println("Welcom to Universal Bank");
			System.out.println("Enter D for deposit, W for withdrawal and B for balance.");
			String x = (input.next());
			
			if (x.equalsIgnoreCase("d")){
				System.out.println("Please Enter the amount money you want to deposit.");
				Scanner deposite = new Scanner(System.in);		
				d = (deposite.nextDouble());
				deposit();
			}else if (x.equalsIgnoreCase("w")){
				System.out.println("Please Enter the amount money you want to withdrawal.");
				Scanner withdrawal = new Scanner(System.in);		
				w = (withdrawal.nextDouble());
				withdrawal();			
			}else if (x.equalsIgnoreCase("b")){
				System.out.println("Your current balance is: $" + money);
			}else{
				System.out.println("Your enter is invalid.");
			}
			System.out.println("Do you wish to countinue? (Y/N)");
			choice = (input.next());
			if (choice.equalsIgnoreCase("Y")){
				isContinue = true;
			}
			else if(choice.equalsIgnoreCase("N")){
				isContinue = false;
			}
			else{
				System.out.println("Your enter is invalid.");
			}
		}while (isContinue == (true));
	}
	public static void deposit(){
		if(d > 0){
			money += d;
			System.out.println("You have deposite $" + d + ".");
			System.out.println("Your current balance is :$"+money);
		}
		else {
			System.out.println("Your enter is invalid.");
		}
	}
	public static void withdrawal(){
		if(w > money){
			System.out.println("Your don't have enough money to withdrawal.");	
			System.out.println("Your current balance is: $" + money);
		}else if(w <= money){
			System.out.println("You have withdrawal $"+ w + ".");
			System.out.println("Your current balance is: $" + money);
		}else{
			System.out.println("Your enter is invalid.");
		}
	}
}
