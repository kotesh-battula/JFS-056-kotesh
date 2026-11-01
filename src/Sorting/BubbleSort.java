package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr= {6,3,7,4,2,5,8,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
