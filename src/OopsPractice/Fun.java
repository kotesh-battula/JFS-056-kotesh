package OopsPractice;
import java.util.Scanner;
public class Fun {
	Fun(Scanner s)
	{
	
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Fun f=new Fun(sc);
	}
}
