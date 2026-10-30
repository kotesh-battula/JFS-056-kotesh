package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Mostrepeat {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char ch:s.toCharArray())
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		int max=0;
		char ch1=' ';
		for(Character ch:hm.keySet())
		{
			int n=hm.get(ch);
			if(max<n)
			{
				max=n;
				ch1=ch;
			}
		}
		System.out.print(ch1);
	}
}
