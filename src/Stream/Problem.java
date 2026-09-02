package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(
			    Arrays.asList(10, 25, 30, 15, 40, 25, 50, 30, 60, 45));
		List<Integer> l=al.stream().distinct().filter(n->n>25).sorted(Comparator.reverseOrder()).map(n->n*2).toList();
		System.out.println(l);
		List<Integer> numbers =
			    Arrays.asList(10, 20, 10, 30, 20, 40, 30, 50);
		LinkedHashSet<Integer> hs=new LinkedHashSet<>(numbers);
		System.out.println(hs);
	}

}
