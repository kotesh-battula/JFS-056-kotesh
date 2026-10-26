package Preparation;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
		for(Character ch:s.toCharArray())
		{
			if(Character.isLetter(ch))
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		for(Character ch:hm.keySet())
		{
			System.out.println(ch+":"+hm.get(ch));
		}
	}
}
