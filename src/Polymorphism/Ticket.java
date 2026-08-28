package Polymorphism;
import java.util.Scanner;
public class Ticket {
	public int sum(int members)
	{
		return members*200;
	}
	public int sum(int members,boolean isPremium)
	{
		if(isPremium)
		{
			return 350*members;
		}
		else
		{
			return 200*members;
		}
	}
	public int sum(int members,boolean isPremium,double discount)
	{
		int res;
		if(isPremium)
		{
			res=members*350;
		}
		else
		{
			res=members*200;
		}
		double d=res*discount/100;
		return (int)(res-d);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();
		int members=sc.nextInt();
		boolean isPremium=sc.nextBoolean();
		double discount=sc.nextDouble();
		System.out.println(t.sum(members));
		System.out.println(t.sum(members,isPremium));
		System.out.println(t.sum(members,isPremium,discount));
	}
}
