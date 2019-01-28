package Practical1;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a 3-digit number: ");
		int number=input.nextInt();
		input.close();
		int unit=number%10;
		int tens=(number%100-unit)/10;
		int hundred=(number-tens-unit)/100;
		int add=hundred+tens+unit;
		System.out.println("The addition of digits is "+add);
	}

}
