package practical4;
public class PrimeNumbers {

	public static void main(String[] args) {
		int count=0;
		for (int j=1; count<10; j++) {
			if (isPrime(j)) {
				System.out.println(j+" is a prime number.");
				count++;
			}
		}

	}
	public static boolean isPrime(int number) {
		for (int i=2; i<=number/2; i++) {
			if (number%i==0) {
				return false;
			}
			}
		return true;
		}
	}
