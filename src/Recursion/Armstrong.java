package Recursion;
import java.util.Scanner;
public class Armstrong {
	static int res;
	public static void arm(int n)
	{
		if(n==0)
		{
			return;
		}
		res+=(n%10)*(n%10)*(n%10);
		arm(n/10);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arm(n);
		System.out.print(res==n?"Armstrong":"Not a Armstrong");
	}
}
