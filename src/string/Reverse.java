package string;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args)
	{
		String s="I am java developer";
		String[] s1=s.split(" ");
		String f="";
		for(int i=s1.length-1;i>=0;i--)
		{
			f=f+s1[i]+" ";
		}
		System.out.println(f);
		
	}
}
