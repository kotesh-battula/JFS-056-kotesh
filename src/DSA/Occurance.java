package DSA;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(Character ch:s.toCharArray())
		{
			if(ch!=' ')
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		System.out.println(hm);
	}

}
