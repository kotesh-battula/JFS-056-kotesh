package Collections;
import java.util.*;
public class Kotesh {
	int rno;
	String name;
	public Kotesh(int r,String n)
	{
		rno=r;
		name=n;
	}
	@Override
	public String toString()
	{
		return rno+" "+name;
	}
	public int hashCode()
	{
		return Objects.hash(rno,name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kotesh k1=new Kotesh(1,"kotesh");
		Kotesh k2=new Kotesh(1,"kotesh");
		HashSet<Kotesh> hs=new HashSet<>();
		hs.add(k1);
		hs.add(k2);
		hs.add(k1);
		System.out.println(hs);
	}
}
