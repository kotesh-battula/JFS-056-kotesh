package MethodsPractice;
import java.util.*;
public class Fruit {
	String name;
	int price;
	String colour;
	static Fruit[] f=new Fruit[20];
	static int index=0;
	public Fruit(String name,int price,String colour)
	{
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	static void addFruit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Fruit name: ");
		String n=sc.next();
		System.out.print("Enter Price: ");
		int p=sc.nextInt();
		System.out.print("Enter Colour: ");
		String r=sc.next();
		f[index++]=new Fruit(n,p,r);
		System.out.println(index);
		System.out.println("Fruit is added Succesfully");
	}
	static void displayFruit()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(f[i].name);
			System.out.println(f[i].price);
			System.out.println(f[i].colour);
		}
	}
	static void checkFruit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fruit name to check: ");
		String target=sc.next();
		boolean res=true;
		for(int i=0;i<index;i++)
		{
			String s=f[i].name;
			if(s.equalsIgnoreCase(target))
			{
				res=true;break;
			}
			else
			{
				res=false;
			}
		}
		System.out.println(res==true?"Exist":"Not Exist");
	}
	public static void main(String[] args)
	{
		System.out.println("1.Add Fruit \n2.Display Fruit \n3.Check Fruit \n4.Exit");
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:addFruit();break;
			case 2:displayFruit();break;
			case 3:checkFruit();break;
			case 4:System.out.println("Exit");return;
			default:System.out.println("Enter valid choice");
			}
		}while(choice!=4);
	}
}
