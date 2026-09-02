package Iterator;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(10,20,34,40,30,50,56,60));
		ListIterator<Integer> it=al.listIterator();
		while(it.hasNext())
		{
			int a=it.next();
			System.out.println(it.previous());
			System.out.println(a);
			it.next();
		}
	}

}
