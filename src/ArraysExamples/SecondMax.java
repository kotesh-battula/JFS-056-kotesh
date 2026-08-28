package ArraysExamples;
import java.util.Scanner;
public class SecondMax {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int smax=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
	}

}
