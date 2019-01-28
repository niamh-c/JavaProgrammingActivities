package Practical1;
import java.util.Scanner;

public class CylinderArea {
	public static void main(String[] arg) {
		//Scanner object
		Scanner cyclinder = new Scanner(System.in);
		//User input
		System.out.println("Please input the radius: ");
		double radius=cyclinder.nextDouble();
		System.out.println("Please input the length: ");
		double length=cyclinder.nextDouble();
		double area=Math.PI*(Math.pow(radius, 2));
		double volume=area*length;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
	}

}
