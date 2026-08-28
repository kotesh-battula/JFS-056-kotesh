package Task2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Role:");
		String choose=sc.next();
		if(choose.equalsIgnoreCase("developer"))
		{
			System.out.print("Enter Employee Id: ");
			int eid=sc.nextInt();
			System.out.print("Enter Employee Name: ");
			String ename=sc.next();
			System.out.print("Enter Employee Salary: ");
			int salary=sc.nextInt();
			System.out.print("Enter Employee Program: ");
			String pr=sc.next();
			sc.nextLine();
			System.out.print("Enter Employee Project: ");
			String project=sc.nextLine();
			System.out.println("Developer Details");
			Developer d=new Developer(eid,ename,salary,pr,project);
			d.setEmpName("Battula Kotesh");
			d.displayDetails();
		}
		else if(choose.equalsIgnoreCase("tester"))
		{
			System.out.print("Enter Employee Id: ");
			int eid=sc.nextInt();
			System.out.print("Enter Employee Name: ");
			String ename=sc.next();
			System.out.print("Enter Employee Salary: ");
			int salary=sc.nextInt();
			System.out.print("Enter Testing Tool:");
			String tt=sc.next();
			System.out.print("Enter Automation Type");
			String at=sc.next();
			System.out.println("Tester Details");
			Tester t=new Tester(eid,ename,salary,tt,at);
			t.displaydetails();
		}
		
	}
}
