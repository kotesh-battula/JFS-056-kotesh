package Task;
import java.util.*;
public class Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter Array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr2=new int[n];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr2[j++]=arr[i];
			}
		}
		while(j<n)
		{
			arr2[j++]=0;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
