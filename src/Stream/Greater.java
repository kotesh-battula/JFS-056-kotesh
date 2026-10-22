package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Greater {
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(10,20,40,40,23,54));
		al=(ArrayList<Integer>) al.stream().map(n->n*5).toList();
		System.out.println(al);
	}
}
