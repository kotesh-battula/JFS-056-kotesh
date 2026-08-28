package Collections;
import java.util.*;
public class MapSen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> map=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String k=arr[i];
			if(map.containsKey(k))
			{
				map.put(k,map.get(k)+1);
			}
			else
			{
				map.put(k,1);
			}
		}
		System.out.println(map);
	}

}
