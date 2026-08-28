package Encapsulation;
import java.util.Scanner;
public class Recharge {
	private long mobilenumber;
	private String name;
	private int amount;
	
	public void setDetails(long mobilenumber,String name,int amount)
	{
		if(mobilenumber>=1000000000L && mobilenumber<=9999999999L)
		this.mobilenumber=mobilenumber;
		else
			System.out.println("Enter 10 digit number");
		this.name=name;
		if(amount>10)
		this.amount=amount;
		else
			System.out.println("Enter valid amount");
	}
	public long getmobileNumber()
	{
		return mobilenumber;
	}
	public String getName()
	{
		return name;
	}
	public int getAmount()
	{
		return amount;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Recharge rc=new Recharge();
		System.out.print("Enter Number: ");
		long mobile=sc.nextLong();
		System.out.print("Enter Name: ");
		String name=sc.next();
		System.out.print("Enter Amount: ");
		int amount=sc.nextInt();
		rc.setDetails(mobile,name,amount);
		System.out.println("The Details are: ");
		System.out.println(rc.getmobileNumber()+" "+rc.getName()+" "+rc.getAmount());
	}
	
}
