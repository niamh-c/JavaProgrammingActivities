package practical3;
import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int no=input.nextInt();
		input.close();
		for (int i=no; i>=0; i--) {
			for(int j=1;j<=no;j++) {
				if (j<=i) {
					System.out.print(j+" ");
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.println();
		}
}}