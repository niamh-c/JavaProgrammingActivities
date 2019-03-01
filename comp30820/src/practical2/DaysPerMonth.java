package practical2;
import java.util.Scanner;
public class DaysPerMonth {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the year: ");
		int year=input.nextInt();
		System.out.println("Please enter the first three letters of the month(First letter capitalised): ");
		String month=input.next();
		input.close();
		char m=month.charAt(0);
		char m1=month.charAt(1);
		char m2=month.charAt(2);
		int len=month.length();
		if ((len==3)&&(m>='A'&& m<='Z')&&(m1>='a' && m1<='z')&&(m2>='a' && m2<='z')) {
		switch (month) {
		case "Sep": 
		case "Apr":
		case "Jun":
		case "Nov": System.out.println("In the year "+year+" ,this month has 30 days");break;
		case "Feb": if(year%4==0&&year%100!=0 || year/400==0) 
					{System.out.println("In the year "+year+" ,this month has 29 days");break;}
					else {System.out.println("In the year "+year+" ,this month has 28 days");break;}
		default: System.out.println("In the year "+year+" ,this month has 31 days");		
						}}
	}}
