package practical5;
import java.util.Scanner;

public class PairwiseDistance {
	public static void main(String[] args) {
		double[][] arr=create();
		display(arr);
		double[][] matrix=distancearray(arr);
		displaymatrix(matrix);
		
	}
	public static double[][] create() {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number of points you would like to check");
		double[][] arr=new double[input.nextInt()][2];
		for (int i=0; i<arr.length; i++) {
			System.out.println("Please enter the x value of point "+i);
			arr[i][0]=input.nextDouble();
			System.out.println("Please enter the y value of point "+i);
			arr[i][1]=input.nextDouble();
		}
		input.close();
		return arr;
	}
	
	public static void display(double[][] arr) {
		System.out.println("Points");
		for (int i=0; i<arr.length; i++) {
			System.out.printf("Point %d: (%f , %f)", i+1, arr[i][0], arr[i][1]);
			System.out.println();
		}
		System.out.println();
	}
	
	public static double distance(double[] point1, double[] point2) {
		double x=Math.pow((point2[0]-point1[0]), 2);
		double y=Math.pow((point2[1]-point1[1]), 2);
		return Math.sqrt(x+y);
	}
	
	public static double[][] distancearray(double[][] arr){
		double[][] matrix=new double[arr.length][arr.length];
		for (int row=0; row<arr.length; row++) {
			for (int col=0; col<arr.length; col++) {
				matrix[row][col]=distance(arr[row], arr[col]);
			}
		}
		return matrix;
	}
	public static void displaymatrix(double[][] arr) {
		System.out.println("Distances:");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.printf("%.2f  " , arr[i][j]);
		}
			System.out.println();
		}
	}
	
	
	
	
	
}
