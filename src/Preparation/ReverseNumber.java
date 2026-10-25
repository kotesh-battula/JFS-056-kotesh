package Preparation;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=156;
		int k=0;
		while(n>0)
		{
			k=k*10+(n%10);
			n/=10;
		}
		System.out.println(k);
	}
}
