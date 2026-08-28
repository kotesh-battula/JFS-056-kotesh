package Collections;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<>();
		v.add("Koti");
		v.add("Balu");
		v.add("Battula");
		v.remove("Balu");
		v.add(new String("SVN"));
		System.out.println(v);
	}
}
