package Preparation;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,65,3,7,92,87};
		int min=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(min<i)
			{
				min=i;
			}
		}
		System.out.println(min);
	}

}
