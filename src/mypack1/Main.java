package mypack1;
import mypack2.A;
public class Main extends A {
	public static void main(String[] args)
	{
		Student s=new Student();
		A a=new A();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
		//System.out.println(s.d);
	}
}
