package Sample;

public class Loop {
	public static void main(String[] args)
	{
		int n=1;
		while(n<=5)
		{
			if(n==2)
			{
				n++ ;
				continue;
			}
			System.out.println(n);	
			n++;
		}
		
	}

}
