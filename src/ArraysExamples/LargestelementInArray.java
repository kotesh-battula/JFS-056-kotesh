package ArraysExamples;

public class LargestelementInArray {
	public static void main(String[] args)
	{
		
		int[] arr= {4,2,6,8,5,9,16};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.print(max);
	}
}
