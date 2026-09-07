package DSA;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,89,18,37,49};
		int target=18;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				index=i;
			}
		}
		System.out.println(index!=-1?"found at index: "+index:"not found");
	}

}
