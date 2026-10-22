package Preparation;
import java.util.*;
public class Duplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,5,3,1,2,5,3};
		for(int i=0;i<arr.length;i++)
		{
			boolean check=false;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					check=true;
				}
			}
			if(check)
				continue;
			for(int k=i+1;k<arr.length;k++)
			{
				if(arr[k]==arr[i])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
