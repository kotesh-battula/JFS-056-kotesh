package Sorting;

import java.util.Scanner;

public class CheckPower {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0 && (n&n-1)==0)
		{
			System.out.print("Yes, it is a power of 2");
		}
		else
		{
			System.out.print("No, it is not a power of 2");
		}
	}
}
