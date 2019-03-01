package practical5;
import java.util.Scanner;

public class Consecutive_four {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number of values you wish to check");
		int[] arr=new int[input.nextInt()];
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter number "+(i+1));
			arr[i]=input.nextInt();
		}
		input.close();
		if (isConsecutiveFour(arr)){
			System.out.println("There are 4 consecutive numbers");
		}
		else {
			System.out.println("There are no 4 consecutive numbers");
		}
		
	}
	public static boolean isConsecutiveFour(int[] values) {
		if (values.length<4) {
			return false;
		}
		int count=0;
		for (int i=0; i<(values.length-1); i++) {
			if (values[i]==values[i+1]) {
				count+=1;
			}
			else {
				count=0;
			}
			if (count==3) {
				return true;
			}
		}
		return false;
	}

}
