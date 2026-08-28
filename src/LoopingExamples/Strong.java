package LoopingExamples;
import java.util.Scanner;
public class Strong {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int val=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				val*=i;
			}
			sum+=val;
			num/=10;
		}
		System.out.print(num1==sum?"Strong number":"Not a strong number");
	}

}
