package Collections;
import java.util.*;
public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int left=0;
		int right=s.length()-1;
		boolean res=true;
		s=s.toLowerCase();
		while(left<right)
		{
			if(s.charAt(right)!=s.charAt(left))
			{
				res=false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(res?"Palindrome":"Not a Palindrome");
	}
}
