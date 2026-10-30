package Practice;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			String s1=arr[i];
			for(int j=s1.length()-1;j>=0;j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
