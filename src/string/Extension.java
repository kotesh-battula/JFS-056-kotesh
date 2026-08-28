package string;
import java.util.Scanner;
public class Extension {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=s.indexOf(".");
		String s2=s.substring(k);
		System.out.println(s2);
	}
}
