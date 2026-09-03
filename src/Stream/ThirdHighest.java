package Stream;
import java.util.*;
public class ThirdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(32,56,41,87,65,32,41,67,98));
		al.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);
	}

}
