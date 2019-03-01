package practical4;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word to check: ");
		String word=input.nextLine();
		if (isPalindrome(word)) {
			System.out.println(word+" is a palindrome.");
		}
		else {
			System.out.println(word+" is not a palindrome.");
		}
	}
	
	public static boolean isPalindrome(String str) {
		for(int i=0; i<str.length()/2;i++) {
			char a=str.charAt(i);
			char b=str.charAt(str.length()-1-i);
			if (a!=b) {
				return false;
			}
		}
		return true;
	}
}
