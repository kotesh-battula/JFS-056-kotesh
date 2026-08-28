package Task;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Id:");
		int did=sc.nextInt();
		System.out.println("Enter Doctor Name:");
		String dname=sc.next();
		System.out.println("Enter Specialization:");
		String spec=sc.next();
		System.out.println("Enter Surgery Type:");
		String type=sc.next();
		System.out.println("Enter years of Experience:");
		int exp=sc.nextInt();
		Surgeon s=new Surgeon(did,dname,spec,type,exp);
		s.displayDetails();
		System.out.println(s.getDoctorName());
	}
	
}
