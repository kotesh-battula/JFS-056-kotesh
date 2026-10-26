package Preparation;
import java.util.Scanner;
public class StringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		int i=0;
		int j=s.length()-1;
		//s=s.toLowerCase();
		boolean res=true;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println("not a Palindrome");
				res=false;
				break;
			}
			i++;
			j--;
		}
		if(res)
			System.out.println("Palindrome");
	}
}
