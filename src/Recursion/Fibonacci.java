package Recursion;
import java.util.Scanner;
public class Fibonacci {
	static int a=0;
	static int b=1;
	static void Fibo(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
		Fibo(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println("The Fibonacci Series");
		Fibo(n);
	}
}
