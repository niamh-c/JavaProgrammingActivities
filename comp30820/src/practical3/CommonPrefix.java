package practical3;
import java.util.Scanner;
public class CommonPrefix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first word: ");
		String word1=input.nextLine();
		System.out.println("Please enter your second word: ");
		String word2=input.nextLine();
		input.close();
		int len=Math.min(word1.length(), word2.length());
		String output="";
		for(int i=0; i<len; i++) {
			if (word1.charAt(i)==word2.charAt(i)) {
				output+=word1.charAt(i);
			}
			else {
				break;
			}
			
		}
		if (output.length()==0) {
			System.out.println("There is no common prefix");
		}
		else {
			System.out.println("The common prefix is "+output);
		}
		
	}

}
