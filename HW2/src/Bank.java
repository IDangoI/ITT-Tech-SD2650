import java.util.Scanner;

public class Bank {
	
	public static double money = 0;
	public static double d = 0;
	public static double w = 0;
	
	public static void main(String[] args){
		

		
		do{
			System.out.println("Welcom to Universal Bank");
			System.out.println("Enter D for deposit, W for withdrow and B for balance.");
			Scanner input = new Scanner(System.in);		
			String x = (input.next());
			
			switch(x){
			
				case "D":			System.out.println("Please Enter the amount money you want to deposit.");
				Scanner deposite = new Scanner(System.in);		
				d = (deposite.nextDouble());
				deposit();
				break;
				
				case "W":
					
			}while();
			}
		}

		public static void deposit(){
			if(d > 0){
				money += d;
				System.out.println("You have deposite $" + d + ".");
				System.out.println("Your current balance is :$"+money);
			}
			else {
				System.out.println("Your enter is invaild.");
			}
		}
		public static void withdrow(){
			if(w > money){
				System.out.print("Your don't have enough money to withdrow.");	
				System.out.println("Your current balance is: $" + money);
			}else if(w <= money){
				System.out.println("You have withdrow $"+ w + ".");
				System.out.println("Your current balance is: $" + money);
			}else{
				System.out.println("Your enter is invaild.");
			}
	}
}
