package Iterator;
import java.util.*;
public class Demo {
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,5,3,8,5,3,7,9));
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			if(it.next()==9)
				System.out.println("Yes");
			System.out.println("value");
		}
	}
}
