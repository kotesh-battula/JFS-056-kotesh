package LoopingExamples;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int num=9;
		boolean res=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				res=false;
			}
		}
		if(res)
		{
			System.out.print("Prime");
		}
		else
		{
			System.out.print("not a prime");
		}
	}

}
