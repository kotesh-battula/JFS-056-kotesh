package LoopingExamples;
import java.util.Scanner;
public class Binaryconversion {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String res="";
		while(num>0)
		{
			res=(num%2)+res;
			num/=2;
		}
		System.out.print(res);
	}

}
