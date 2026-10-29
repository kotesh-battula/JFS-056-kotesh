package Sorting;
import java.util.*;
public class Student implements Comparable<Student> {
	int rno;
	String name;
	public Student(int r,String n)
	{
		rno=r;
		name=n;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		Student s=(Student)obj;
		return rno==s.rno && Objects.equals(name,s.name);
	}
	public int compareTo(Student s)
	{
		return this.name.compareTo(s.name);
	}
	public int hashCode()
	{
		return Objects.hash(rno,name);
	}
	public String toString()
	{
		return rno+" "+name;
	}
	public static void main(String[] args)
	{
		Student s1=new Student(2,"Surya");
		Student s2=new Student(1,"kotesh");
		ArrayList<Student> ar=new ArrayList<>();
		Comparator<Student> k=(s3,s4)->Integer.compare(s3.rno,s4.rno);
		Comparator<Student> l=(s3,s4)->s3.name.compareTo(s4.name);
		ar.add(s1);
		ar.add(s2);
		Collections.sort(ar,l);
		System.out.println(ar);
		
	}
}
