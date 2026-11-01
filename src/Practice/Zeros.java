package Practice;

import java.util.Arrays;

public class Zeros {
	public static void main(String[] args)
	{
		int[] arr= {1,4,6,0,3,6,0,9,6,5,0,8,};
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
