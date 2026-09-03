package Stream;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(78,54,98,43,25,75);
		Integer[] arr=list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
		int[] ar= {5,3,21,8,96};
		List<Integer> ls=Arrays.stream(ar).boxed().toList();
		System.out.print(ls);
		
	}

}
