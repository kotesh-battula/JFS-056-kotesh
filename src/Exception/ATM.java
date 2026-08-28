package Exception;
import java.util.*;
public class ATM {
	public static boolean isEligible(boolean expired) throws ATMExpiredException
	{
		if(!expired)
		{
			throw new ATMExpiredException("ATM Date is Expired");
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean res=sc.nextBoolean();
		try
		{
			System.out.println(isEligible(res));
		}
		catch(ATMExpiredException e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
}
