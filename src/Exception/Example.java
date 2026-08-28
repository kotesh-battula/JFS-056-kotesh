package Exception;

public class Example {
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		m1();
	}
	public static void main(String[] args)
	{
		m1();
	}
}

//stack overflow exception example it is