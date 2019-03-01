package practical3;
import java.util.Scanner;
public class SwitchLetters {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence=input.nextLine();
		input.close();
		int len=sentence.length();
		String output="";
		for (int i=len-1; i>=0; i--) {
			char ch=sentence.charAt(i);
			output+=ch;
		}
		System.out.println(output);
	}

}
