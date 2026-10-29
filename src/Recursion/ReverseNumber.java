package Recursion;

public class ReverseNumber {
	public static int reverse(int n,int k)
	{
		if(n==0)
			return k;
		
		return reverse(n/10,k*10+n%10);
		
		
	}
	public static void main(String[] args)
	{
		System.out.println(reverse(2431,0));
	}
}
