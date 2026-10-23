package Preparation;
import java.util.Arrays;
public class LeftRotate {
	public static void RotateArray(int[] arr,int start,int end)
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
		int k=3;
		RotateArray(arr,0,k-1);
		RotateArray(arr,k,arr.length-1);
		RotateArray(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
