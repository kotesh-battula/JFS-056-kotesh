package Practice;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class NonRepeat {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch=s.charAt(i);
			if(arr[i]==' ')
				continue;
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
					arr[j]=' ';
				}
			}
			if(c>1)
			{
				System.out.print(ch+" ");
			}
		}
	}
}