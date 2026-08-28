package Sample;
import java.util.Scanner;
public class Food {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("1. Pizza");
		System.out.print("2. Burger");
		System.out.print("3. Sandwich");
		System.out.print("4. Biryani");
		System.out.println("5. Coffee");
		
		System.out.print("Enter your Order");
		int order=sc.nextInt();
		switch(order)
		{
		case 1:
			System.out.println("Pizza");
			System.out.print("Price 100 Rs");break;
		case 2:
			System.out.println("Burger");
			System.out.print("Price 130");break;
		case 3:
			System.out.println("Sandwich");
			System.out.print("Price 150");break;
		case 4:
			System.out.println("Biryani");
			System.out.print("Price 200");break;
		case 5:
			System.out.println("Coffee");
			System.out.print("Price 100");break;
		default:System.out.print("Out of Stock");
		}
	}
}
