package Collections;
import java.util.*;
public class ListExample {
	public static void Example(ArrayList<Integer> list)
	{
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println(list.get(2));
		int a=list.indexOf(10);
		list.set(a, 40);
		list.remove(Integer.valueOf(40));
		System.out.println(list.contains(50));
		System.out.println(list.size());
		System.out.println(list);
		int c=0;
		for(Integer i:list)
		{
			if(i==20)
			{
				c++;
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		Example(list);
	}
}
