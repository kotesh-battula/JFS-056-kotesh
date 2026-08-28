package Arrays;
import java.util.*;
public class CountMap {
	public static void main(String[] args)
	{
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		String s="My name is Battula Koteswrarao and village is JmK";
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				if(map.containsKey(s.charAt(i)))
				{
					map.put(s.charAt(i),map.get(s.charAt(i))+1);
				}
				else
				{
					map.put(s.charAt(i),1);
				}
			}
		}
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey());
				break;
			}
		}
	}
}
