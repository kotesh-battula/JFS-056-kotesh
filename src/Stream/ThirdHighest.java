package Stream;
import java.util.*;
public class ThirdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(3,5,4,7,8));
		al.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);
		int k=al.stream().reduce(1,(a,b)->a*b);
		System.out.println(k);
	}

}
