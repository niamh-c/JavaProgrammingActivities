package Practical1;
import java.util.Scanner;
public class Distance {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input your first point(x1 value)");
		double x1=input.nextDouble();
		System.out.println("Please input your first point(y1 value)");
		double y1=input.nextDouble();
		System.out.println("Please input your second point(x2 value)");
		double x2=input.nextDouble();
		System.out.println("Please input your second point(y2 value)");
		double y2=input.nextDouble();
		input.close();
		double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("The distance is: "+distance);
	}
	

}
