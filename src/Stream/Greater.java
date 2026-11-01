package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Greater {
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(10,20,40,40,23,54));
		List<Integer> al1= al.stream().map(n->n*5).toList();
		System.out.println(al1);
	}
}
