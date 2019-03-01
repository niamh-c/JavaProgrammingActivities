package practical2;
import java.util.Scanner;
public class ChangeToHex {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter an integer between 0 and 15");
	int num=input.nextInt();
	input.close();
	if (num<0 || num>15) {
		System.out.println("Your number is not within the given range");
	}
	else {
		String hex = Integer.toHexString(num);
		System.out.println(hex);
	}
	}
}
