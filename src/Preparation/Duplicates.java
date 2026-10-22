package Preparation;
import java.util.*;
public class Duplicates
{
	public static void main(String[] args)
	{
		int[] arr= {3,5,6,2,5,6,7,8,5};
		Set<Integer> set=new HashSet<>();
		Set<Integer> set1=new HashSet<>();
		for(int i:arr)
		{
			if(!set.add(i) && set1.add(i))
			{
				System.out.println(i);
			}
		}
	}
}
