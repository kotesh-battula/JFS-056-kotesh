package Preparation;
import java.util.Scanner;
import java.util.Arrays;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int target=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				System.out.println("Target found at "+mid+" position");
				break;
			}
			else if(arr[mid]>target)
			{
				left--;
			}
			else
			{
				right++;
			}
		}
	}

}
