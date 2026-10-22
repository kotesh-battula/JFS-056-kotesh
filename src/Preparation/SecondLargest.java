package Preparation;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,6,3,2,6};
		int largest=Integer.MIN_VALUE;
		int slargest=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>largest)
			{
				slargest=largest;
				largest=i;
			}
			else if(i>slargest && i!=largest)
			{
				slargest=i;
			}
		}
		System.out.println(slargest);
	}
}
