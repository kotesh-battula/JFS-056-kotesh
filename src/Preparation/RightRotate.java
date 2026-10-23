package Preparation;
import java.util.*;
public class RightRotate {
	public static void Rotate(int[] arr,int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int k=4;
		Rotate(arr,0,arr.length-1);
		Rotate(arr,0,k-1);
		Rotate(arr,k,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
