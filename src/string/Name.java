package string;
import java.util.Scanner;
public class Name {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String surname=sc.next();
		String fullname=name+"."+surname.substring(0,2);
		System.out.println(fullname);
	}
}
