package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,30,20,40,20,40,60,42);
		Map<Integer,Integer> map=list.stream().collect(Collectors.toMap(n->n, n->n*2,(oldvalue,newvalue)->newvalue));
		System.out.println(map);
	}

}
