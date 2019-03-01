package practical3;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int no=input.nextInt();
		input.close();
		for (int i=1; i<=no; i++) {
			for(int j=6;j>=i;j--) {
				if (j<=i) {
				while (j>0) {
					System.out.print(j+" ");
					j--;
				}
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.println();
		}
}}
