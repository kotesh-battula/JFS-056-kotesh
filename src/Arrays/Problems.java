package Arrays;
import java.util.*;
public class Problems {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr1=new int[arr.length-1];
		int pos=sc.nextInt();
		for(int i=0;i<pos;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i=pos;i<arr1.length;i++)
		{
			arr1[i]=arr[i+1];
		}
		for(int i:arr1)
		{
			System.out.print(i+" ");
			
		}
	}
}
