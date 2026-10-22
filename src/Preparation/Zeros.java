package Preparation;
import java.util.*;
public class Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,0,3,0,5,7};
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[j++]=arr[i];
			}
		}
		while(arr.length>j)
		{
			arr[j++]=0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
