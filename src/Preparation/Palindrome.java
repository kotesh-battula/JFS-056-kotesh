package Preparation;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=151;
		int k=n;
		int s=0;
		while(n>0)
		{
			s++;
			n/=10;
		}
		System.out.println(s);
	}
}
