package Practice;

import java.util.Scanner;

public class FirstRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(char ch:s.toCharArray())
		{
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				System.out.println(ch+" is the first repeating character");
				break;
			}
		}
	}
}
