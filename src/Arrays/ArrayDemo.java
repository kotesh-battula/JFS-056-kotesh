package Arrays;
import java.util.*;
public class ArrayDemo {
	public static void maain(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i:arr)
		{
			if(i<min)
			{
				min=i;
			}
			if(i>max)
			{
				max=i;
			}
		}
		System.out.print(sum);
		System.out.print(avg);
		System.out.print(min);
		System.out.print(max);
		sc.close();
	}
}
