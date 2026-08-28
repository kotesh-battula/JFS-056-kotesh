package Collections;
import java.util.*;
public class AnagramMap {
	public static void main(String[] args)
	{
		HashMap<String,List<String>> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.next().split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			String s1=new String(ch);
			if(map.containsKey(s1))
			{
				map.get(s1).add(s);
			}else
			{
				ArrayList<String> al=new ArrayList<>();
				al.add(s);
				map.put(s1, al);
			}
		}
		
		
	}
}
