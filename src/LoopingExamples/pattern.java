package LoopingExamples;
import java.util.Scanner;
public class pattern {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int k=i*10+1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

}
