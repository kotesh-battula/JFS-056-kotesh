package DSA;
import java.util.*;
public class Series {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s="1234567890";
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.println(k);
				k=0;
			}
			k=k*10+(s.charAt(i)-'0');
		}
		System.out.print(k);
	}
}
