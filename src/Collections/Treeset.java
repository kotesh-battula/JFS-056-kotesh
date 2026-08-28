package Collections;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<>(Arrays.asList(30,10,20,30,40,10));
		System.out.println(set);
		TreeSet<Integer> set1=new TreeSet<>();
		set1.add(20);
		set1.add(10);
		set1.add(40);
		set1.add(50);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.lower(20));
		System.out.println(set.higher(10));
	}
}
