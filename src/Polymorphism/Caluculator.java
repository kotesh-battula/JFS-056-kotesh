package Polymorphism;
import java.util.Scanner;
public class Caluculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		System.out.println("This is example for method overloading");
		return a+b+c;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Caluculator cl=new Caluculator();
		System.out.println(cl.add(a, b));
		System.out.println(cl.add(a, b,c));
	}
}
