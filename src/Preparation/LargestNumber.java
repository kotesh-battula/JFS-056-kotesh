package Preparation;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.print(a+" is Biggest Number");
		}
		else if(b>c)
		{
			System.out.print(b+" is Biggest Number");
		}
		else
		{
			System.out.print(c+" is Biggest Number");
		}
	}

}
