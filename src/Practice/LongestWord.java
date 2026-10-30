package Practice;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String s1="";
		int max=0;
		for(String k:arr)
		{
			if(k.length()>max)
			{
				s1=k;
				max=k.length();
			}
		}
		System.out.print(s1);
	}
}
