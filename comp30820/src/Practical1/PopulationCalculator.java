package Practical1;
import java.util.Scanner;

public class PopulationCalculator {
	public static void main(String[] args) {
		Scanner popInput=new Scanner(System.in);
		System.out.println("Input number of years: ");
		popInput.close();
		int years=popInput.nextInt();
		int yearsInSec=years*365*24*60*60;
		int population=312032486+(yearsInSec/7)-(yearsInSec/13)+(yearsInSec/45);
		System.out.println("The population will be: "+population);
		
	}

}
