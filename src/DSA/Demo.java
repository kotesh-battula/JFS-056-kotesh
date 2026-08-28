package DSA;
import java.util.*;
public class Demo {
	public static void main(String[] args)
	{
		Array a1=new Array(1,"kotesh");
		Array a2=new Array(2,"Balu");
		Array a3=new Array(4,"Siva");
		Array[] a= {a1,a2,a3,a3};
		for(Array i:a)
		{
			System.out.print(i.empid);
			System.out.println(i.empname);
		}
		List<Integer> ls=Arrays.asList(2,5,7,4);
		System.out.println(ls);
		
		int[] k= {4,3,2,5,8};
		Arrays.sort(k);
		int index=Arrays.binarySearch(k,3);
		System.out.println(index);
		
		System.out.println(Arrays.toString(k));
		int[] k1=Arrays.copyOf(k,k.length-1);
	    System.out.println(Arrays.toString(k1));	
	}
}
