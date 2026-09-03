package Stream;
import java.util.*;
public class StreamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=Arrays.asList("Kotesh","Battula","BAlu","Siva","anne","Battula");
		al.stream().distinct().filter(n->n.length()>5).forEach(System.out::println);
	}

}
