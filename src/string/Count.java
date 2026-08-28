package string;
import java.util.*;
public class Count {
	public static void main(String[] args)
	{
		String s="Javaj";
		int c=0;
		for(char ch:s.toCharArray())
		{
			if(ch=='j' || ch=='J')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
