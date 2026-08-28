package ArraysExamples;
import java.util.Scanner;
public class LCM {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a=n1;
		int b=n2;
		while(n2>0)
		{
			int c=n1%n2;
			n1=n2;
			n2=c;
		}
		int gcd=n1;
		System.out.println(gcd);
		int lcm=(a*b)/gcd;
		System.out.print(lcm);
	}

}
