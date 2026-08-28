package string;
import java.util.Scanner;
public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			if(s1.indexOf(s.charAt(i))==-1)
			{
				for(int j=0;j<s.length();j++)
				{
				    if(s.charAt(i)==s.charAt(j))
				    {
					  count++;
				    }
				 }
				s1=s1+s.charAt(i);
				System.out.println(s.charAt(i)+" "+count);
			}
			
		}
	}

}
