package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class ExactlyTwice {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char ch:s.toCharArray())
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		for(Character ch:hm.keySet())
		{
			if(hm.get(ch)==2)
			{
				System.out.print(ch+" ");
			}
		}
	}
}
