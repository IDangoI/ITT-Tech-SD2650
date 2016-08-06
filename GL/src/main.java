import java.util.Scanner;
import java.util.ArrayList;


public class main {
	
	public static void main (String[] args){
				
		ArrayList<String> usedLetter = new ArrayList<String>();
		
		String secretWord = "";
		String hint = "";
		String dWord = "";
		int right = -1;
		int tries = 6;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Hang man!");
		System.out.println("Player 1, please enter the secret word:");
		secretWord = sc.nextLine();
		System.out.println("Player 1, please enter the hint for this word:");
		hint = sc.nextLine();
		
		for (int i = 0; i < secretWord.length();i++){
			dWord += "*";
		}
		
		System.out.println("Player2, please guess the word. You can enter the whole word. Otherwise, it will use the first letter as your guess.");
		char[] dWordChar = dWord.toCharArray(); 
		
		for (tries = 0; tries < 6;tries++){
			
			String theGuess = sc.next();
			char guess = theGuess.charAt(0);
			
			if(theGuess.equals(secretWord)){
				System.out.println("You are correct! The word is " + secretWord);
				break;
			}
			if (secretWord.charAt(tries) == guess){
				System.out.println("This is one of the letter.");
				for (int x = secretWord.indexOf(guess); x >=0; x = secretWord.indexOf(guess, x +1)){
					usedLetter.add(String.valueOf(guess));
					dWordChar[x] = guess;	
					System.out.println(x);
				}

			}else{
				System.out.println("That is not the correct the letter. please try again");
				tries -= 1;
			}			
			System.out.println(guess);
			System.out.println(dWordChar);
			System.out.println(tries);
		}		
	}
}
