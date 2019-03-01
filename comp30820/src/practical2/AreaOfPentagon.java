package practical2;
import java.util.Scanner;
public class AreaOfPentagon {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the radius from the center point to the vertex of the pentagon:");
		double radius=input.nextDouble();
		input.close();
		if (radius<=0) {
			System.out.println("The radius must be greater than 0");
		}
		else {
			double s=2*radius*(Math.sin(Math.PI/5));
			double area=(5*(Math.pow(s, 2)))/(4*(Math.tan(Math.PI/5)));
			System.out.println("The area is "+area);
		}
	}

}
