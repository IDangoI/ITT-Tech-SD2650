import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main (String[] args){
		
		Scanner cinput = new Scanner(System.in);
		String fileName;
		String fileLine;
		
		try {
			
//			System.out.print("Enter filename to read from: ");
//			fileName = cinput.nextLine();
			
			File file = new File("C:\\Users\\student\\workspace\\FileOutput\\Ren");
			
			if (!file.exists()){
				
				throw new IOException ("File does not exist!");
			}
			
			FileReader fr = new FileReader(file.toString());
			BufferedReader br = new BufferedReader(fr);
			
			while( ( fileLine = br.readLine() ) != null){
				//System.out.println(fileLine);
				
				if (fileLine .contains("String here")){
					System.out.println("String found");
				}
			}
			br.close();
		}
		
		catch (IOException e){
			
			System.err.println("Execption: "+ e.getMessage());
			e.printStackTrace();
		}
	}
}
