package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>(Arrays.asList("Kotesh","Harish","vivek","Balu","balU"));
		Set<String> set=al.stream().skip(2).limit(3).map(n->n.toUpperCase()).collect(Collectors.toSet());
		System.out.print(set);
	}

}
