package Exception;
import java.util.*;
public class Student {
	public static boolean eligible(int marks)
	{
		int per=(marks/100)*100;
		if(per<75)
		{
			throw new NotEligibleException("Marks aren't enough");
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		int m=sc.nextInt();
		try {
		eligible(m);
		}
		catch(NotEligibleException e)
		{
			e.printStackTrace();
		}
	}
}
