package Preparation;

public class GcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=36;
		while(b!=0)
		{
			int c=a%b;
			a=b;
			b=c;
		}
		System.out.println(a+" is GCD");
		int d=(12*36)/a;
		System.out.println(d+" is LCM");
	}
}
