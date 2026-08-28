package string;
import java.util.Scanner;
public class Binary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		while(n>0)
		{
			s=n%2+s;
			n/=2;
		}
		int k=Integer.valueOf(s);
		System.out.println(k);
	}
}
