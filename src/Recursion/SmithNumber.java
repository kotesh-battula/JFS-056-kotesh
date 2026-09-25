package Recursion;
import java.util.Scanner;
public class SmithNumber {
	public static boolean isPrime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int n1=n;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		int primesum=0;
		while(n1>0)
		{
		
			for(int i=2;i<n1;i++)
			{
				if(isPrime(i) && n1%i==0)
				{
					primesum+=i;
					n1/=i;
					break;
				}
			}
			
		}
		System.out.print(sum==primesum?"Smith":"Not Smith");
	}

}
