package Practical1;

import java.util.Scanner;

public class DistanceDriving {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is the distance: ");
		double distance=input.nextDouble();
		System.out.println("What is the fuel efficency of the car(in miles per gallon): ");
		double fuel=input.nextDouble();
		System.out.println("What is the price per gallon: ");
		double price=input.nextDouble();
		input.close();
		double cost=distance/fuel*price;
		System.out.println("The cost of your trip is "+cost);
	}

}
