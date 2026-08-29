package Stream;
import java.util.*;
public class Demo {
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.stream().filter(n->n<30).forEach(System.out::println);
	}
}
