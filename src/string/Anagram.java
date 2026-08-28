package string;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		boolean res=true;
		if(s1.length()==s2.length())
		{
		for(int i=0;i<s1.length();i++)
		{
				if(s2.indexOf(s1.charAt(i))==-1)
				{
					res=false;
				}
		}
		System.out.println(res?"Anagram":"Not an Anagram");
		}
		else
		{
			System.out.println("Not an angram");
		}
		
	}
}
