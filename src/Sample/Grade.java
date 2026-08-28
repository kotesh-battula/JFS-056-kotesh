package Sample;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a grade");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'A','a':System.out.print("Excellent");break;
		case 'B','b':System.out.print("Very Good");break;
		case 'C','c':System.out.print("Good");break;
		case 'D','d':System.out.print("Needs Improvement");break;
		case 'E','e':System.out.print("Justt Pass");break;
		case 'F','f':System.out.print("Failed");break;
		default:System.out.print("Inavlid input");
		}
	}
}
