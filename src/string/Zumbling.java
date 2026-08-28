package string;
import java.util.*;
public class Zumbling {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i%2==0)
			{
				s1+=Character.toUpperCase(ch);
			}
			else
			{
				s1+=ch;
			}
		}
		System.out.println(s1);
		int k=1;
		for(int i=s.length()-1;i>=0;i=i-2)
		{
			if(i%2!=0)
			{
				s1+=s.replace(s.charAt(k),s.charAt(i));
				k+=2;
			}
		}
		System.out.println(s1);
	}
}
