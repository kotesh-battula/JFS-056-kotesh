package Collections;
import java.util.*;
public class ListDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		list.add("Kotesh");
		list.add("Balu");
		list.add("ashok");
		System.out.println(list);
		list.remove("Balu");
		System.out.println(list);
		list.set(list.indexOf("Kotesh"),"Mahesh");
		System.out.println(list);
		Integer[] arr = {10, 20, 10, 30, 20, 40};
		HashSet<Integer> set=new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
	}
}
