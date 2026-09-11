package DSA;
import java.util.*;
public class ReverseArray {
	public static void reversearray(int[] arr)
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {6,4,8,5,2,6,9};
		reversearray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
