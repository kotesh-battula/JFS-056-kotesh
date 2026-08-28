package LoopingExamples;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int res=0;
		while(num>0)
		{
			int rem=num%10;
			res=res+(rem*rem*rem);
			num/=10;
		}
		System.out.print(res==num1?"Armstrong":"Not a armstrong");
	}

}
