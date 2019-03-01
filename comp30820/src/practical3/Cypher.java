package practical3;
import java.util.Scanner;
public class Cypher {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word=input.nextLine();
		input.close();
		int len=word.length();
		String output="";
		for (int i=0; i<len; i++) {
			char ch=word.charAt(i);
			if (ch>='a' && ch<'z') {
				ch+=1;
			}
			else if (ch=='z') {
				ch='a';
			}
			output+=ch;
		}
		System.out.println("The cypher is "+output);
	}

}
