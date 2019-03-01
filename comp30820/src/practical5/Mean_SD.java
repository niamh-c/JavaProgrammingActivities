package practical5;
import java.util.Scanner;
public class Mean_SD {
	
		public static void main(String[] arg) {
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter the amount of numbers you wish to use.");
			int length=input.nextInt();
			double[] arr=new double[length];
			for (int i=0; i<length; i++) {
				System.out.println("Please enter number"+(i+1));
				arr[i]=input.nextDouble();
			}
			input.close();
			double mean=average(arr);
			System.out.println(mean);
			System.out.println(SD(arr, mean));
		}
		public static double average(double[] arr) {
			double sum=0;
			for (int i=0; i<arr.length; i++) {
				sum+=arr[i];
			}
			sum=sum/arr.length;
			return sum;
		}
		public static double SD(double[] arr, double mean) {
			double sum=0;
			double length=arr.length-1;
			for (int i=0; i<arr.length; i++) {
				sum+=Math.pow(arr[i]-mean, 2);
			}
			double sd=Math.sqrt(sum/length);
			return sd;
		}
}
