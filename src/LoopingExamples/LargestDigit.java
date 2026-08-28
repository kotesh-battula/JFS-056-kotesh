package LoopingExamples;
import java.util.Scanner;
public class LargestDigit {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int digit=Integer.MIN_VALUE;
			while(num>0)
			{
				int rem=num%10;
				if(rem>digit)
				{
					digit=rem;
				}
				num=num/10;
			}
			System.out.print(digit+" is the longest digit in this ");
		}
}