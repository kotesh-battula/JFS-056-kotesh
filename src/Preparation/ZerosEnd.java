package Preparation;
import java.util.*;
public class ZerosEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,7,0,5};
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
