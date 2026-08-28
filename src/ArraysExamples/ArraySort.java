package ArraysExamples;
import java.util.*;
public class ArraySort {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter at what u want array sorted:");
		int target=sc.nextInt();
		for(int i=0;i<target;i++)
		{
			for(int j=0;j<target;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
