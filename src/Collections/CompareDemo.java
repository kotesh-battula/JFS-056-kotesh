package Collections;
import java.util.*;
public class CompareDemo implements Comparable<CompareDemo>{
	int rno;
	String name;
	int marks;
	public CompareDemo(int r,String n,int m)
	{
		rno=r;
		name=n;
		marks=m;
	}
	public int compareTo(CompareDemo c)
	{
		int result=Integer.compare(this.rno,c.rno);
		if(result==0)
			result=this.name.compareTo(c.name);
		if(result==0)
			result=Integer.compare(this.marks, c.marks);
		return result;
	}
	public String toString()
	{
		return rno+" "+name+" "+marks;
	}
	public static void main(String[] args)
	{
		TreeSet<CompareDemo> set=new TreeSet<>();
		CompareDemo c1=new CompareDemo(1,"Kotesh",76);
		CompareDemo c2=new CompareDemo(2,"Rajesh",75);
		CompareDemo c3=new CompareDemo(3,"Mahesh",89);
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.lower(c3));
		PriorityQueue<CompareDemo> queue=new PriorityQueue<>();
		queue.offer(c2);
		queue.offer(c3);
		queue.offer(c1);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
