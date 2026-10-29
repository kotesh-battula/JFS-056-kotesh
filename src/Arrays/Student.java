package Arrays;
import java.util.*;
public class Student {
	int rno;
	String name;
	public Student(int r,String n)
	{
		rno=r;
		name=n;
	}
	public String toString()
	{
		return "rno: "+rno+" "+"name:"+name;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		Student s1=new Student(1,"kotesh");
		Student s2=new Student(2,"Surya");
		ArrayList<Student> a=new ArrayList<>();
		a.add(s1);
		a.add(s2);
		System.out.println(Arrays.toString(arr));
		System.out.println(a);
	}
}
