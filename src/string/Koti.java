package string;
import java.util.*;
public class Koti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
