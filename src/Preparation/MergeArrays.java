package Preparation;
import java.util.Arrays;
public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {7,8,9,10};
		int n=arr1.length+arr2.length;
		int[] arr3=new int[n];
		int j=0;
		for(int i:arr1)
		{
			arr3[j++]=i;
		}
		for(int i:arr2)
		{
			arr3[j++]=i;
		}
		System.out.println(Arrays.toString(arr3));
	}

}
