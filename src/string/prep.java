package string;
import java.util.*;
public class prep {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		String s1="";
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			s1=c+s1;
		}
		System.out.println(s1);
	}
}
