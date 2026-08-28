package Sample;
import java.util.Scanner;

public class Increment {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.print(age>18?"Eligible":"Not Eligible");
	}
}




