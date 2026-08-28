package Sample;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Emp {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter experience: ");
		if(sc.hasNextByte())
		{
			byte a=sc.nextByte();
		}
		System.out.println("Enter Department: ");
		if(sc.hasNextShort())
		{
			short a=sc.nextShort();
		}
		System.out.println("Enter employee Id: ");
		if(sc.hasNextInt())
		{
			int a=sc.nextInt();
		}
		System.out.println("Enter Mobile: ");
		if(sc.hasNextLong())
		{
			long a=sc.nextLong();
		}
		System.out.println("Enter height: ");
		if(sc.hasNextFloat())
		{
			float a=sc.nextFloat();
		}
		System.out.println("Enter Name: ");
		if(sc.hasNext())
		{
			String a=sc.next();
		}
		sc.nextLine();
		System.out.println("Enter FullName: ");
		if(sc.hasNextLine())
		{
			String a=sc.nextLine();
		}
		System.out.println("Enter Marital status: ");
		if(sc.hasNext())
		{
			char a=sc.next().charAt(0);
		}
		System.out.println("Enter Aadhar: ");
		if(sc.hasNextBigInteger())
		{
			BigInteger a=sc.nextBigInteger();
		}
		System.out.println("Enter Bonus: ");
		if(sc.hasNextBigDecimal())
		{
			BigDecimal a=sc.nextBigDecimal();
		}
		sc.close();
	}
}
