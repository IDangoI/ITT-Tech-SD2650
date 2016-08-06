import java.util.Scanner;

public class year_converter {
	
	public static double day( double year){
		
		return(year * 365.25) ;
	
	}
	
	public static double hour( double year){
		
		return(year * 365.25 * 24);
	
	}
	
	public static double min( double year){
		
		return(year * 365.25 * 24 *60);
	
	}
	
	public static double sec( double year){
		
		return(year * 365.25 * 24 *60 * 60);
	
	}
	
	public static double ms( double year){
		
		return (year * 365.25 * 24 *60 * 60 * 1000);
	
	}
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);		
		
		double year		= 0;
		double day		= 0;
		double hour		= 0;
		double min		= 0;
		double sec		= 0;
		double ms		= 0;
		
		System.out.print("Enter number of years: ");
		year = scan.nextDouble();
		
		System.out.println( year +" converted to day(s) is : " + day(year));
		System.out.println( year +" converted to hour(s) is : " + hour(year));		
		System.out.println( year +" converted to min(s) is : " + min(year));
		System.out.println( year +" converted to sec(s) is : " + sec(year));
		System.out.println( year +" converted to ms(s) is : " + ms(year));
	}

}
