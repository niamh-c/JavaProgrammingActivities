package practical2;
import java.util.Scanner;
public class perimeter_of_triangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the length of the first side in cm:");
		double len1=input.nextDouble();
		System.out.println("Please enter the length of the second side in cm:");
		double len2=input.nextDouble();
		System.out.println("Please enter the length of the thirdside in cm:");
		double len3=input.nextDouble();
		input.close();
		if (len1+len2>len3 && len1+len3>len2 && len2+len3>len1) {
			double per=len1+len2+len3;
			System.out.println("The perimeter is "+per);
		} 
		else {
			System.out.println("Your inputs are invalid");
		}
	}

}
