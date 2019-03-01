package practical4;

public class PerfectNumber {

	public static void main(String[] args) {
		int count=0;
		for (int i=0; count<4; i++) {
			if (isPerfectNumber(i)) {
				System.out.println(i+ " is a perfect number.");
				count++;
			}
		}

	}
	public static boolean isPerfectNumber(int number) {
		int sum=1;
		for (int j=2; j<=number/2; j++) {
			if (number%j==0) {
				sum+=j;
			}
		}
		if (sum==number) {
			return true;
		}
		return false;
	}
}
