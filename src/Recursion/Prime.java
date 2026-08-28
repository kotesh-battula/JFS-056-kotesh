package Recursion;
import java.util.Scanner;
public class Prime {
	static Boolean primeOrNot(int n,int d)
	{
		if(n==d)
		{
			return true;
		}
		if(n%d==0)
		{
			return false;
		}
		return primeOrNot(n,d+1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(primeOrNot(n,d)==true?"Prime":"Not a Prime");	
	}
}
