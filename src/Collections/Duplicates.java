package Collections;
import java.util.*;
public class Duplicates {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(50);
		for(Integer i:list)
		{
			if(!set.contains(i))
			{
				set.add(i);
			}
		}
		System.out.println(set);
	}
}
