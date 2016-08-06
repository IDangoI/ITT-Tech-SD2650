import java.util.ArrayList;

public class Practice {
	
	public static void main(String[] args){
		 
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		int randNum = (int)Math.floor(Math.random()*9);
		int userNum = 0;		
		int i = 0;
		
		for (i = 0; i<10; ++i){
			
			userNum = (int)Math.floor(Math.random()*9);	
			
			if(userNum == randNum){
				System.out.println("You are a winner!!");
				break;				
			}
		}
		System.out.println("Number of tries: " + (i+1));
		
	}
}
