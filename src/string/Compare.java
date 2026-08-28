package string;
import java.util.Scanner;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		String s3="";
		int l=(s1.length()>s2.length()?s1.length():s2.length());
		System.out.println(l);
		for(int i=0;i<l;i++)
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)!=-1 && s3.indexOf(ch)==-1)
			{
				s3+=ch;
			}
			else if(s3.indexOf(ch)==-1)
			{
				s3+="+";
			}
		}
		System.out.println(s3);
	}

}
