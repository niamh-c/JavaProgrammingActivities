package practical3;
import java.util.Scanner;
public class CountLetters {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word=input.nextLine();
		input.close();
		word=word.toLowerCase();
		int chlen=word.length();
		int vcount=0;
		int ccount=0;
		for (int i=0; i<chlen; i++) {
			char ch=word.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ) {
				vcount+=1;
			}
			else if (ch>'a'&& ch <='z')
				ccount+=1;
			}
		System.out.println("The number of vowels is "+vcount+".");
		System.out.println("The number of consonants is "+ccount+".");
		}
}
