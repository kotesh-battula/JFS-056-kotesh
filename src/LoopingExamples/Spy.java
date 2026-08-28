package LoopingExamples;
import java.util.Scanner;
public class Spy {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int add=0;
		int mul=1;
		while(num>0)
		{
			int rem=num%10;
			add+=rem;
			mul*=rem;
			num/=10;
		}
		System.out.print(add==mul?"SPY Number":"Not a SPY Number");
	}

}
