package Preparation;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int s=1;
		for(int i=1;i<=p;i++)
		{
			s*=n;
		}
		System.out.print(s);
	}

}
