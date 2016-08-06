import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main (String[] args){
		
		Scanner cinput = new Scanner(System.in);
		String fileName ="";
		
		System.out.println("Enter your first name: ");
		fileName = cinput.nextLine();
		
		File file = new File (fileName + ".txt");
		
		try{
			file.createNewFile();
			BufferedWriter fout = new BufferedWriter (new FileWriter(file.toString()));
			//FileWriter fout = new FileWriter(file.toString());
			fout.write("First Name: "+fileName);
			System.out.println("Please enter your last name: ");
			fout.newLine();
			fout.write("Last Name:" + cinput.nextLine());
			System.out.println("Please enter your mid name. Press enter if there is none");
			fout.newLine();
			fout.write("Mid Name: " + cinput.nextLine());
			System.out.println("Please enter your address: ");
			fout.newLine();
			fout.write("Street: "+ cinput.nextLine());
			System.out.println("Please enter your city: ");
			fout.newLine();
			fout.write("City: "+ cinput.nextLine());
			System.out.println("Please enter your state: ");
			fout.newLine();
			fout.write("State: "+ cinput.nextLine());
			System.out.println("Please enter your country: ");
			fout.newLine();
			fout.write("Country: "+ cinput.nextLine());
			System.out.println("Please enter your E-mail: ");
			fout.newLine();
			fout.write("E-mail: "+ cinput.nextLine());
			System.out.println("Please selecet one item: A for apple, B for banana");
			String x = cinput.nextLine();
			if (x.equalsIgnoreCase("a")){
				System.out.println("You select Apple. The price is $5.");
				fout.newLine();
				fout.write("Item: Apple");
				fout.newLine();
				fout.write("Price: $5");
			}else if (x.equalsIgnoreCase("B")){
				System.out.println("You select Banana. The price is $6.");
				fout.newLine();
				fout.write("Item: Banana");
				fout.write("Price : $6");
			}
			
			fout.close();
			}
			catch(IOException e){			
				System.err.println(e.getMessage());			
			}
	}
}
