package Collections;
import java.util.*;
public class MapCount {
	public static void main(String[] args)
	{
		TreeMap<Character,Integer> hm=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		for(int i=0;i<name.length();i++)
		{
			Character ch=name.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		for(Map.Entry<Character,Integer> map:hm.entrySet())
		{
			if(map.getValue()==1)
			{
				System.out.print(map.getKey()+": "+map.getValue()+" ");
			}
		}
		System.out.println();
		System.out.println(hm);
	}
}
