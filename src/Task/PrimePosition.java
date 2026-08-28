package Task;
import java.util.*;
public class PrimePosition {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			boolean res=true;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					res=false;
				}
			}
			if(res)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" are the positions of prime numbers in array");
	}
}
