package DSA;
import java.util.*;
public class Zerosmove {
	public static void move(int[] arr)
	{
		int slow=0;
		for(int fast=0;fast<arr.length;fast++)
		{
			if(arr[fast]!=0)
			{
				int temp=arr[slow];
				arr[slow]=arr[fast];
				arr[fast]=temp;
				slow++;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {5,7,40,8,7,0,6,4,0,4,0,6,7};
		move(arr);
		System.out.println(Arrays.toString(arr));
	}
}
