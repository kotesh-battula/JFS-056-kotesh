package LoopingExamples;

public class Prime {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=2;i<=100;i++)
		{
			int fact=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					fact++;
				}
			}
			if(fact==0)
			{
				System.out.println(i);
				sum+=i;
			}
			
		}
		System.out.print(sum);
	}
}
