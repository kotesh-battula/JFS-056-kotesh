package Exception;
import java.util.*;
public class Ration {
	public static boolean isAvailable(int n,int stock)
	{
		 if(n>stock)
		 {
			 throw new NotEnoughException("Stock is not enough");
		 }
		 return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int stock=sc.nextInt();
		int n=sc.nextInt();
		try {
			System.out.println(isAvailable(n,stock));
		}
		catch(NotEnoughException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
