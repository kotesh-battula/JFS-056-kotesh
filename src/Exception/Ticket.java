package Exception;
import java.util.*;
public class Ticket {
	public static boolean isTicket(boolean n) throws NoAvailabilityException
	{
		if(!n)
		{
			throw new NoAvailabilityException("NO Tickets are in Train");
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean b=sc.nextBoolean();
		try
		{
			System.out.println(isTicket(b));
		}
		catch(NoAvailabilityException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
