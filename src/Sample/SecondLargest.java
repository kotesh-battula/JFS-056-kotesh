package Sample;
import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if((a>b && a<c) || (a<b && a>c))
	{
	System.out.print("Second Biggest Number is: "+a);
	}
	else if((b>c && b<a) || (b<c && b>a))
	{
	System.out.print("Second Biggest Number is: "+b);
	}
	else
	{
	System.out.print("Second Biggest Number is: "+c);
	}
	}
}
