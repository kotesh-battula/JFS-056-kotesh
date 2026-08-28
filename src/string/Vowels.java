package string;
import java.util.*;
public class Vowels {
	public static void vowels(String s)
	{
		char[] c=s.toCharArray();
		int count=0;
		int co=0;
		for(char ch:c)
		{
			if("aAeEiIoOuU".indexOf(ch)!=-1)
			{
				count++;
			}
			if(ch=='j'|| ch=='J')
			{
				co++;
			}
		}
		System.out.println(count);
		System.out.println(co);
	}
	public static void reverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s.equalsIgnoreCase(s1)?"Palindrome":"Not a Palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		vowels(s);
		reverse(s);
		
	}

}
