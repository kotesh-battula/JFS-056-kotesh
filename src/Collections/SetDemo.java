package Collections;
import java.util.*;
public class SetDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashSet<String> set=new HashSet<>();
		set.add("Kotesh");
		set.add("Battula");
		set.add("Balu");
		System.out.println(set);
		System.out.println(set.contains("KOTESH"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("Battula"));
		System.out.println(set);
		String[] arr=set.toArray(new String[0]);
		System.out.println(arr);
	}
}
