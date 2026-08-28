package Arrays;
import java.util.*;
public class Missing {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int k=n+1;
		int total=k*(k+1);
		total/=2;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int missing=total-sum;
		System.out.println(missing);
	}
}
