package MethodsPractice;
import java.util.Scanner;
public class ATM {
	static int balance=20000;
	public void balance()
	{
		System.out.println("Balance: "+balance);
	}
	public void deposit(int amount)
	{
		balance+=amount;
		System.out.println("Updated balance : "+balance);
	}
	public void withdraw(int amount)
	{
		balance-=amount;
		System.out.println("Balance after withdraw: "+balance);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ATM a=new ATM();
		a.balance();
		System.out.print("Enter amount to add:");
		int n=sc.nextInt();
		a.deposit(n);
		System.out.print("Enter amount to withdraw:");
		int m=sc.nextInt();
		a.withdraw(m);
	}
}
