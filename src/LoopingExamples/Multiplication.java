package LoopingExamples;
import java.util.Scanner;
public class Multiplication {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int limit=sc.nextInt();
			for(int i=1;i<=limit;i++)
			{
				System.out.println(num+"*"+i+"="+num*i);
			}
		}
}
