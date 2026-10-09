package Map;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			if(!Character.isWhitespace(c))
			{
				hm.put(c,hm.getOrDefault(c,0)+1);
			}
		}
		for(Map.Entry<Character,Integer> m:hm.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey());
				break;
			}
		}
	}
}
