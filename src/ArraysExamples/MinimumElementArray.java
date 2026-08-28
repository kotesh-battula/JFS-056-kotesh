package ArraysExamples;

public class MinimumElementArray {
	public static void main(String[] args)
	{
		
		int[] arr= {4,2,6,8,5,9,16};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.print(min);
	}
}
