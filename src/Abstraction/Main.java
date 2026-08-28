package Abstraction;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("pizza"))
		{
			Restaurant r=new Pizza();
			String name=sc.next();
			String location=sc.next();
			r.details(name,location);
			r.displayDetails();
		}
		else if(choice.equalsIgnoreCase("Biryani"))
		{
			Restaurant r=new Biryani();
			String name=sc.next();
			String location=sc.next();
			r.details(name,location);
			r.displayDetails();
		}
		else if(choice.equalsIgnoreCase("Bakery"))
		{
			Restaurant r=new Bakery();
			String name=sc.next();
			String location=sc.next();
			r.details(name,location);
			r.displayDetails();
		}
	}
}
