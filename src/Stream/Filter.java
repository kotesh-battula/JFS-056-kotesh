package Stream;
import java.util.*;
public class Filter {
	public static void main(String[] args)
	{
		List<Integer> ar= Arrays.asList(1,3,2,4,6,4,2,2,46,1,9);
		ar.stream().filter(n->n>10).forEach(n->System.out.println(n));
	}
}
