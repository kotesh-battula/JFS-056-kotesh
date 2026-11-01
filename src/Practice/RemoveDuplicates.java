package Practice;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,3,6,8,3,5,7,5,7,4};
		Arrays.sort(arr);
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				arr[j]=arr[i];
			}
		}
		int[] arr1=Arrays.copyOf(arr, j+1);
		System.out.println(Arrays.toString(arr1));
	}
}
