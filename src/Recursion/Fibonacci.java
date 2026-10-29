package Recursion;

public class Fibonacci {
	public static void fib(int n,int a,int b)
	{
		if(n==0)
			return ;
		System.out.print(a+" ");
		fib(n-1,b,a+b);
	}
	public static void main(String[] args)
	{
		fib(7,0,1);
	}
}
