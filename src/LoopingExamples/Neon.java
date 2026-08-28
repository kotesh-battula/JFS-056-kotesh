package LoopingExamples;
import java.util.Scanner;
public class Neon {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int mul=num*num;
		int sum=0;
		while(mul>0)
		{
			int rem=mul%10;
			sum+=rem;
			mul/=10;
		}
		System.out.print(sum==num?"Neon number":"Not a neon number");
	}
}
