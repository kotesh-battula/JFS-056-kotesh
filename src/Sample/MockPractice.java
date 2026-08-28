package Sample;
import java.util.*;
public class MockPractice {
	public static void main(String[] args)
	{
		Integer a=10;
		Integer b=10;
		System.out.println(a==b);	
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put(null,10);
		hm.put(null, 20);
		System.out.println(hm.get(null));
		
	}
}
