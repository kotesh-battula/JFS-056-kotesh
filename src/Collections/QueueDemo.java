package Collections;
import java.util.*;
public class QueueDemo {
	int rno;
	String name;
	public QueueDemo(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public static void main(String[] args)
	{
		QueueDemo o1=new QueueDemo(1,"Kotesh");
		QueueDemo o2=new QueueDemo(2,"Balu");
		HashSet<QueueDemo> q=new HashSet<>();
		q.add(o1);
		q.add(o2);
		System.out.println(q);
	}
}
	