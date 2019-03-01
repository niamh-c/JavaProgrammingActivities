package practical4;
import java.util.Scanner;
public class CreditCard {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your credit card number:");
		String cnum=input.nextLine();
		input.close();
		cnum=cnum.replace(" ", "");
		cnum=cnum.replace("/", "");
		cnum=cnum.replace("-", "");
		if (isValidNumber(cnum)) {
			System.out.println("This is a valid card");
		}
		else {
			System.out.println("This is not a valid card");
		}
		

	}
	// Return true if the card number is valid
	public static boolean isValidNumber(String number) {
		if (hasValidLength(number)&&hasValidPrefix(number)&&satisfiesMod10Check(number)) {
			return true;
		}
		else {
			System.out.println("3 checks");
			return false;
			
		}
	}
	// Return true if the card number has between 13 and 16 digits
	public static boolean hasValidLength(String number) {
		if (number.length()>=13 && number.length()<=16) {
			return true;
		}
		else {
			System.out.println("Your card has the wrong number of digits");
			return false;
		}
	}
	// Return true if the card number has a valid prefix
	public static boolean hasValidPrefix(String number) {
		char a=number.charAt(0);
		char b=number.charAt(1);
		if (a=='4' || a=='6' || a=='5' || (a=='3'&&b=='7'))
		{
			return true;
		}
		else {
			System.out.println("Your card begins with an incorrect number");
			return false;
		}
	}
	// Return true if the Mod 10 check is satisfied
	public static boolean satisfiesMod10Check(String number) {	
		int x=sumOfDoubleEvenPlace(number);
		int y=sumOfOddPlace(number);
		if ((x+y)%10==0) {
			return true;
		}
		else {
			System.out.println("Luhn Check is invalid!!!!");
			return false;
		}
	}
	// Double every second digit from right to left and return sum
	public static int sumOfDoubleEvenPlace(String number) {
		int sum=0;
		for (int i=0; i<number.length(); i+=2) {
			int no=(number.charAt(i)-48)*2;
			if(no<10) {
				sum+=no;
			}
			else {
				sum+=getSumDigits(no);
			}
		}
		return sum;
	}
	
	// Return sum of digits in odd places from right to left
	public static int sumOfOddPlace(String number) {
		int sum=0;
		for (int i=1; i<number.length(); i+=2) {
			sum+=(number.charAt(i)-48);
		}
		return sum;
	}
	
	// Return this number if it is a single digit;
	// otherwise return the sum of the two digits
	public static int getSumDigits(int number){
		int remain=number%10;
		number=1+remain;
		return number;
	}

}
