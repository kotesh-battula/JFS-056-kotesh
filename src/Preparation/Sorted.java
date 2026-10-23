package Preparation;
import java.util.*;
public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,1,3,6,8,9};
		boolean res=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				res=false;
				break;
			}
		}
		System.out.println(res?"sorted":"Not sorted");
	}
}
