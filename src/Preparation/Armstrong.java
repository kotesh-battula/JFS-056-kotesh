package Preparation;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int k1=n;
		int sum=0;
		int c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		while(k1>0)
		{
			int d=k1%10;
			sum=(int) (sum+(Math.pow(d, c)));
			k1/=10;
		}
		System.out.println(sum==k?"Armstrong":"Not Armstrong");
	}
}
