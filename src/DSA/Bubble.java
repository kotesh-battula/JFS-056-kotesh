package DSA;
import java.util.Arrays;
public class Bubble {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,5,6,8,4};
		for(int i=0;i<arr.length-1;i++)
		{
			boolean res=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					res=true;
				}
			}
			if(!res)break;
		}
		System.out.print(Arrays.toString(arr));
	}
}
