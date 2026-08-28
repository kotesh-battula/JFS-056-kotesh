package Collections;
import java.util.*;
public class Student implements Comparable<Student> {
	int rno;
	String name;
	int marks;
	public Student(int r,String n,int m)
	{
		rno=r;
		name=n;
		marks=m;
	}
	public String toString()
	{
		return rno +" "+name+" "+marks;
	}
	@Override
	public int compareTo(Student s) {

	    int result = Integer.compare(this.rno,s.rno);

	    if (result == 0) {
	        result = this.name.compareTo(s.name);
	    }

	    if (result == 0) {
	        result = Integer.compare(this.marks,s.marks);
	    }

	    return result;
	}
	public static void main(String[] args)
	{
		TreeSet<Student> set=new TreeSet<>();
		set.add(new Student(1,"Kotesh",76));
		set.add(new Student(2,"Kotesh",78));
		set.add(new Student(1,"Balu",90));
		set.add(new Student(1,"Balu",90));
		System.out.println(set);
	}
}
