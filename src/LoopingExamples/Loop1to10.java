package LoopingExamples;

public class Loop1to10 {
	public static void main(String[] args)
	{
		int n=5;
		int val=1;
		for(int i=1;i<=n;i++)
		{
			val*=i;
		}
		System.out.print(val);
	}
}
