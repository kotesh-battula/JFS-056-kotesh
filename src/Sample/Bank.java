package Sample;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Mini Statement");
		System.out.println("5. Exit");
		
		System.out.print("Enter a number");
		int number=sc.nextInt();
		switch(number)
		{
		case 1:System.out.print("Your balance is ₹25,000");break;
		case 2:System.out.print("Enter amount to deposit");break;
		case 3:System.out.print("Enter amount to withdraw");break;
		case 4:System.out.print("Displaying the mini statement");break;
		case 5:System.out.print("Thank you for you using ATM");break;
		default:System.out.print("enter a valid service");
		}
	}
}
