package practical3;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int no=input.nextInt();
		input.close();
		for (int i=no; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}