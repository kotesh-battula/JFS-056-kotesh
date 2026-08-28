package MethodsPractice;
import java.util.Random;
public class Welcome{
	public static void display()
	{
		System.out.println("Hi Welcome to Codegnan");
	}
	public int number()
	{
		Random r=new Random();
		int n=r.nextInt();
		return n;
	}
	public int sum(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Welcome w=new Welcome();
		display();
		System.out.println(w.number());
		System.out.println(w.sum(3, 7));
	}
}
