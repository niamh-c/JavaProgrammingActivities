package practical2;
import java.util.Scanner;
public class CheckCoordinates {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the x-value of the coordinate: ");
		double x=input.nextDouble();
		System.out.println("Please input the y-value of the coordinate: ");
		double y=input.nextDouble();
		input.close();
		if ((x==10 || x==-10) && (y==-5 || y==5)) {
			System.out.println("The point is on the perimeter");
		}
		else if ((x<=10 && x>=-10) && (y<=5 && y>=-5)){
			System.out.println("The point is inside the rectangle");
		}
		else {
			System.out.println("The point is outside of the rectangle");
		}
	}
	

}
