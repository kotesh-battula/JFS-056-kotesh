package DSA;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(1,5,3,7,9));
		ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(1,5,3,7,9));
		if(a1.get(2)==a2.get(2))
		{
			System.out.print("Yes");
		}
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
	}

}
