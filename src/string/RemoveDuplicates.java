package string;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args)
	{
		String s="Java programming";
		s=s.toLowerCase();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==-1 && ch!=' ')
			{
				s1+=ch;
			}
		}
		System.out.println(s1);
	}
}
