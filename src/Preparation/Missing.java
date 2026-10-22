package Preparation;
import java.util.*;
public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,5};
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		int n=arr.length+1;
		int Total=n*(n+1)/2;
		System.out.println(Total-sum);
	}

}
