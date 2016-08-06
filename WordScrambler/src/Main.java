import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main (String[] args){
		
		ArrayList<Integer> usedElement = new ArrayList<Integer>();
		ArrayList<String> encryptedWords = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String word = "";
		String encryptedWord = "";
		String[] allWords;
				
		System.out.println("Enter a sentence to scramble: ");
		word = input.nextLine();
			
		allWords = word.split(" ");
		
		int randNum = 0;
		
		for (int i = 0; i < allWords.length; i++){
			
			usedElement.clear();
			encryptedWord = "";
			
			for (int x = 0; x < allWords[i].length(); x++){
			randNum = (int) Math.floor(Math.random() * allWords[i].length());			
			
				while (usedElement.contains(randNum)){				
					randNum = (int) Math.floor(Math.random() * allWords[i].length());				
				}			
				
			encryptedWord += allWords[i].charAt(randNum);					
			usedElement.add(randNum);
			}

			encryptedWords.add(encryptedWord);	
		}
		
		encryptedWord = "";
		
		for (int i = 0 ; i < encryptedWords.size(); ++i){
			encryptedWord += encryptedWords.get(i);
			encryptedWord += " ";
		}
		System.out.println("Your EncryptedWord is :" + encryptedWord);
		
	}
}