package Preparation;
import java.util.*;
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,6,4,7,89};
		int[] arr1=new int[arr.length];
		int j=0;
		for(int i:arr)
		{
			arr1[j++]=i;
		}
		 
		int[] arr2=Arrays.copyOf(arr1,arr1.length);
		 
		arr2[2]=50;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
