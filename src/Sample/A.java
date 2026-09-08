package Sample;

public class A {
	public A(int a, int b)
	{
		System.out.println("A constructor");
	}
	public A(int a,int b,int c)
	{
		this(a,b);
		System.out.println("B constructor");
	}
	public static void main(String[] args)
	{
		A a=new A(5,7,8);
	}
}
