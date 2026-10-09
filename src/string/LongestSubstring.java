package string;
import java.util.Scanner;
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=Integer.MIN_VALUE;
		String m="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch) && Character.isLetter(ch) && Character.isLetterOrDigit(ch))
			{
				int n1=s.indexOf(ch);
				int n2=s.lastIndexOf(ch);
				int k=n2-n1;
				if(k>l)
				{
					l=k;
					m=s.substring(n1,n2);
				}
			}
		}
		System.out.println(m);
	}
}
