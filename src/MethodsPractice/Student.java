package MethodsPractice;
import java.util.*;
public class Student {
	int id;
	String name;
	float percentage;
	static Student[] s=new Student[20];
	static int index=0;
	public Student(int id,String name,float percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	public static void addStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter Percentage: ");
		float percentage=sc.nextFloat();
		Student s1=new Student(id,name,percentage);
		s[index++]=s1;
		System.out.println("Added details successfully");
	}
	public static void displayStudent()
	{
		if(index<=0)
		{
			System.out.println("No records");
			return;
		}
		for(int i=0;i<index;i++)
		{
			System.out.println(s[i].id);
			System.out.println(s[i].name);
			System.out.println(s[i].percentage);
		}
	}
	public static void checkStudent()
	{
		Scanner sc=new Scanner(System.in);
		String target=sc.next();
		boolean res=true;
		for(int i=0;i<index;i++)
		{
			if((s[i].name).equalsIgnoreCase(target))
			{
				res=true;
				break;
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
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("1.Add student \n2.Display Student \n3.Check Student \n4.Exit");
		do {
			
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:addStudent();break;
			case 2:displayStudent();break;
			case 3:checkStudent();break;
			case 4:System.out.println("Exit .. Thanks for Using");return;
			default:System.out.println("Enter valid choice");
			}
		}while(choice!=4);
	}
}
