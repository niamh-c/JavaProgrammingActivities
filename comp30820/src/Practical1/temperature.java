package Practical1;
import java.util.Scanner;
public class temperature {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a temperature between −58◦F and 41◦F:");
		double temp=input.nextDouble();
		System.out.println("Please enter a a wind speed greater than or equal to 2:");
		double wind=input.nextDouble();
		input.close();
		double v=Math.pow(wind, .16);
		double windChill=35.74+(.6215*temp)-(v*35.75)+(.4275*temp*v);
		System.out.println("The wind chill is:"+windChill);
	}

}
