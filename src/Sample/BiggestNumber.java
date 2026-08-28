package Sample;
import java.util.Scanner;
public class BiggestNumber {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Three Numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b && a>c)
	{
	System.out.print("Biggest Number is: "+a);
	}
	else if(b>c)
	{
	System.out.print("Biggest Number is: "+b);
	}
	else
	{
	System.out.print("Biggest Number is: "+c);
	}
	}

}
