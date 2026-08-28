package Polymorphism;
import java.util.Scanner;
public class Bill {
	public void caluculate(int units)
	{
		System.out.println(units*8);
	}
	public static void caluculate(int units,double service)
	{
		int bill=units*8;
		bill=(int)(bill+service);
		System.out.println(bill);
	}
	public static void caluculate(int units,double service,double tax)
	{
		int bill=units*8;
		bill+=(int)(service);
		int b=(int)(bill*tax)/100;
		System.out.println(bill-b);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double s=sc.nextDouble();
		double t=sc.nextDouble();
		caluculate(n,s);
	}
}
