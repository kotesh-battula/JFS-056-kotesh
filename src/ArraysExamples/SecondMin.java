package ArraysExamples;
import java.util.Scanner;
public class SecondMin {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int smin=arr[1];
		int max=arr[0];
		int smax=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin)
			{
				smin=arr[i];
			}
			if(max<arr[i])
			{
				smax=max;
				max=arr[i];
			}
			else if(smax<arr[i])
			{
				smax=arr[i];
			}
		}
		System.out.println("Minimum: "+min);
		System.out.println("Second Minimum: "+smin);
		System.out.println("Maximum: "+max);
		System.out.println("Second Maximum: "+smax);
	}

}
