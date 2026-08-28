package Task;
import java.util.*;
public class Positive {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr= {3,6,9,-3,6,-1,-4,-22,45,99};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>0)
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
