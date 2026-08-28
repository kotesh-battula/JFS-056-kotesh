package Sample;
import java.util.Scanner;
public class Vote {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		System.out.print(marks>=75?"Pass":"Fail");
	}
}
