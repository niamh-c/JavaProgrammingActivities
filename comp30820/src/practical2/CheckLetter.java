package practical2;
import java.util.Scanner;
public class CheckLetter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a lowercase or uppercase letter: ");
		char letter=input.next().charAt(0);
		input.close();
		if ((letter>'a' && letter<'z')||(letter>'A' && letter<'Z')) {
			if(letter=='a'|| letter=='e'||letter=='i'||letter=='o'||letter=='u') {
				System.out.println("The letter you entered is a vowel");
			}
			else if(letter=='A'|| letter=='E'||letter=='I'||letter=='O'||letter=='U') {
				System.out.println("The letter you entered is a vowel");
			}
			else {
				System.out.println("The letter you entered is a consonant");
			}
		}
		else {
			System.out.println("The character you entered isn't a letter");
		}
	}

}
