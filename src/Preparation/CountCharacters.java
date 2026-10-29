package Preparation;
import java.util.Scanner;
public class CountCharacters {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] st=s.toCharArray();
		for(int i=0;i<st.length;i++)
		{
			int c=1;
			if(st[i]==' ')
			{
				continue;
			}
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j])
				{
					c++;
					st[j]=' ';
				}
			}
			System.out.println(st[i]+" :"+c);
		}
	}
}
