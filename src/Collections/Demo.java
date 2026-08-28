package Collections;
import java.util.Collection;
import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> fn=new ArrayList<>();
		fn.add("Mango");
		fn.add("Banana");
		fn.add("Apple");
		fn.remove("Banana");
		System.out.println(fn);
		Collection<String> fn1=new ArrayList<>();
		System.out.println(fn1.isEmpty());
	}

}
